<?php

$fibonacci = array();
$aux=0;
$fn1 = 0;
$fn2 = 1;
$numero = $_GET["numero"];

$fibonacci[] = $fn1;

while($fn2 <= $numero) {
    $aux = $fn2;
    $fn2 = $fn2 + $fn1;
    $fn1 = $aux;  
    $fibonacci[] = $fn1;   
    
}

for ($i=0;$i<=(count($fibonacci)-1);$i++){
    if ($i < (count($fibonacci) - 1))
        echo $fibonacci[$i] . ", ";
    else
        echo $fibonacci[$i] . ".";
}