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
        <title>Exercicio 3</title>
    </head>
    <body>
        <form class="formulario" method="post" action="?funcao=ok">
            <div class="wrap">
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
                    
                    function imprimeArray($array){
                        echo("[");
                        for($i = 0; $i < sizeof($array); $i++){
                            echo(" ".$array[$i].", ");
                        }
                        echo("]");
                    }
                ?>
                <div id="divExercicio3">
                    <fieldset class="fieldInformacoes">
                        <div class="divInformacoes">
                            <label class="titulo">EXERCÍCIO 3</label>
                            <p>3 - Faça um algoritmo em PHP que dado o vetor unidimensional 
                                [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:<br><br>
                               a)maior valor<br><br>
                               b)média dos valores<br><br>
                                c)os valores dispostos em ordem decrescente<br></p>
                        </div>
                    </fieldset>
                    <fieldset class="fieldResultadoExercicios">
                        <div class="lblResultado">
                            <?php      
                                $array = array(2, 4, 35, 50, 23, 17, 9, 12, 27, 5);
                                echo("ARRAY PREENCHIDO:<br><br>");
                                imprimeArray($array);  
                                echo("<br><br>A - O MAIOR valor dentro do array é o = ".max($array)."<br><br>");
                                $value = array_sum($array)/count($array);
                                echo("B - O MÉDIA dos valores do array é = ".$value."<br><br>");
                                sort($array);
                                echo("C - O Array Ordenado..<br><br>Crescente:<br><br>");
                                imprimeArray($array);
                                rsort($array);
                                echo("<br><br>Decrescente:<br><br>");
                                imprimeArray($array);
                            ?>
                        </div>
                        <input type="button" name="Voltar" value="Voltar" class="btn" onclick="history.back()"/>
                    </fieldset>
                </div>
            <div>
        </form>
    </body>
</html>
