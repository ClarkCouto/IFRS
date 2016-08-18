<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <script type="text/javascript" src="../JavaScript/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="../JavaScript/TemperaturaJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/ArquivoCSS.css" />
        <title>Figuras</title>
    </head>
    <body>
        <div class="wrapPaginaCompleta">
            <form class="formulario" method="post" action="FigurasTemperaturasResultado.php">
                <fieldset id="fieldPaginaTemperatura">
                    <fieldset id="infoTemperaturas">
                        <legend>Exercício Temperaturas</legend>
                            <p>Implemente um programa web na linguagem PHP que
                            permita realizar a conversão de escalas termométricas
                            de Kelvin, Fahrenheit e Celsius. Celsius para Kelvin,
                            Kelvin para Celsius. A diferença entre as escalas
                            Celsius(C) e Kelvin(K) é simplesmente o ponto 0.
                            Assim para fazermos a conversão basta somar 273.</p>   
                    </fieldset>         
                    <fieldset id="fieldTemperatura">
                        <legend>Digite uma Temperatura:</legend>
                        <div id="variaveis">
                            <input class="inputNumeros" id="inputTemperatura" required="required"/>
                        </div>
                    </fieldset>
                    <fieldset id="fieldBotoesTemperatura">
                        <legend>Selecione uma Opção:</legend>
                        <div class="botao">
                            <input type="button" id="btnConverterCparaF" value="ºC para ºF" class="btn">
                        </div>
                        <div class="botao">
                            <input type="button" id="btnConverterCparaK" value="ºC para K" class="btn">
                        </div>
                        <div class="botao">
                            <input type="button" id="btnConverterFparaC" value="ºF para ºC" class="btn">
                        </div>
                        <div class="botao">
                            <input type="button" id="btnConverterKparaC" value="K para ºC" class="btn">
                        </div>
                    </fieldset>   
                    <fieldset id="fieldFormula">
                        <legend>Fórmula:</legend> 
                        <div id="divFormula">
                            <label class="lblFormula" id="lblFormula" value=""/>
                        </div>   
                    </fieldset>
                    <fieldset id="fieldResultado">
                        <legend>Resultado:</legend>    
                        <div id="divResultado">
                            <input class="lblResultado" id="inputResultado" readonly="readonly"/>
                            <div class="botao">
                                <input type="button" id="btnVoltar" value="Voltar" class="btn">
                            </div>
                        </div>
                    </fieldset>
                </fieldset>
            </form>
        </div>
    </body>
</html>
