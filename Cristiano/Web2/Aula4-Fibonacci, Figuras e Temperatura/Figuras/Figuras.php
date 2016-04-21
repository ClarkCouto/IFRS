<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <script type="text/javascript" src="../JavaScript/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="../JavaScript/FigurasJS.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/ArquivoCSS.css" />
        <title>Figuras</title>
    </head>
    <body>
        <div class="wrapPaginaCompleta">
            <form class="formulario" method="post" action="FigurasGeometricasResultado.php">
                <fieldset id="fieldPaginaFiguras">
                    <fieldset id="fieldInformacoesFiguras">
                        <legend>Exercício Figuras Geométricas</legend>
                        <p>Implemente um programa web na linguagem PHP que permita
                        identificar uma das figuras geométricas e apresentadas
                        abaixo, e na sequencia possibilite entrar com os
                        parâmetros necessários para realizar o cálculo da área.</p> 
                    </fieldset>
                    <fieldset id="fieldFiguras">
                        <legend>Clique em uma figura para calcular sua área:</legend>
                        <div class="figuras" id="quadrado">
                            <a href="Quadrado.php"><img src="../Imagens/quadrado.jpg" class="figuras" alt="quadrado" height="100" width="100"></a>
                        </div>

                        <div class="figuras" id="retangulo">
                            <a href="Retangulo.php"><img src="../Imagens/retangulo.jpg" class="figuras" alt="retangulo" height="100" width="100"></a>
                        </div>

                        <div class="figuras" id="triangulo">
                            <a href="Triangulo.php"><img src="../Imagens/triangulo.jpg" class="figuras" alt="triangulo" height="100" width="100"></a>
                        </div>

                        <div class="figuras" id="paralelogramo">
                            <a href="Paralelogramo.php"><img src="../Imagens/paralelogramo.jpg" class="figuras" alt="paralelogramo" height="100" width="100"></a>
                        </div>

                        <div class="figuras" id="trapezio">
                            <a href="Trapezio.php"><img src="../Imagens/trapezio.jpg" class="figuras" alt="trapezio" height="100" width="100"></a>
                        </div>

                        <div class="figuras" id="circulo">
                            <a href="Circulo.php"><img src="../Imagens/circulo.jpg" class="figuras" alt="circulo" height="100" width="100"></a>
                        </div>
                    </fieldset>
                    <div class="divBotoes">
                        <div class="botao">
                            <input type="button" id="btnVoltarFigurasInicio" value="Voltar" class="btn"/>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </body>
</html>
