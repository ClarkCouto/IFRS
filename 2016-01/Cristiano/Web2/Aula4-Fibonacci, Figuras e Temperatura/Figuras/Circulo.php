<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <script type="text/javascript" src="../JavaScript/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="../JavaScript/FigurasJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/ArquivoCSS.css" />
        <title>Círculo</title>
    </head>
    <body>
        <div class="wrapPaginaCompleta">
            <form class="formulario" method="post">
                <fieldset class="fieldFigurasGeral">
                    <label class="lblTitulo">Figuras Geométricas - Cálculo da Área do Círculo</label>
                    <fieldset class="fieldDadosDasFigurasGeral">
                        <legend>Digite os Dados:</legend>
                        <div id="variaveis">
                            <div class="numeros">
                                <div class="divLabel">
                                    <label class="lblFormula"> Pi </label>  
                                </div>
                                <div class="divNumero">
                                    <input id="num2" class="inputNumeros" value="3.1416" disabled="disabled"/>
                                </div>
                            </div>
                            <div class="numeros">
                                <div class="divLabel">
                                    <label class="lblFormula"> Raio (r) </label> 
                                </div>
                                <div class="divNumero"> 
                                    <input id="num1" class="inputNumeros" required="required"/>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    <fieldset class="fieldFormulaFiguras">
                        <legend class="legendFormulaFiguras">Fórmula:</legend>
                        <div class="formula">
                            <label class="lblFormula"> A = Pi * r²</label>  
                        </div>
                    </fieldset>
                    <fieldset id="fieldResultadoFiguras">
                        <legend>Resultado:</legend>
                        <div id="divResultado">
                            <?php
                                if (isset($_POST["btnCalcularCirculo"])) {
                                    $num1 = "<script>document.write(num1)</script>";
                                    $num2 = "<script>document.write(num1)</script>";
                                    $resultado = $num1 * ($('#num1').val() * $('#num1').val()); 
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
                            <input class="lblResultadoFiguras" id="areaCirculo" readonly="readonly"/>
                        </div>
                        <div class="botao">
                            <input type="button" id="btnCalcularCirculo" value="Calcular" class="btnCalcularFiguras"/>
                        </div>
                        <div class="botao">
                            <input type="button" class="btnVoltarFiguras" value="Voltar"/>
                        </div>
                    </fieldset>
                </fieldset>
            </form>
        </div>
    </body>
</html>