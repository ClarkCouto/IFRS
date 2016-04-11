<!DOCTYPE HTML> 
<html>
    <head>
        <title> Matriz </title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <?php 
        echo '<div>';
            $matriz = array_fill(0, 5, array_fill(0, 5, 3));  //começa no índice 0, tem 5 números (cada dimensão)
            echo '<table>';
            foreach ($matriz as $linha) {
                echo '<tr>';
                foreach($linha as $dados) {
                    echo '<td>'.$dados."</td>";
                }
                echo '</tr>';
            }
            echo '</table>';
        echo '</div>';
        ?>
    </body>
</html>