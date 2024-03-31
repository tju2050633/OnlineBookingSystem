<?php
// Check if the sport and time parameters are set
if (isset($_POST['sport']) && isset($_POST['time'])) {
    $sport = $_POST['sport'];
    $time = $_POST['time'];
    
    echo "<h1>Personal Information</h1>";
    echo "<p>Please enter your personal information:</p>";

    echo "<form method='post' action='confirmation.php'>";
    echo "<input type='hidden' name='sport' value='$sport'>";
    echo "<input type='hidden' name='time' value='$time'>";
    
    echo "Name: <input type='text' name='name'><br><br>";
    echo "Email: <input type='email' name='email'><br><br>";
    echo "Phone: <input type='tel' name='phone'><br><br>";
    
    echo "<input type='submit' value='Submit'>";
    echo "</form>";
} else {
    echo "Sport or time parameter is missing.";
}
?>