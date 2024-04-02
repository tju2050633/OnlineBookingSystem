<html>
    <head>
        <title>Booking Results</title>
    </head>
    <body>
        <h2>Booking Results</h2>
        <?php
            if(isset($_POST['Name'])){
                $Name = $_POST['Name'];
            }
            if(isset($_POST['Phone'])){
                $Phone = $_POST['Phone'];
            }
            if(isset($_POST['Member'])){
                $Member = $_POST['Member'];
            }
            if(isset($_POST['Center'])){
                $Center = $_POST['Center'];
            }
            if ($_SERVER["REQUEST_METHOD"] == "POST") {
                $selectedFacility = $_POST["selectedFacility"];
            }
            if(isset($_POST['selectedFacility'])){
                $selectedVenue = $_POST['selectedVenue'];
            }
            if(isset($_POST['Date'])){
                $Date = $_POST["Date"];
            }
            if(isset($_POST['Rent_Equipment'])){
                $Rent_Equipment = $_POST['Rent_Equipment'];
            }
            if(isset($_POST['Pay'])){
                $Pay = $_POST['Pay'];
            }

            echo '<p>Booking processed at ';
            echo date('Y-m-d h:i:sa');
            '<br>';
            echo '<p>Your booking details are as follows: </p>';
            '<br>';
            echo "Name: " . $Name;
            echo '<br><br>';
            echo "Phone: " . $Phone;
            echo '<br><br>';
            echo "Center: " . $Center;
            echo '<br><br>';
            echo "Facility: " . $selectedFacility;
            echo '<br><br>';
            echo "Venue: " . $selectedVenue;
            echo '<br><br>';
            echo "Date: " . $Date;
            echo '<br><br>';
            echo "Time: ";
            echo '<br>';
            if(isset($_POST['selectedTimes'])){
                $selectedTimes = $_POST['selectedTimes'];
                foreach($selectedTimes as $time){
                    echo $time . "<br>";
                }
            };
            echo '<br>';
            echo "Pay: " . $Pay;
            '<br><br>';

            define('Table_tennis_table_weekday', 3.5);
            define('Table_tennis_table_weekend', 6);
            define('Badminton_court_weekday', 15);
            define('Badminton_court_weekend', 25);
            define('Basketball_court_weekday', 32.5);
            define('Basketball_court_weekend', 50);
            define('Volleyball_court_weekday', 32.5);
            define('Volleyball_court_weekend', 50);
            define('Bowling_alley_weekday', 40);
            define('Bowling_alley_weekend', 66);
            define('Squash_court_weekday', 14);
            define('Squash_court_weekend', 21);
            define('Tennis_court_weekday', 15);
            define('Tennis_court_weekend', 25);
            define('Pool_table_weekday', 12);
            define('Pool_table_weekend', 20);

            $Price = 0;
            if ($selectedFacility=="Table tennis table") {
                if (date('l', strtotime($Date)) == 'Saturday'||'Sunday'){
                    $Price == $Table_tennis_table_weekend;
                }
                else {
                    $Price == $Table_tennis_table_weekday;
                }
            }
            elseif ($selectedFacility=="Badminton court") {
                if (date('l', strtotime($Date)) == 'Saturday'||'Sunday'){
                    $Price == $Badminton_court_weekend;
                }
                else {
                    $Price == $Badminton_court_weekday;
                }
            }
            elseif ($selectedFacility=="Basketball court") {
                if (date('l', strtotime($Date)) == 'Saturday'||'Sunday'){
                    $Price == $Basketball_court_weekend;
                }
                else {
                    $Price == $Basketball_court_weekday;
                }
            }
            elseif ($selectedFacility=="Volleyball court") {
                if (date('l', strtotime($Date)) == 'Saturday'||'Sunday'){
                    $Price == $Volleyball_court_weekend;
                }
                else {
                    $Price == $Volleyball_court_weekday;
                }
            }
            elseif ($selectedFacility=="Bowling alley") {
                if (date('l', strtotime($Date)) == 'Saturday'||'Sunday'){
                    $Price == $Bowling_alley_weekend;
                }
                else {
                    $Price == $Bowling_alley_weekday;
                }
            }
            elseif ($selectedFacility=="Squash court") {
                if (date('l', strtotime($Date)) == 'Saturday'||'Sunday'){
                    $Price == $Squash_court_weekend;
                }
                else {
                    $Price == $Squash_court_weekday;
                }
            }
            elseif ($selectedFacility=="Tennis court") {
                if (date('l', strtotime($Date)) == 'Saturday'||'Sunday'){
                    $Price == $Tennis_court_weekend;
                }
                else {
                    $Price == $Tennis_court_weekday;
                }
            }
            elseif ($selectedFacility=="Badminton court") {
                if (date('l', strtotime($Date)) == 'Saturday'||'Sunday'){
                    $Price == $Pool_table_weekend;
                }
                else {
                    $Price == $Pool_table_weekday;
                }
            }

            $totalamount = 0;
            $totalamount = $Price*count($selectedTimes);
            echo '<p>Total amount is '.$totalamount.'</p>';
            echo '<p>Note:</p>';
            echo '<p>Rent needs to be paid when picking up the equipment at the sports center.</p>';
            echo '<p>You will need to pay an additional $100 cash deposit to rent the items</p>';
        ?>
        <input type="submit" value="confirm">
    </body>
</html>