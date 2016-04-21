<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <script type="text/javascript" src="../JavaScript/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="../JavaScript/FigurasJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/ArquivoCSS.css" />
        <title>Quadrado</title>
    </head>
    <body>
        <div class="wrapPaginaCompleta">
            <form class="formulario" method="post" action="FigurasGeometricas.php">
                <fieldset id="fieldFigurasQuadrado">
                    <label class="lbls">Figuras Geométricas - Cálculo da Área do Quadrado</label>
                    <fieldset class="fieldDadosFigurasQuadrado">
                        <legend>Digite os Dados:</legend>
                        <div id="variaveis">
                            <div class="numeros">
                                <div class="divLabel">
                                    <label class="labelVariaveis"> Lado (l)</label>  
                                </div>
                                <div class="divNumero">
                                    <input id="num1" class="inputNumeros" required="required" /> 
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    <fieldset class="fieldFormulaFiguras">
                        <legend class="legendFormulaFiguras">Fórmula:</legend>
                        <div class="formula">
                            <label class="lblFormula"> A = l * l = l²</label>  
                        </div>
                    </fieldset>
                    <fieldset id="fieldResultadoFiguras">
                        <legend>Resultado:</legend>
                        <div id="divResultado">
                            <input class="lblResultadoFiguras" id="areaQuadrado" readonly="readonly"/>
                        </div>
                        <div class="botao">
                            <input type="button" id="btnCalcularQuadrado" value="Calcular" class="btnCalcularFiguras"/>
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
