<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <script type="text/javascript" src="../JavaScript/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="../JavaScript/FigurasJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/ArquivoCSS.css" />
        <title>Trapézio</title>
    </head>
    <body>
        <div class="wrapPaginaCompleta">
            <form class="formulario" method="post" action="FigurasGeometricas.php">
                <fieldset id="fieldFigurasTrapezio">
                <label>Figuras Geométricas - Cálculo da Área do Trapézio</label>
                    <fieldset id="fieldDadosDasFigurasTrapezio">
                        <legend>Digite os Dados:</legend>
                        <div id="variaveis">
                            <div class="divLabel">
                                <label class="labelVariaveis"> Base (B) </label> 
                            </div>
                            <div class="divNumero"> 
                                <input id="num1" class="inputNumeros" required="required"/>
                            </div>
                            <div class="divLabel">
                                <label class="labelVariaveis"> base (b) </label> 
                            </div>
                            <div class="divNumero"> 
                                <input id="num2" class="inputNumeros" required="required" />
                            </div>
                            <div class="divLabel">
                                <label class="labelVariaveis"> Altura (h) </label> 
                            </div>
                            <div class="divNumero"> 
                                <input id="num3" class="inputNumeros" required="required" />
                            </div>
                        </div>
                    </fieldset>
                    <fieldset class="fieldFormulaFiguras">
                        <legend class="legendFormulaFiguras">Fórmula:</legend>
                        <div class="formula">
                            <label class="lblFormula"> A = ((B + b)/2) * h </label>  
                        </div>
                    </fieldset>
                    <fieldset id="fieldResultadoFiguras">
                        <legend>Resultado:</legend>
                        <div id="divResultado">
                            <input class="lblResultadoFiguras" id="areaTrapezio" readonly="readonly"/>
                        </div>
                        <div class="botao">
                            <input type="button" id="btnCalcularTrapezio" value="Calcular" class="btnCalcularFiguras"/>
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