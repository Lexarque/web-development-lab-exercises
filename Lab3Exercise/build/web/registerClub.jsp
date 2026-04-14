<%@ include file="header.jsp" %>

<h2>Club Registration Form</h2>
<form action="processRegistration.jsp" method="POST">
    <p>
        <label>Student Name:</label><br>
        <input type="text" name="studentName" required>
    </p>
    <p>
        <label>Matric Number:</label><br>
        <input type="text" name="matricNo" required>
    </p>
    <p>
        <label>Select Club:</label><br>
        <select name="selectedClub">
            <option value="IT Society">IT Society</option>
            <option value="Math Club">Math Club</option>
            <option value="Cyber Security Club">Cyber Security Club</option>
            <option value="E-Sports Club">E-Sports Club</option>
        </select>
    </p>
    <button type="submit">Submit Registration</button>
</form>

<%@ include file="footer.jsp" %>