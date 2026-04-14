<%@ page import="java.util.ArrayList" %>
<%@ include file="header.jsp" %>

<%
    ArrayList<String[]> studentList = (ArrayList<String[]>) application.getAttribute("globalStudentList");

    if (studentList == null) {
        studentList = new ArrayList<>();
        application.setAttribute("globalStudentList", studentList);
    }

    String name = request.getParameter("studentName");
    String matric = request.getParameter("matricNo");
    String club = request.getParameter("selectedClub");

    if (name != null && matric != null) {
        String[] newStudent = {name, matric, club};
        studentList.add(newStudent);
    }
%>

<h2>Registration Successful</h2>
<div style="background: #d4edda; color: #155724; padding: 15px; border-radius: 5px;">
    <p>Student <strong><%= name %></strong> has been added to the temporary memory list!</p>
</div>

<p>
    <a href="memberDirectory.jsp" style="color: blue; font-weight: bold;">View Updated Directory &rarr;</a>
</p>
<p><a href="registerClub.jsp">Register Another Student</a></p>

<%@ include file="footer.jsp" %>