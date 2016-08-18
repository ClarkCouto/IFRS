
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Atividade PHP</title>
<script>
function validateForm() {
    var valor = document.forms["form"]["numero"].value;
    if (valor == null || valor == "") {
        alert("O numero deve ser preenchido.");
        return false;
    }
}
</script>
</head>
<body>
<form name=form onsubmit="return validateForm()" action="fibonacci.php" method="get">
<p> Insira um numero: <br> </p>
<input type="text" name="numero"> <br>
<br>
<input class="btn" type="submit" value="enviar">
<input class="btn" type="button" value="voltar" onClick="history.go(-1)">
</form>

</body>
</html>
