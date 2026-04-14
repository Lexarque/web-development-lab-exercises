/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab.dao;

import com.lab.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class StudentDAO {

    private final String jdbcURL = "jdbc:mysql://localhost:3777/web_development_class_db?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "wp";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public boolean registerStudent(Student student) {
        String INSERT_USERS_SQL = "INSERT INTO student_registrations (student_name, matric_no, selected_club) VALUES (?, ?, ?);";
        boolean rowInserted = false;

        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, student.getStudentName());
            preparedStatement.setString(2, student.getMatricNo());
            preparedStatement.setString(3, student.getSelectedClub());

            rowInserted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInserted;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList();
        String SELECT_ALL_SQL = "SELECT * FROM student_registrations";

        try (Connection conn = getConnection()) {
            PreparedStatement prepStmt = conn.prepareStatement(SELECT_ALL_SQL);
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {
                Student s = new Student();
                s.setStudentName(rs.getString("student_name"));
                s.setMatricNo(rs.getString("matric_no"));
                s.setSelectedClub(rs.getString("selected_club"));
                students.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
