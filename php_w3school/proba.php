<!DOCTYPE html>
<html>
<head> 
<title> Php tutorijal </title>
</head>
<body>
<?php 
$favcolor = "yellow";

switch($favcolor) {
    case "red":
        echo "Tvoja omiljena boja je crvena!";
    break;

    case "blue":
        echo "Tvoja omiljena boja je plava!";
    break;
    
    case "green":
        echo "Tvoja omiljena boja je zelena!";
    break;
    default:
    echo "Ni jedna boja ti nije omiljena!";
}

echo "<br>";
$t = date("H");

if($t < "10") {
    echo "Good morning!";
}
elseif ($t < "20") {
    echo "Have a good day!";

}
else {
    echo "Have a good night!";

}

echo "<br>";

define("Greetings", "Hello World!");

function Hey(){
    echo Greetings;
}

Hey();
echo "<br>";
$x = (rand(0,10));
$y = (rand(0,10));

var_dump($x);
echo "<br>";
var_dump($y);
echo "<br>";

var_dump($x === $y);


?>
</body>

 </html>