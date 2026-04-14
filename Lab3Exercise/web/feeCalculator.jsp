<%@ include file="header.jsp" %>

<h2>Membership Fee Calculator</h2>
<form method="GET">
    <p>
        <label>Number of activities joined:</label><br>
        <input type="number" name="activityCount" min="0" required>
    </p>
    <button type="submit">Calculate Total</button>
</form>

<%
    String countStr = request.getParameter("activityCount");
    if (countStr != null) {
        int count = Integer.parseInt(countStr);
        double totalFee = count * 10.0;
%>
    <h3>Calculation Result</h3>
    <p>Total Fee for <%= count %> activities: <strong>RM <%= String.format("%.2f", totalFee) %></strong></p>
<%
    }
%>

<%@ include file="footer.jsp" %>