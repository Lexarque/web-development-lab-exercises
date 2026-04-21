<%-- 9. Use JSP Page Directive to import Java classes --%>
<%@ page import="java.util.ArrayList" %>
<%@ include file="header.jsp" %>

<h4>Health Information & Categories</h4>

<%
    // Store BMI categories using an ArrayList
    ArrayList<String[]> bmiCategories = new ArrayList<String[]>();
    bmiCategories.add(new String[]{"BMI < 18.5", "Underweight"});
    bmiCategories.add(new String[]{"18.5 &le; BMI &le; 25", "Normal"});
    bmiCategories.add(new String[]{"BMI > 25", "Overweight"});
%>

<table>
    <tr>
        <th>BMI Range</th>
        <th>Category</th>
    </tr>
    <%-- Display the categories dynamically in a table --%>
    <%
        for(String[] cat : bmiCategories) {
    %>
    <tr>
        <td><%= cat[0] %></td>
        <td><%= cat[1] %></td>
    </tr>
    <%
        }
    %>
</table>

<%@ include file="footer.jsp" %>