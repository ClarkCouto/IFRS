function validar(){
	d = document.calculadora;
	if(d.numero1.value == ""){
		alert("Preencha o Numero 1!");
		d.numero1.focus();
		return false;
	}
	else if(d.numero2.value == ""){
		alert("Preencha o Numero 2!");
		d.numero2.focus();
		return false;
	}
	else if(isNaN(d.numero1.value)){
		alert("O campo Numero 1 não e um numero valido");
		d.numero1.focus();
		return false;
	}
	else if(isNaN(d.numero2.value)){
		alert("O campo Numero 2 não e um numero valido");
		d.numero2.focus();
		return false;
	}
	else{
		return true;
	}
};
			
function somar(){
	if(validar()){
		d = document.calculadora;
		num1 = parseInt(d.numero1.value);
		num2 = parseInt(d.numero2.value);
		resultado = num1 + num2;
		alert("A soma de " + num1 + " + " + num2 + " = " + resultado);
	}
};

function subtrair(){
	if(validar()){
		d = document.calculadora;
		num1 = parseInt(d.numero1.value);
		num2 = parseInt(d.numero2.value);
		resultado = num1 - num2;
		alert("A soma de " + num1 + " - " + num2 + " = " + resultado);
	}
};

function dividir(){
	if(validar()){
		d = document.calculadora;
		num1 = parseInt(d.numero1.value);
		num2 = parseInt(d.numero2.value);
		if(num2 == 0){
			alert("Impossível dividir por 0!");
			return false;
		}
		else{
			resultado = num1 / num2;
			alert("A soma de " + num1 + " / " + num2 + " = " + resultado);
		}
	}
};

function multiplicar(){
	if(validar()){
		d = document.calculadora;
		num1 = parseInt(d.numero1.value);
		num2 = parseInt(d.numero2.value);
		resultado = num1 * num2;
		alert("A soma de " + num1 + " * " + num2 + " = " + resultado);
	}
};
