<%@ include file="header.jsp" %>

<h4>Calculate Your BMI</h4>
<form action="processBMI.jsp" method="post" onsubmit="return validateForm()">
    <label for="weight">Weight (kg):</label>
    <input type="text" id="weight" name="weight" required>

    <label for="height">Height (m):</label>
    <input type="text" id="height" name="height" required>

    <input type="submit" value="Calculate BMI">
</form>

<script>
function validateForm() {
    var weight = document.getElementById("weight").value;
    var height = document.getElementById("height").value;

    if (isNaN(weight) || isNaN(height)) {
        alert("Error: Input must be strictly numeric.");
        return false;
    }
    if (parseFloat(height) === 0) {
        alert("Error: Height must not be zero.");
        return false;
    }
    return true;
}
</script>

<%@ include file="footer.jsp" %>