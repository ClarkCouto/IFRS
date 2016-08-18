<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Questão 05</title>
    </head>
    <body>
        
        <?php
        
        $matriz1 = array(array(1, 2, 3), array(4, 5, 6), array(7, 8, 9));
        
        $matriz2 = array(array(9, 8, 7), array(6, 5, 4), array(3, 2, 1));
        
        
        
        $resultadoSoma = array();
        
        for ($i = 0; $i<3; $i++) {
            for ($j = 0; $j<3; $j++) {

                    $resultadoSoma[$i][$j] = $matriz1[$i][$j] + $matriz2[$i][$j];
            }
        }
        
        $resultadoSub = array();
        
        for ($i = 0; $i<3; $i++) {
            for ($j = 0; $j<3; $j++) {

                    $resultadoSub[$i][$j] = $matriz1[$i][$j] - $matriz2[$i][$j];
            }
        }
        
        $resultadoMult = array();
        
        for ($i = 0; $i<3; $i++) {
            for ($j = 0; $j<3; $j++) {

                    $resultadoMult[$i][$j] = $matriz1[$i][$j] * $matriz2[$i][$j];
            }
        }
        
        $resultadoP = array();
        
        for ($i = 0; $i<3; $i++) {
            for ($j = 0; $j<3; $j++) {

                    $resultadoP[$i][$j] = ($matriz1[$i][$j])^2 + ($matriz2[$i][$j])^3;
            }
        }
        echo '<div>';
        
        function exibir_matriz1($matriz1) {
          echo 'Matriz 01: ';
          echo '<table>';
          foreach ($matriz1 as $value) {
            echo '<tr>';
                foreach ($value as $dados) { 
                    echo "<td>".$dados."</td>";
                }
                echo '</tr>';
            }  
            echo '</table>';
        }
        echo '<p>';
        exibir_matriz1($matriz1);
        echo '</p>';
        echo '<p>';
        echo '+';
        echo '</p>';
        
        function exibir_matriz2($matriz2) {
            echo 'Matriz 02: ';
            echo '<table>';
            foreach ($matriz2 as $value) {
            echo '<br>';
            echo '<tr>';
            foreach ($value as $dados) { 
                echo "<td>".$dados."</td>";
            }
            echo '</tr>';
            }
            echo '</table>';
        }
        echo '<p>';
        exibir_matriz2($matriz2);
        echo '</p>';
        echo '<p>';
        echo '=';
        echo '</p>';
        echo '<p>';
        echo 'Resultado da soma: ';
        echo '<table>';
        foreach ($resultadoSoma as $value) {
            echo '<tr>';
            foreach ($value as $dados) { 
                echo '<td>'.$dados."<td>";
            }
            echo '</tr>';
        }
        echo '</table>';
        echo '</p>';
        echo '</div>';
        echo '<br>';
        echo '<div>';
        echo '<p>';
        exibir_matriz1($matriz1);
        echo '</p>';
        echo '<p>';
        echo '-';
        echo '</p>';
        echo '<p>';
        exibir_matriz2($matriz2);
        echo '</p>';
        echo '<p>';
        echo '=';
        echo '</p>';
        
        echo '<p>';
        echo 'Resultado da subtração: ';
        
        echo '<table>';
        foreach ($resultadoSub as $value) {
            echo '<tr>';
            foreach ($value as $dados) { 
                echo '<td>'.$dados."<td>";
            }
            echo '</tr>';
        }
        echo '</table>';
        echo '</p>';
        echo '</div>';
        echo '<br>';
        echo '<div>';
        echo '<p>';
        exibir_matriz1($matriz1);
        echo '</p>';
        echo '<p>';
        echo '*';
        echo '</p>';
        echo '<p>';
        exibir_matriz2($matriz2);
        echo '</p>';
        echo '<p>';
        echo '=';
        echo '</p>';
        echo '<p>';
        echo '<table>';
        echo 'Resultado da multiplicação: ';
        foreach ($resultadoMult as $value) {
            echo '<tr>';
            foreach ($value as $dados) { 
                echo '<td>'.$dados."<td>";
            }
            echo '</tr>';
        }
        echo '</table>';
        
        echo '</p>';
        echo '</div>';
        echo '<br>';
        echo '<div>';
        echo '<p>';
        exibir_matriz1($matriz1);
        echo '</p>';
        echo '<p>';
        echo '² * ³';
        echo '</p>';
        echo '<p>';
        exibir_matriz2($matriz2);
        echo '</p>';
        echo '<p>';
        echo '=';
        echo '</p>';
        echo '<p>';
        echo 'Resultado da potencialização: ';
        echo '<table>';
        foreach ($resultadoP as $value) {
            echo '<tr>';
            foreach ($value as $dados) { 
                echo '<td>'.$dados."<td>";
            }
            echo '</tr>';
        }
        
        echo '</p>';
        echo '</div>';
        
        ?>
    </body>
</html>
