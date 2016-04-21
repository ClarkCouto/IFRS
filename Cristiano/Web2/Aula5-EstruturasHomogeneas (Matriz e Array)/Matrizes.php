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
	<link rel="stylesheet" type="text/css" href="CSS/StyleCSS.css" />
        <title>Exercicios</title>
    </head>
    <body>
        <form class="formulario">
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
                <div id="exercicio1">
                    <fieldset class="fieldInformacoes">
                        <label class="titulo">EXERCÍCIO 1</label>
                        <p>1 - Implemente um algoritmo em PHP onde uma matriz NxN possua os mesmos valores.</p>
                    </fieldset>
                    <fieldset class="fieldResultadoExercicios">
                        <label>Resultado</label>
                            <?php         
                                $matriz = [];
                                for($i = 1; $i < 5; $i++){
                                    for($j = 1; $j < 5; $j++){
                                        $matriz[$i][$j]= 1;
                                    }
                                }
                                imprimeMatriz($matriz);
                            ?>
                    </fieldset>
                </div>
                <div id="exercicio2">
                    <fieldset class="fieldInformacoes">
                        <label class="titulo">EXERCÍCIO 2</label>
                        <p>2 - Crie um vetor de dimensões 10 por 10 de números aleatórios, e desenvolva
                    uma função que retorne os valores ordenados em ordem crescente.</p>
                    </fieldset>
                    <fieldset class="fieldResultadoExercicios">
                        <label>Resultado</label>
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

                            echo("Matriz Preenchida:<br>"); 
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

                            echo("<br>Matriz Ordenada..<br>");
                            imprimeMatriz($matriz);     
                        ?>
                    </fieldset>
                    </div >
                    <div id="divExercicio3">
                        <fieldset class="fieldInformacoes">
                            <label class="titulo">EXERCÍCIO 3</label>
                            <p>3 - Faça um algoritmo em PHP que dado o vetor unidimensional 
                               [2; 4; 35; 50; 23; 17; 9; 12; 27; 5] retorne:<br>
                                a)maior valor<br>
                                b)média dos valores<br>
                                c)os valores dispostos em ordem decrescente<br></p>
                        </fieldset>
                        <fieldset class="fieldResultadoExercicios">
                            <label>Resultado</label>
                            <?php         
                                $array = array(2, 4, 35, 50, 23, 17, 9, 12, 27, 5);
                                echo("Array preenchido:<br>");
                                imprimeArray($array);  
                                echo("<br><br>A - O MAIOR valor dentro do array é o = ".max($array)."<br><br>");
                                $value = array_sum($array)/count($array);
                                echo("B - O MÉDIA dos valores do array é = ".$value."<br><br>");
                                sort($array);
                                echo("C - O Array Ordenado e na Ordem Inversa..<br><br>Ordenado:<br>");
                                imprimeArray($array);
                                rsort($array);
                                echo("<br><br>Ordem inversa:<br>");
                                imprimeArray($array);
                            ?>
                        </fieldset>
                    </div>
                    <div id="divExercicio4">
                        <fieldset class="fieldInformacoes">
                            <label class="titulo">EXERCÍCIO 4</label>
                            <p>4 - Implemente um algoritmo em PHP para armazenar uma lista de até 5 nomes de 
                            carros e apresente os 5 nomes de carros na tela.</p>
                        </fieldset>
                        <fieldset class="fieldResultadoExercicios">
                            <label>Resultado</label>
                            <?php         
                                $array = array("Mercedez", "Audi", "Range Rover", "BMW", "Ferrari");
                                echo("Array preenchido:<br>");
                                imprimeArray($array);
                                sort($array);
                                echo("<br><br>Array Ordenado:<br>");
                                imprimeArray($array);
                                rsort($array);
                                echo("<br><br>Array na Ordem Inversa:<br>");
                                imprimeArray($array);
                            ?>
                        </fieldset>
                    </div>
                    <div id="divExercicio5">
                        <fieldset class="fieldInformacoes">
                            <label class="titulo">EXERCÍCIO 5</label>
                            <p>5 - Construa um algoritmo utilizando a linguagem PHP que resolva as seguintes 
                            operações entre matrizes.<br>
                            a) Matriz1 + Matriz2 = Resultado<br>
                            b) Matriz1 – Matriz2 = Resultado<br>
                            c) Matriz1 x Matriz2 = Resultado<br>
                            d)(Matriz1)² + (Matriz2)³ = Resultado</p>
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
                                
                                echo("Matrizes Iniciais:<br><br>");
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
                        </fieldset>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
