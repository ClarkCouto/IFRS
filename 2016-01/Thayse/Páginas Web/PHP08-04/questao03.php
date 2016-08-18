<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Questão 03</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <?php
        $vector = array(2, 4, 35, 50, 23, 17, 9, 12, 27, 5);
        echo '<div>';
        echo 'O vetor original:';
         foreach ($vector as $value) {
            echo $value." ";
        }
        echo '</div>';
        echo '<br> <br>';
        //valor maximo
        echo '<div>';
        echo 'O valor máximo do vetor:';
        echo max($vector);
        echo '</div>';
        echo '<br> <br>';
        //calcular a media
        echo '<div>';
        echo 'A média do vetor:';
        $media = array_sum($vector) / sizeof($vector);
        echo $media;
        echo '</div>';
        echo '<br> <br>';
        
        //ordem descrecente
        echo '<div>';
        echo 'O vetor em ordem decrescente:';
        rsort($vector);
        foreach ($vector as $value) {
            echo $value." ";
    
        }
        echo '</div>';
        ?>
    </body>
</html>
