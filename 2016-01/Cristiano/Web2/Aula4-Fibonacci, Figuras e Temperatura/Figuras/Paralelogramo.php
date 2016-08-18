<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <script type="text/javascript" src="../JavaScript/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="../JavaScript/FigurasJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/ArquivoCSS.css" />
        <title>Paralelogramo</title>
    </head>
    <body>        
        <div class="wrapPaginaCompleta">
            <form class="formulario" method="post" action="FigurasGeometricas.php">
                <fieldset class="fieldFigurasGeral">
                    <label>Figuras Geométricas - Cálculo da Área do Paralelogramo</label>
                    <fieldset class="fieldDadosDasFigurasGeral">
                        <legend>Digite os Dados:</legend>
                        <div id="variaveis">
                            <div class="numeros">
                                <div class="divLabel">
                                    <label class="lblFormula"> Base (b) </label>   
                                </div>
                                <div class="divNumero">
                                    <input id="num1" class="inputNumeros" required="required" />
                                </div>
                            </div>
                            <div class="numeros">
                                <div class="divLabel">
                                    <label class="lblFormula"> Altura (h) </label>  
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
                            <label class="lblFormula"> A = b * h</label>  
                        </div>
                    </fieldset>
                    <fieldset id="fieldResultadoFiguras">
                        <legend>Resultado:</legend>
                        <div id="divResultado">
                            <input class="lblResultadoFiguras" id="areaParalelogramo" readonly="readonly"/>
                        </div>
                        <div class="botao">
                            <input type="button" id="btnCalcularPararelogramo" value="Calcular" class="btnCalcularFiguras"/>
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