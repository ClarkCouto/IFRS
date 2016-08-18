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
        <title>Fibonacci - Resultado</title>
    </head>
    <body>
        <form class="formulario" method="post" action="Fibonacci.php">
            <div class="wrapPaginaFibonacciResultado">
                <fieldset>
                <legend>Exercício Fibonacci - Resultado</legend>
                    <div id="divPHP">
                        <?php
                            $numero = $_POST["inputNumero"];
                            $resultado = 0;
                            $num1 = 0;
                            $num2 = 1;
                            while($resultado <= $numero){
                                echo($resultado." ");
                                $resultado = $num1 + $num2;
                                $num1 = $num2;
                                $num2 = $resultado;
                            }
                        ?>
                    </div>
                    <div class="botoes">
                        <input type="button" id="btnVoltarFibonacciResultado" value="Voltar" class="btn">
                    </div>
                </fieldset>
            </div>
        </form>
    </body>
</html>


