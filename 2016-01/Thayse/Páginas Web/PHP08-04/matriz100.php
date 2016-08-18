<!DOCTYPE HTML> 
<html>
    <head>
        <title> Matriz </title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <?php 
        $matriz = array_fill(0, 10, array_fill(0, 10, NULL));  
        
        for($i=0; $i<10; $i++) {
            for ($j=0; $j<10; $j++) {
                $matriz[$i][$j] = mt_rand(0, 100);
            }
        }
        
        function exibir($matriz) {
            echo '<table>';
            foreach ($matriz as $linha) {
                echo '<tr>';
                foreach($linha as $dados) {
                    echo '<td>'.$dados."</td>";
                }
                echo '</tr>';
            }
            echo '</table>';
        }
        
        
        
        echo '<div>';
        echo '<h3>Matriz original: </h3><br>';
        exibir($matriz);
        echo '</div>';
        
        
        $vector = "";
        
        //ordenar matriz 
        
        //transforma em um vetor unidimensional 
        foreach ($matriz as $linha) {
            foreach($linha as $dados) {
                $vector[] = $dados."  ";
            }
        }
        
        //ordena
        sort($vector, 1);
        
        
        //transforma novamente na matriz 10x10
        $k = 0;
            for($i=0; $i<10; $i++) {
                for ($j=0; $j<10; $j++) {
                    $matriz[$i][$j] = $vector[$k];
                    $k++;
                }
        }
        
        
        
        //exibe a nova matriz
        echo '<br> <br>';
        echo '<div>';
        echo '<h3>Matriz ordenada:</h3> <br>';
        exibir($matriz);
        echo '</div>';
        
        
        
        ?>
        
        
    </body>
</html>