<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <script type="text/javascript" src="../JavaScript/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="../JavaScript/FigurasJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/ArquivoCSS.css" />
        <title>Triângulo</title>
    </head>
    <body>
        <div class="wrapPaginaCompleta">
            <form class="formulario" method="post" action="FigurasGeometricas.php">
                <fieldset class="fieldFigurasGeral">
                    <label class="lbls">Figuras Geométricas - Cálculo da Área do Triângulo</label>
                    <fieldset class="fieldDadosDasFigurasGeral">
                        <legend>Digite os Dados:</legend>
                        <div id="variaveis">
                            <div class="numeros">
                                <div class="divLabel">
                                    <label class="labelVariaveis"> Base (b) </label> 
                                </div>
                                <div class="divNumero">  
                                    <input id="num1" class="inputNumeros" required="required" /> 
                                </div>
                            </div>
                            <div class="numeros">
                                <div class="divLabel">
                                    <label class="labelVariaveis"> Altura (h) </label> 
                                </div>
                                <div class="divNumero"> 
                                    <input id="num2" class="inputNumeros" required="required" /> 
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    <fieldset class="fieldFormulaFiguras">
                        <legend class="legendFormulaFiguras">Fórmula:</legend>
                        <div class="formula">
                            <label class="lblFormula"> A = (b * h)/2 </label>  
                        </div>
                    </fieldset>
                    <fieldset id="fieldResultadoFiguras">
                        <legend>Resultado:</legend>
                        <div id="divResultado">
                            <input class="lblResultadoFiguras" id="areaTriangulo" readonly="readonly"/>
                        </div>
                        <div class="botao">
                            <input type="button" id="btnCalcularTriangulo" value="Calcular" class="btnCalcularFiguras"/>
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

