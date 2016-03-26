
var num1 = "";
var num2 = "";
var operacao = "";
$(document).ready(function (){
	$('#visor').val("");
	$('#visor').focus();
	var d = document.calculadora;

	limparTudo =function(){	
		num1 = "";
		num2 = "";
		operacao = "";
		d.visor.value = "";
		d.visor.focus();	
	};
	
	calcular = function(){
		if(num2 == ""){
			num2 = d.visor.value;
		}
		var resultadoFinal = "";
		switch(operacao){
			case '+':
				resultadoFinal = parseInt(num1) + parseInt(num2);
				break;
			case '-':
				resultadoFinal = parseInt(num1) - parseInt(num2);
				break;
			case '*':
				resultadoFinal = parseInt(num1) * parseInt(num2);
				break;
			case '/':
				resultadoFinal = parseInt(num1) / parseInt(num2);
				break;
		}
		d.visor.value = resultadoFinal;
		num1 = resultadoFinal;
		num2 = "";
		operacao = "";	
	};
	
	
	numero = function(num){
		if(num1 == d.visor.value){
			d.visor.value = num;
		}
		else{
			d.visor.value += num;
		}
		d.visor.focus();
	};
		
	validar = function(){	
		if (event.which == 13) {
		    calcular();
		}
		else{
			valor = d.visor.value;
			if(valor != ""){
				ultimo = valor.charAt(valor.length-1);
				if(isNaN(ultimo)){
					if(ultimo == "+" || ultimo == "-" || ultimo == "*" || ultimo == "/"){
						numero = valor.substring(0,(valor.length - 1));
						d.visor.value = numero;
						efetuarOperacao(ultimo);
					}
					else{
						d.visor.value = valor.substring(0,(valor.length - 1));
						d.visor.focus();
					}
				}
				else
					if(valor.substring(0,(valor.length - 1)) == num1){
						d.visor.value = ultimo;
				}
			}
		}
	};
	
	efetuarOperacao = function(op){
		if(num1 == ""){
			num1 = d.visor.value;
			operacao = op;
			d.visor.value = "";
		}
		else if(operacao != ""){
			if(num2 != ""){
				calcular();
			}
			else{
				num2 = d.visor.value;
				calcular();
			}
		}
		operacao = op;
		d.visor.focus();
	};

});