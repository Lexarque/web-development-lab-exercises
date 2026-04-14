<%@ page import="java.util.ArrayList" %>
<%@ include file="header.jsp" %>

<h2>Club Member Directory (Live Memory)</h2>

<table>
    <thead>
        <tr>
            <th>No.</th>
            <th>Student Name</th>
            <th>Matric Number</th>
            <th>Club</th>
        </tr>
    </thead>
    <tbody>
        <%
            ArrayList<String[]> studentList = (ArrayList<String[]>) application.getAttribute("globalStudentList");

            if (studentList != null && !studentList.isEmpty()) {
                for (int i = 0; i < studentList.size(); i++) {
                    String[] student = studentList.get(i);
        %>
        <tr>
            <td><%= i + 1 %></td>
            <td><%= student[0] %></td>
            <td><%= student[1] %></td>
            <td><%= student[2] %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="4" style="text-align:center;">No students registered in the current session.</td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

<%@ include file="footer.jsp" %>