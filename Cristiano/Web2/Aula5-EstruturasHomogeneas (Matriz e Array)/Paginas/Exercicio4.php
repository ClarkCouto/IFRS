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
        <form class="formulario" method="post" >
            <div class="wrap">
                <?php     
                    function imprimeArray($array){
                        echo("[");
                        for($i = 0; $i < sizeof($array); $i++){
                            echo(" ".$array[$i].", ");
                        }
                        echo("]");
                    }
                ?>
                <fieldset class="fieldInformacoes">
                    <div class="divInformacoes">
                        <label class="titulo">EXERCÍCIO 4</label>
                        <p>4 - Implemente um algoritmo em PHP para armazenar uma lista de até 5 nomes de 
                        carros e apresente os 5 nomes de carros na tela.</p>
                    </div>
                </fieldset>
                <fieldset class="fieldResultadoExercicios">
                    <div class="entradaDados">
                        <label>Digite os nomes dos carros:</label><br>
                        1 - <input type="text" name="carro1" class="inputCarros"/><br>
                        2 - <input type="text" name="carro2" class="inputCarros"/><br>
                        3 - <input type="text" name="carro3" class="inputCarros"/><br>
                        4 - <input type="text" name="carro4" class="inputCarros"/><br>
                        5 - <input type="text" name="carro5" class="inputCarros"/><br>
                    </div>
                    <div class="botao">
                        <input type="submit" name="ResultadoArray" value="Mostrar Array" class="btn"/>
                        <input type="button" name="Voltar" value="Voltar" class="btn" onclick="history.back()"/>
                    </div>
                    <div class="lblResultado">
                    <?php   
                        $array = [];
//                        if (isset($_POST["Adicionar"])) {
//                            if(sizeof($array) > 0){
//                                $array[] = $_POST["carro"];
//                            }
//                            else{
//                                $array[] = array();
//                            }
//                            imprimeArray($array);
//                        }
                        if (isset($_POST["ResultadoArray"])) {
                            for ($i = 1; $i < 6; $i++) {
                                 $array[$i-1] = $_POST["carro$i"];
                            }
                            echo("<br>Resultado<br><br>Array preenchido:<br>");
                            //$array = array("Mercedez", "Audi", "Range Rover", "BMW", "Ferrari");
                            imprimeArray($array);
                            sort($array);
                            echo("<br><br>Array Ordenado:<br>");
                            imprimeArray($array);
                            rsort($array);
                            echo("<br><br>Array na Ordem Inversa:<br>");
                            imprimeArray($array);
                        }
                    ?>
                    </div>
                </fieldset>
            </div>
        </form>
    </body>
</html>
