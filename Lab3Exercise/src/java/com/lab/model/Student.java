/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentName;
    private String matricNo;
    private String selectedClub;

    // Default constructor
    public Student() {}

    // Getters and Setters
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getMatricNo() { return matricNo; }
    public void setMatricNo(String matricNo) { this.matricNo = matricNo; }

    public String getSelectedClub() { return selectedClub; }
    public void setSelectedClub(String selectedClub) { this.selectedClub = selectedClub; }
}
