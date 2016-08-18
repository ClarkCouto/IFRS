
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Atividade PHP</title>
<script>
function validateForm() {
    var valor = document.forms["form"]["value1"].value;
    if (valor == null || valor == "") {
        alert("O valor deve ser preenchido.");
        return false;
    }
}
</script>
</head>
<body>
<form name="form" onsubmit="return validateForm()" method="post">
	<h1> Converter </h1>
	<p> Insira o valor para conversao. </p>
	
	<input type="text" name="value1"> <br>
	<br>
	<br>
	De:
	<select style="color:#000" name="selected1">
	  <option style="color:#000" value="C">Celsius</option>
	  <option style="color:#000" value="F">Fahrenheit</option>
	  <option style="color:#000" value="K">Kelvin</option>
	</select>
	Para: 
	<select style="color:#000"  name="selected2">
	  <option style="color:#000" value="C">Celsius</option>
	  <option style="color:#000" value="F">Fahrenheit</option>
	  <option style="color:#000" value="K">Kelvin</option>
	</select>
	<br>
	<br>
	<input class="btn" type="submit" name="enviar" value="enviar">
	<input class="btn" type="button" value="voltar" onClick="history.go(-1)">	
</form>

<?php 
$result=0;
if (isset($_POST["enviar"])) { 

	$selected1 = $_POST["selected1"];
	$selected2 = $_POST["selected2"];
	$value1 = $_POST["value1"];
	
	
	
	if ($selected1 == "C" && $selected2=="F") {
		$result = $value1 * 1.8 + 32;
	} elseif ($selected1 == "C" && $selected2=="K") {
		$result = $value1 +  273.15;
	} elseif ($selected1 == "C" && $selected2=="C") {
		$result = $value1;
	} elseif ($selected1 == "F" && $selected2=="C") {
		$result = ($value1 - 32) / 1.8;
	} elseif ($selected1 == "F" && $selected2=="K") {
		$result = (($value1 - 32) / 1.8) + 273.15;
	} elseif ($selected1 == "F" && $selected2=="F") {
		$result = $value1;
	} elseif ($selected1 == "K" && $selected2=="C") {
		$result = $value1 - 273.15;
	} elseif ($selected1 == "K" && $selected2=="K") {
		$result = $value1;
	} elseif ($selected1 == "K" && $selected2=="F") {
		$result = ($value1 - 273.15) * 1.8 + 32;
	}
	
}


?>


<div class="conv">
<p> Resultado: <?php echo $result; ?> </p>
</div>

</body>
</html>
