<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Carros</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        
        <?php
        $carros = array("uno", "gol", "strada", "duster", "fox");
        
        echo '<div>';
        foreach ($carros as $value) {
            echo $value."<br>";
        }
        echo '</div>';
        ?>
    </body>
</html>
