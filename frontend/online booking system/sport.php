<?php
// Check if the sport parameter is set
if (isset($_GET['sport'])) {
    $sport = $_GET['sport'];
    $times = array('9:00 AM', '11:00 AM', '1:00 PM', '3:00 PM');

    // Check if the chosen sport is valid
    if (in_array($sport, array('football', 'basketball', 'tennis'))) {
        echo "<h1>$sport Booking</h1>";
        echo "<p>Please select a time slot:</p>";

        echo "<form method='post' action='personal_info.php'>";
        echo "<input type='hidden' name='sport' value='$sport'>";
        
        echo "<select name='time'>";
        foreach ($times as $time) {
            echo "<option value='$time'>$time</option>";
        }
        echo "</select>";
        
        echo "<br><br>";
        echo "<input type='submit' value='Book'>";
        echo "</form>";
    } else {
        echo "Invalid sport selection.";
    }
} else {
    echo "Sport parameter is missing.";
}
?>