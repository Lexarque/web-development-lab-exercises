<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.lab.model.Product" %>

<!DOCTYPE html>
<html>
<head>
    <title>Product Inventory System</title>
</head>
<body>

<center>
    <h1>Product Management</h1>
    <h2><a href="add_product.jsp">Add New Product</a></h2>
</center>

<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Products</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Actions</th>
        </tr>

        <%
            List<Product> listProduct = (List<Product>) request.getAttribute("listProduct");
            if (listProduct != null) {
                for (Product product : listProduct) {
        %>
        <tr>
            <td><%= product.getId() %></td>
            <td><%= product.getName() %></td>
            <td><%= product.getCategory() %></td>
            <td>$<%= product.getPrice() %></td>
            <td><%= product.getQuantity() %></td>
            <td>
                <a href="edit?id=<%= product.getId() %>">Edit</a>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a href="delete?id=<%= product.getId() %>" 
                   onclick="return confirm('Are you sure you want to delete this product?')">
                   Delete
                </a>
            </td>
        </tr>
        <%
                }
            }
        %>

    </table>
</div>

</body>
</html>