<?php
// Check if the sport, time, name, email, and phone parameters are set
if (isset($_POST['sport']) && isset($_POST['time']) && isset($_POST['name']) && isset($_POST['email']) && isset($_POST['phone'])) {
    $sport = $_POST['sport'];
    $time = $_POST['time'];
    $name = $_POST['name'];
    $email = $_POST['email'];
    $phone = $_POST['phone'];

    echo "<h1>Confirmation</h1>";
    echo "<p>Thank you for your booking. Here are the details:</p>";

    echo "<p>Sport: $sport</p>";
    echo "<p>Time: $time</p>";
    echo "<p>Name: $name</p>";
    echo "<p>Email: $email</p>";
    echo "<p>Phone: $phone</p>";
} else {
    echo "One or more parameters are missing.";
}
?>