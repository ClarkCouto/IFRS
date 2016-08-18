<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <script type="text/javascript" src="JavaScript/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="JavaScript/FibonacciJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/ArquivoCSS.css" />
        <title>Fibonacci</title>
    </head>
    <body>
        <div class="wrapPaginaCompleta">
            <fieldset class="fieldFibonacci">
                <form class="formulario" method="post">
                    <div class="wrapPaginaFibonacci">
                        <fieldset id="fieldFibonacciInformacoes">
                            <legend>Exercício Fibonacci</legend>
                                <p>Escreva um programa web na linguagem PHP que
                                permita que o usuário forneça um número e implemente
                                a sequência de fibonacci.
                                Na matemática a sequência Fibonacci é caracterizada
                                pela sucessão de números inteiros, começando por 0 e
                                1, na qual cada termo corresponde a soma dos dois
                                anteriores.
                                Fn = Fn-1 + Fn- 2</p>                            
                        </fieldset>
                        <fieldset id="fieldFibonacciExemplo">
                            <legend>Exemplo</legend>
                                <p>1,1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610</p>
                        </fieldset>

                        <fieldset id="fieldFibonacciInput">
                            <legend>Digite um Número</legend>
                            <div id="divInput">
                                <input type="number" id="inputNumero" name="inputNumero" required>
                            </div>
                            <div id="divBotoes">
                                <div class="botoes">
                                    <input type="submit" value="Calcular" name="Calcular" id="btnCalcular" class="btn"/>
                                </div>                    
                                <div class="botoes">
                                    <input type="button" id="btnVoltarFibonacci" value="Voltar" class="btn" onClick="history.go(-1)"/>
                                </div>
                            </div>
                        </fieldset>
                    </div>
                </form>
                <fieldset id="fieldResultadoFibonacci">
                    <legend>Resultado</legend>
                        <?php
                            if (isset($_POST["Calcular"])) {
                                $numero = $_POST["inputNumero"];
                                $resultado = 0;
                                $num1 = 0;
                                $num2 = 1;
                                if($numero != NULL){
                                    while($resultado <= $numero){
                                        echo($resultado." ");
                                        $resultado = $num1 + $num2;
                                        $num1 = $num2;
                                        $num2 = $resultado;
                                    }
                                }
                            }
                        ?>
                </fieldset>
            </fieldset>
        </div>
    </body>
</html>
