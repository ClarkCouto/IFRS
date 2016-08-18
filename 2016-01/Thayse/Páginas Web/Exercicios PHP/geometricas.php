<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <title>Figuras Geometricas</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
    
    <?php
    $lado = 0;
    $area = 0;
    $altura = 0;
    $largura = 0;
    $base = 0;
    $baseSup = 0;
    $raio = 0;
    
    define("pi", "3.1416");
    
    if (empty($_GET['figura'])) {
    	echo '<script> alert ("Nada foi selecionado!") </script>';
    	header("location: figuras.php");
    } else {
    	$figura = $_GET["figura"];
    	if ($figura == "quadrado") {
    		if (isset($_POST["enviar"])) {
    			$lado = $_POST["lado"];
    			$area = $lado*$lado;
    			echo "<script> alert('Area: $area') </script>";
    	
    		}
    	} else if ($figura == "retangulo") {
    		if (isset($_POST["enviar"])) {
    			$area = $_POST["altura"] * $_POST["largura"];
    			echo "<script> alert('Area: $area') </script>";
    		}
    	} else if ($figura == "triangulo") {
    		if (isset($_POST["enviar"])) {
    			$area = ($_POST["altura"] * $_POST["base"])/2;
    			echo "<script> alert('Area: $area') </script>";
    		}
    	} else if ($figura == "paralelogramo") {
    		if (isset($_POST["enviar"])) {
    			$area = ($_POST["altura"] * $_POST["base"]);
    			echo "<script> alert('Area: $area') </script>";
    		}
    	} else if ($figura == "trapezio") {
    		if (isset($_POST["enviar"])) {
    			$area = (($_POST["baseSup"] + $_POST["base"])/2)*$_POST["altura"];
    			echo "<script> alert('Area: $area') </script>";
    		}
    	} else if ($figura == "circulo") {
    		if (isset($_POST["enviar"])) {
    			$area = pi * ($_POST["raio"])^2;
    			echo "<script> alert('Area: $area') </script>";
    		}
    	}
    	
    	
    	
    	
    	if ($figura == "quadrado") {
    		echo '
	    <form method="post">
	    <p> Insira o tamanho do lado do quadrado. </p>
	    <input type="text" name="lado"> <br>
	    <input class="btn" type="submit" value="enviar" name="enviar">
	    <input class="btn" type="button" value="voltar" onClick="history.go(-1)">
    	
	    </form>
			';
    	} elseif ($figura == "retangulo") {
    		echo '
    	<form method="post">
    	<p> Insira a largura do retangulo. </p>
    	<input type="text" name="largura"> <br>
    	<p> Insira a altura do retangulo. </p>
    	<input type="text" name="altura"> <br>
    	<input class="btn" type="submit" value="enviar" name="enviar">
	    <input class="btn" type="button" value="voltar" onClick="history.go(-1)">
    	';
    	} elseif ($figura == "triangulo") {
    		echo '
    		<form method="post">
	    	<p> Insira a base do triangulo. </p>
	    	<input type="text" name="base"> <br>
	    	<p> Insira a altura do triangulo. </p>
	    	<input type="text" name="altura"> <br>
	    	<input class="btn" type="submit" value="enviar" name="enviar">
		    <input class="btn" type="button" value="voltar" onClick="history.go(-1)">
    	';
    	} elseif ($figura == "paralelogramo") {
    		echo '
    		<form method="post">
	    	<p> Insira a base do paralelogramo. </p>
	    	<input type="text" name="base"> <br>
	    	<p> Insira a altura do paralelogramo. </p>
	    	<input type="text" name="altura"> <br>
	    	<input class="btn" type="submit" value="enviar" name="enviar">
		    <input class="btn" type="button" value="voltar" onClick="history.go(-1)">
    	';
    	} elseif ($figura == "trapezio") {
    		echo '
    		<form method="post">
	    	<p> Insira a base inferior do trapezio. </p>
	    	<input type="text" name="base"> <br>
	    	<p> Insira a base superior do trapezio. </p>
	    	<input type="text" name="baseSup"> <br>
    		<p> Insira a altura do trapezio. </p>
	    	<input type="text" name="altura"> <br>
	    	<input class="btn" type="submit" value="enviar" name="enviar">
		    <input class="btn" type="button" value="voltar" onClick="history.go(-1)">
    	';
    	} elseif ($figura == "circulo") {
    		echo '
    		<form method="post">
	    	<p> Insira o raio. </p>
	    	<input type="text" name="raio"> <br>
	    	<input class="btn" type="submit" value="enviar" name="enviar">
		    <input class="btn" type="button" value="voltar" onClick="history.go(-1)">
    	';
    	} else {
    		echo '<script> alert ("Nada foi selecionado!") </script>';
    	}
    }
    
    
    ?>
    
    
</body>
</html>