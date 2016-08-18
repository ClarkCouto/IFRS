<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <title>Figuras Geometricas</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
<?php
        $numero = $_GET["numero"];
        
        $primeiro = 0;
        $segundo = 1;
        $resultado = array();
        echo '<pre>';
        echo $segundo. " ";
        
        
        for($i = 1; ($primeiro + $segundo) <= $numero; $i++) {
            $resultado[$i] = $primeiro + $segundo;
            $primeiro = $segundo;
            $segundo = $resultado[$i];
        }
        
        
        foreach ($resultado as &$value) {
            echo $value. " ";
        }
        echo '</pre>';
?>
</body>
</html>

