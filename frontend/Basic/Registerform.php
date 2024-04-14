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
            if(isset($_POST['Gender'])){
                $Gender = $_POST['Gender'];
            }
            if(isset($_POST['Email'])){
                $Email = $_POST['Email'];
            }
            if(isset($_POST['Phone'])){
                $Phone = $_POST['Phone'];
            }
            if(isset($_POST['HKID_7']) && isset($_POST['HKID_1'])){
                $HKID = $_POST['HKID_7'] . $_POST['HKID_1'];
            }
            if(isset($_POST['Birthday'])){
                $Birthday = $_POST["Birthday"];
            }
            if(isset($_POST['Address'])){
                $Address = $_POST['Address'];
            }
            $outputstring = "Name: ". $Name. "\t Gender: " . $Gender . "\t Email: " . $Email  ."\t Phone: ".$Phone ."\t HKID: " . $HKID . "\t Birthday: " . $Birthday . "\t Address: " . $Address ."\n";
            @ $fp = fopen("../frontend/Register.txt", 'ab');
            if (!$fp){
                echo '<p><strong> Your booking could not be processed at this time.  '
                .'Please try again later.</strong></p></body></html>';
                exit;} 
            fwrite($fp, $outputstring, strlen($outputstring)); 
            fclose($fp);
            echo '<p>Register has been saved.</p>'; 
        ?>
    <body>
</html>