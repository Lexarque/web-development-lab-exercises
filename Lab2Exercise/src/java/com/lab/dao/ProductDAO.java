package com.lab.dao;

import java.sql.*;
import java.util.*;
import com.lab.model.Product;

public class ProductDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3777/web_development_class_db?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private String jdbcUsername = "root";
    private String jdbcPassword = "wp";

    private Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    // INSERT
    public void insertProduct(Product product) throws SQLException {
        String sql = "INSERT INTO products (name, category, price, quantity) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            System.out.println(product.getName());
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getCategory());
            stmt.setDouble(3, product.getPrice());
            stmt.setInt(4, product.getQuantity());

            stmt.executeUpdate();
        }
    }

    // SELECT ALL
    public List<Product> getAllProducts() throws SQLException {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products";

        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Product p = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getDouble("price"),
                        rs.getInt("quantity")
                );
                list.add(p);
            }
        }
        return list;
    }

    // UPDATE
    public void updateProduct(Product product) throws SQLException {
        String sql = "UPDATE products SET name=?, category=?, price=?, quantity=? WHERE id=?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, product.getName());
            stmt.setString(2, product.getCategory());
            stmt.setDouble(3, product.getPrice());
            stmt.setInt(4, product.getQuantity());
            stmt.setInt(5, product.getId());

            stmt.executeUpdate();
        }
    }

    // DELETE
    public void deleteProduct(int id) throws SQLException {
        String sql = "DELETE FROM products WHERE id=?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public Product getProductById(int id) throws SQLException {
        Product product = null;
        String sql = "SELECT * FROM products WHERE id=?";

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                product = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getDouble("price"),
                        rs.getInt("quantity")
                );
            }
        }
        return product;
    }
}
