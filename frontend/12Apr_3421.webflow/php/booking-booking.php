<html>
    <head>
        <title>Booking Results</title>
    </head>
    <body>
        <h2>Booking Results</h2>
        <?php
            if(isset($_POST['name'])){
                $name = $_POST['name'];
            }
            if(isset($_POST['PhoneNo'])){
                $PhoneNo = $_POST['PhoneNo'];
            }
            if(isset($_POST['checkbox-4'])){
                $checkbox4 = $_POST['checkbox-4'];
            }
            if(isset($_POST['Center'])){
                $Center = $_POST['Center'];
            }
            if(isset($_POST['Date'])){
                $Date = $_POST["Date"];
            }
            if(isset($_POST['Time'])){
                $Time = $_POST["Time"];
            }
            if(isset($_POST['Rent_Equipment'])){
                $Rent_Equipment = $_POST['Rent_Equipment'];
            }
    

            echo '<p>Booking processed at ';
            echo date('Y-m-d h:i:sa');
            '<br>';
            echo '<p>Your booking details are as follows: </p>';
            '<br>';
            echo "Name: " . $name;
            echo '<br><br>';
            echo "Phone: " . $PhoneNo;
            echo '<br><br>';
            echo "Center: " . $Center;
            echo '<br><br>';
            echo "Venue: ";
            if(isset($_POST['selectedVenue'])){
                $selectedVenue = $_POST['selectedVenue'];
                foreach ($selectedVenue as $Venue) {
                    if (!empty($Venue)) {
                        echo $Venue;
                        break;
                    }
                }
            }
            echo '<br><br>';
            echo "Date: " . $Date;
            echo '<br><br>';
            echo "Time: ";
            echo '<br>';
            if(isset($_POST['selectedTimes'])){
                $selectedTimes = $_POST['selectedTimes'];
                foreach($selectedTimes as $Time){
                    echo $Time . "<br>";
                }
            };
            echo '<br>';
            echo "Pay: " . $Pay;
            '<br><br>';

            $Table_tennis_table_weekday=3.5;
            $Table_tennis_table_weekend=6;
            $Badminton_court_weekday=15;
            $Badminton_court_weekend =25;
            $Basketball_court_weekday=32.5;
            $Basketball_court_weekend=50;
            $Volleyball_court_weekday=32.5;
            $Volleyball_court_weekend=50;
            $Bowling_alley_weekday=40;
            $Bowling_alley_weekend=66;
            $Squash_court_weekday=14;
            $Squash_court_weekend=21;
            $Tennis_court_weekday=15;
            $Tennis_court_weekend=25;
            $Pool_table_weekday=12;
            $Pool_table_weekend=20;

            if (substr($Venue, 0, -2)=="Table tennis table") {
                if (date('l', strtotime($Date)) == 'Saturday' || date('l', strtotime($Date)) == 'Sunday'){
                    $Price = $Table_tennis_table_weekend;
                }
                else {
                    $Price = $Table_tennis_table_weekday;
                }
            }
            elseif (substr($Venue, 0, -2)=="Badminton court") {
                if (date('l', strtotime($Date)) == 'Saturday' || date('l', strtotime($Date)) == 'Sunday'){
                    $Price = $Badminton_court_weekend;
                }
                else {
                    $Price = $Badminton_court_weekday;
                }
            }
            elseif (substr($Venue, 0, -2)=="Basketball court") {
                if (date('l', strtotime($Date)) == 'Saturday' || date('l', strtotime($Date)) == 'Sunday'){
                    $Price = $Basketball_court_weekend;
                }
                else {
                    $Price = $Basketball_court_weekday;
                }
            }
            elseif (substr($Venue, 0, -2)=="Volleyball court") {
                if (date('l', strtotime($Date)) == 'Saturday' || date('l', strtotime($Date)) == 'Sunday'){
                    $Price = $Volleyball_court_weekend;
                }
                else {
                    $Price = $Volleyball_court_weekday;
                }
            }
            elseif (substr($Venue, 0, -2)=="Bowling alley") {
                if (date('l', strtotime($Date)) == 'Saturday' || date('l', strtotime($Date)) == 'Sunday'){
                    $Price = $Bowling_alley_weekend;
                }
                else {
                    $Price = $Bowling_alley_weekday;
                }
            }
            elseif (substr($Venue, 0, -2)=="Squash court") {
                if (date('l', strtotime($Date)) == 'Saturday' || date('l', strtotime($Date)) == 'Sunday'){
                    $Price = $Squash_court_weekend;
                }
                else {
                    $Price = $Squash_court_weekday;
                }
            }
            elseif (substr($Venue, 0, -2)=="Tennis court") {
                if (date('l', strtotime($Date)) == 'Saturday' || date('l', strtotime($Date)) == 'Sunday'){
                    $Price = $Tennis_court_weekend;
                }
                else {
                    $Price = $Tennis_court_weekday;
                }
            }
            elseif (substr($Venue, 0, -2)=="Badminton court") {
                if (date('l', strtotime($Date)) == 'Saturday' || date('l', strtotime($Date)) == 'Sunday'){
                    $Price = $Pool_table_weekend;
                }
                else {
                    $Price = $Pool_table_weekday;
                }
            }
            
            if ($Member = $_POST['Member'] == "Yes"){
                $totalamount = $Price*count($selectedTimes)*0.9;
            }
            else {
                $totalamount = $Price*count($selectedTimes);
            }
            echo '<p>Total amount is '.$totalamount.'</p>';
            echo '<p>Note:</p>';
            echo '<p>Rent needs to be paid when picking up the equipment at the sports center.</p>';
            echo '<p>You will need to pay an additional $100 cash deposit to rent the items</p>';
            $outputstring = $today."\t Name: ". $name. "\t Phone: " . $PhoneNo . "\t Center: " . $Center  ."\t Venues: ".$V ."\t Date: " . $Date . "\t Times: " . $Time . "\t Pay: " . $Pay ."\n";
            @ $fp = fopen("../php/booking-booking.txt", 'ab');
            if (!$fp){
                echo '<p><strong> Your booking could not be processed at this time.  '
                .'Please try again later.</strong></p></body></html>';
                exit;} 
            fwrite($fp, $outputstring, strlen($outputstring)); 
            fclose($fp);
            echo '<p>Order has been saved.</p>'; 
        ?>
        <input type="submit" value="Confirm">
    </body>
</html>