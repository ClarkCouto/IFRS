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
        <title>Exercicio 2</title>
    </head>
    <body>
        <form class="formulario" method="post" action="?funcao=ok">
            <div id="exercicio2">
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
                        <label class="titulo">EXERCÍCIO 2</label>
                        <p>2 - Crie um vetor de dimensões 10 por 10 de números aleatórios, e desenvolva
                    uma função que retorne os valores ordenados em ordem crescente.</p>
                    </div>
                </fieldset>
                <fieldset class="fieldResultadoExercicios">
                    <?php         
                        $matriz = [];
                        for($i = 1; $i <= 10; $i++){
                            for($j = 1; $j <= 10; $j++){
                                $numero = rand ( 0 , 99);
                                if($numero < 10){
                                    $numero = "0".$numero;
                                }
                                $matriz[$i][$j]= $numero;
                           }
                        }

                        echo("<br><br>Matriz Preenchida:<br><br>"); 
                        imprimeMatriz($matriz);                            

                        $array = [];
                        $count = 0;
                        for($a = 1; $a <= 10; $a++){
                            for($b = 1; $b <= 10; $b++){
                                $array[$count] = $matriz[$a][$b];
                                $count++;
                            }
                        }
                        sort($array);
                        $count = 0;
                        $matriz = [];
                        for($a = 1; $a <= 10; $a++){
                            for($b = 1; $b <= 10; $b++){
                                $matriz[$a][$b] = $array[$count];
                                $count++;
                            }
                        }           

                        echo("<br>Matriz Ordenada:<br><br>");
                        imprimeMatriz($matriz);     
                    ?>
                    <input type="button" name="Voltar" value="Voltar" class="btn" onclick="history.back()"/>
                </fieldset>
            </div >
        </form>
    </body>
</html>
