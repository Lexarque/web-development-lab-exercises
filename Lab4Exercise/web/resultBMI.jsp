<%@ include file="header.jsp" %>

<h4>Your BMI Result</h4>

<%
    String bmiValue = request.getParameter("bmiValue");
    String bmiCategory = request.getParameter("bmiCategory");
%>

<p><strong>Your Calculated BMI:</strong> <%= bmiValue != null ? bmiValue : "N/A" %></p>
<p><strong>Health Category:</strong> 
    <span style="color: <%= "Overweight".equals(bmiCategory) || "Underweight".equals(bmiCategory) ? "red" : "green" %>;">
        <%= bmiCategory != null ? bmiCategory : "N/A" %>
    </span>
</p>

<br>
<a href="bmiCalculator.jsp" style="text-decoration: underline; color: #004d99;">Calculate Another BMI</a>

<%@ include file="footer.jsp" %>