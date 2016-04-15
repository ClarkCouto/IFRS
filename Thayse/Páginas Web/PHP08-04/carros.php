<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Carros</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <div>
        <form method="POST">
            <p> <label for="carro1">Insira o nome do carro 01:</label> 
                <input type="text" name="carro1"> </p>
            <br>
            <p> <label for="carro2">Insira o nome do carro 02:</label> 
                <input type="text" name="carro2"> </p>
            <br>
            <p> <label for="carro3">Insira o nome do carro 03:</label> 
                <input type="text" name="carro3"> </p>
            <br>
            <p> <label for="carro4">Insira o nome do carro 04:</label> 
                <input type="text" name="carro4"> </p>
            <br>
            <p> <label for="carro5">Insira o nome do carro 05:</label> 
                <input type="text" name="carro5"> </p>
            <br>
            <input type="submit" value="Enviar" name="submit">
            <input type="button" value="Voltar" onclick="history.back()">
        </form>
        </div>
        <br>
        <br>
        <br>
        <?php
        
        if (isset($_POST["submit"])) { 
            $carros = [];
            for ($i = 1; $i < 6; $i++) {
                 $carros[$i-1] = $_POST["carro$i"];
            }


            echo '<div>';
            foreach ($carros as $value) {
                echo $value."<br>";
            }
            echo '</div>';
        }
        
        ?>
    </body>
</html>
