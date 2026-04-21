<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // 5. Retrieve values using request.getParameter()
    String weightStr = request.getParameter("weight");
    String heightStr = request.getParameter("height");
    
    double bmi = 0.0;
    String category = "";
    String formattedBmi = "";

    try {
        // Convert input values
        double weight = Double.parseDouble(weightStr);
        double height = Double.parseDouble(heightStr);

        // Calculate BMI
        bmi = weight / (height * height);
        
        // Format to 2 decimal places
        formattedBmi = String.format("%.2f", bmi);

        // Determine Category
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi <= 25) {
            category = "Normal";
        } else {
            category = "Overweight";
        }
    } catch (Exception e) {
        // Fallback for server-side validation bypassing
        out.println("<p style='color:red;'>An error occurred during calculation. Please ensure valid inputs.</p>");
        return;
    }
%>

<jsp:forward page="resultBMI.jsp">
    <jsp:param name="bmiValue" value="<%= formattedBmi %>" />
    <jsp:param name="bmiCategory" value="<%= category %>" />
</jsp:forward>