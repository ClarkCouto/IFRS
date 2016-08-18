
<HTML>
<HEAD>
<meta charset="UTF-8">
<TITLE>
Atividade PHP
</TITLE>
</HEAD>
<BODY>
<h1> Numeros Impares entre 0 e 100</h1>
<?php
for($i = 0; $i <= 100; $i = $i + 1){
	if ($i % 2 != 0) {
		echo "Este numero e impar: $i <br/>";
	}
}
?>
<h1> Numeros Primos entre 0 e 100</h1>
<?php
$count = 0;
for($primos = 0; $primos <= 100; $primos++){
	for ($i=1; $i <= $primos; $i++) {
		if ($primos % $i == 0) {
			$count++;
		}
	}
	if ($count == 2) {
		echo "Numero primo: $primos <br/>";
		}
	$count = 0;
	
	
}
?>
<h1> Multiplos de 4</h1>
<?php


	for ($i=0; $i <= 100; $i++) {
		if ($i % 4 == 0) {
			echo "Multiplo de 4: $i <br/>";
		}
	}
	

?>
<h1> soma elementos pares </h1>
<?php 

	$soma = 0;
	for ($i=0; $i <=100; $i++) {
		if ($i % 2 == 0)
			$soma = $soma + $i;
	}
	echo "Soma de todos os pares: $soma <br/>"

?>

<h1> Tabela </h1>

<?php 
	echo "<table>";
        for ($i=0;$i<=100;$i++)
        {
            if ($i % 5 == 0)
                switch($i)
                {
                    case 0:
                        echo "<tr>";
                        break;
                    default:
                        echo "</tr><tr>";
                        break;
                }
            echo "<td>	| 	$i 	|	 </td>";
            
        }
    echo "</tr></table>";
	
?>



</BODY>
</HTML>