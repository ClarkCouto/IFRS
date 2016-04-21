<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <script type="text/javascript" src="../JavaScript/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="../JavaScript/ScriptJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/StyleCSS.css" />
        <title>Exercicio 1</title>
    </head>
    <body>
        <div class="paginaCompleta">
            <form class="formulario" method="post">
                <div class="wrap">
                    <div id="exercicio1">
                        <?php
                            function imprimeMatriz($matriz){    
                                echo "<table>";        
                                foreach ($matriz as $i) {            
                                    echo "<tr>";
                                    foreach ($i as $j) {
                                        echo "<td>".$j."</td>";
                                    }
                                    echo "</tr>";
                                }
                                echo "</table><br>";
                            }
                        ?>
                        <fieldset class="fieldInformacoes">
                            <div class="divInformacoes">
                                <label class="titulo">EXERCÍCIO 1</label>
                                <p>1 - Implemente um algoritmo em PHP onde uma matriz NxN possua os mesmos valores.</p>
                            </div>
                        </fieldset>
                        <fieldset class="fieldResultadoExercicio1">
                            <div class="entradaDados">
                                <label>Digite o tamanho da matriz(NxN):</label>
                                <input type="number" id="num1" name="num1" class="inputNumeros" required/>
                            </div>
                            <div class="botao">
                                <input type="submit" name="GerarMatriz" value="Gerar Matriz" class="btn"/>
                                <input type="button" name="Voltar" value="Voltar" class="btn" onclick="history.back()"/>
                            </div>
                            <div class="lblResultado">
                                <?php
                                    if (isset($_POST["GerarMatriz"])) {
                                        echo("Resultado:<br><br>");
                                        $numero = $_POST["num1"];
                                        $matriz = [];
                                        for($i = 0; $i < $numero; $i++){
                                            for($j = 0; $j < $numero; $j++){
                                                $matriz[$i][$j]= $numero;
                                            }
                                        }
                                        imprimeMatriz($matriz);
                                    }
                                ?>
                            </div>
                        </fieldset>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
