function validaCampos() {
	d = document.calculadora;
	if (d.n1.value =="") {
		alert("O campo " + d.n1.name + " deve ser preenchido!");
		d.n1.focus();
		return false;
	} else if (d.n2.value =="") {
		alert("O campo " + d.n2.name + " deve ser preenchido!");
		d.n2.focus();
		return false;
	} else {
		return true;
	}

}

function somar1() {
	if (validaCampos() == true) {
		d = document.calculadora;
		numero1 = parseInt(d.n1.value);
		numero2 = parseInt(d.n2.value);
		
		resultado = (numero1 + numero2);
		
		alert("O resultado é: " + resultado);
	} 
	
}

function subtrair1() {
	if (validaCampos() == true) {
		d = document.calculadora;
		numero1 = parseInt(d.n1.value);
		numero2 = parseInt(d.n2.value);
		
		resultado = (numero1 - numero2);
		
		alert("O resultado é: " + resultado);
	} 
	
}

function multiplicar1() {
	if (validaCampos() == true) {
		d = document.calculadora;
		numero1 = parseInt(d.n1.value);
		numero2 = parseInt(d.n2.value);
		
		resultado = (numero1 * numero2);
		
		alert("O resultado é: " + resultado);
	} 
	
}

function dividir1() {
	if (validaCampos() == true) {
		d = document.calculadora;
		numero1 = parseInt(d.n1.value);
		numero2 = parseInt(d.n2.value);
		
		resultado = (numero1 / numero2);
		
		alert("O resultado é: " + resultado);
	} 
	
}