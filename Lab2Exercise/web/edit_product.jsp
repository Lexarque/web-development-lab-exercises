<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.lab.model.Product" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>

<%
    Product product = (Product) request.getAttribute("product");
    if (product == null) {
%>
    <h2>Error: Product not found</h2>
    <a href="list">Back</a>
<%
        return;
    }
%>

<h2>Edit Product</h2>

<form action="update" method="post">
    <input type="hidden" name="id" value="<%= product.getId() %>" />

    <table border="0">
        <tr>
            <td>Product Name:</td>
            <td><input type="text" name="name" value="<%= product.getName() %>" required /></td>
        </tr>
        <tr>
            <td>Category:</td>
            <td><input type="text" name="category" value="<%= product.getCategory() %>" /></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><input type="number" step="0.01" name="price" value="<%= product.getPrice() %>" required /></td>
        </tr>
        <tr>
            <td>Quantity:</td>
            <td><input type="number" name="quantity" value="<%= product.getQuantity() %>" required /></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Update Product" />
            </td>
        </tr>
    </table>
</form>

<br>
<a href="list">Cancel and Go Back</a>

</body>
</html>