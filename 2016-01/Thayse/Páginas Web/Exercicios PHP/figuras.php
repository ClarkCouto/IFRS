<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <title>Figuras Geometricas</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <script>
        function validateForm()    {

	        	chosen = ""
	        	len = document.form.figura.length
	
	        	for (i = 0; i <len; i++) {
		        	if (document.form.figura[i].checked) {
		        	chosen = document.form.figura[i].value
		        	}
	        	}
	
	        	if (chosen == "") {
		        	alert("Nenhuma figura selecionada.");
		        	return false;
	        	}
	        	else {
		        	
		        	return true;
	        	}
        	}
        </script>
    </head>
    <body>
    
        <form name="form" onsubmit="return validateForm()" id="figuras" action="geometricas.php" method="get">
            <p> Selecione uma figura: </p>
            <input type="radio" name="figura" value="quadrado"> Quadrado<br>
            <input type="radio" name="figura" value="retangulo"> Retangulo<br>
            <input type="radio" name="figura" value="triangulo"> Triangulo <br>
            <input type="radio" name="figura" value="paralelogramo"> Paralelogramo<br>
            <input type="radio" name="figura" value="trapezio"> Trapezio<br>
            <input type="radio" name="figura" value="circulo"> Circulo <br>
            <br> <input class="btn" type="submit" value="enviar"> 
            <input class="btn" type="button" value="voltar" onClick="history.go(-1)">
        </form>
        
        
    </body>
</html>
