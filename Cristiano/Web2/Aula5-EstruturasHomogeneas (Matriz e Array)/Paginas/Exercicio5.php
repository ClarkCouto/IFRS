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
            <div id="divExercicio5">
                <fieldset class="fieldInformacoes">
                    <div class="divInformacoes">
                        <label class="titulo">EXERCÍCIO 5</label>
                        <p>5 - Construa um algoritmo utilizando a linguagem PHP que resolva as seguintes 
                            operações entre matrizes.<br><br>
                        a) Matriz1 + Matriz2 = Resultado<br><br>
                        b) Matriz1 – Matriz2 = Resultado<br><br>
                        c) Matriz1 x Matriz2 = Resultado<br><br>
                        d)(Matriz1)² + (Matriz2)³ = Resultado</p>
                    </div>
                </fieldset>
                <fieldset class="fieldResultadoExercicios">
                    <?php         
                        $matriz1 = [];
                        $matriz2 = [];
                        $count1 = 1;
                        $count2 = 9;

                        for($i = 1; $i < 4; $i++){
                            for($j = 1; $j < 4; $j++){
                                $matriz1[$i][$j] = $count1;
                                $matriz2[$i][$j] = $count2;
                                $count1++;
                                $count2--;
                           }
                        }

                        echo("<br>Matrizes Iniciais:<br><br>");
                        imprimeMatriz($matriz1);
                        imprimeMatriz($matriz2); 

                        echo("<br>a - Matriz1 + Matriz2<br><br>");
                        $matriz3 = [];
                        for($i = 1; $i < 4; $i++){
                            for($j = 1; $j < 4; $j++){
                                $matriz3[$i][$j] = $matriz1[$i][$j]+$matriz2[$i][$j];
                           }
                        }
                        imprimeMatriz($matriz3);
                        $matriz3 = [];
                        echo("<br>b - Matriz1 - Matriz2<br><br>");
                        for($i = 1; $i < 4; $i++){
                            for($j = 1; $j < 4; $j++){
                                $matriz3[$i][$j] = $matriz1[$i][$j]-$matriz2[$i][$j];
                           }
                        }
                        imprimeMatriz($matriz3);
                        $matriz3 = [];
                        echo("<br>c - Matriz1 * Matriz2<br><br>");
                        for($i = 1; $i < 4; $i++){
                            for($j = 1; $j < 4; $j++){
                                $matriz3[$i][$j] = $matriz1[$i][$j]*$matriz2[$i][$j];
                           }
                        }
                        imprimeMatriz($matriz3);
                        $matriz3 = [];
                        echo("<br>d - Matriz1² + Matriz2³<br><br>");
                        for($i = 1; $i < 4; $i++){
                            for($j = 1; $j < 4; $j++){
                                $matriz3[$i][$j] = ($matriz1[$i][$j]*$matriz1[$i][$j])+($matriz2[$i][$j]*$matriz2[$i][$j]*$matriz2[$i][$j]);
                           }
                        }
                        imprimeMatriz($matriz3);
                    ?>
                    <input type="button" name="Voltar" value="Voltar" class="btn" onclick="history.back()"/>
                </fieldset>
            </div>
        </form>
    </body>
</html>
