<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>UMT FSKM - BMI Calculator System</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f9f9f9; }
        nav { background-color: #004d99; overflow: hidden; }
        nav a { float: left; color: white; text-align: center; padding: 14px 16px; text-decoration: none; }
        nav a:hover { background-color: #003366; }
        .container { padding: 20px; max-width: 800px; margin: auto; background: white; box-shadow: 0px 0px 10px rgba(0,0,0,0.1); margin-top: 20px; }
        table { width: 100%; border-collapse: collapse; margin-top: 15px; }
        th, td { border: 1px solid #ddd; padding: 10px; text-align: left; }
        th { background-color: #f2f2f2; }
        input[type="text"], input[type="submit"] { padding: 8px; margin: 5px 0; width: 100%; box-sizing: border-box; }
        input[type="submit"] { background-color: #004d99; color: white; border: none; cursor: pointer; }
        input[type="submit"]:hover { background-color: #003366; }
    </style>
</head>
<body>
    <nav>
        <a href="bmiCalculator.jsp">BMI Calculator</a>
        <a href="healthInfo.jsp">Health Information</a>
    </nav>
    <div class="container">
        <h2>Faculty of Computer Science and Mathematics, UMT</h2>
        <h3>Healthy Lifestyle Awareness Program</h3>
        <hr>