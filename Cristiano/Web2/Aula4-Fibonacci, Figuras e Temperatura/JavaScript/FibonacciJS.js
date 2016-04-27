var numero;

$(document).ready(function (){  
    $('#inputNumero').focus();
    
    $('#btnVoltarFibonacci').click(function(){
       window.location="../PaginaInicial.html"; 
    });
    
    $('#btnVoltarFibonacciResultado').click(function(){
       window.location="Fibonacci.php"; 
    });
    
    $('#btnCalcular').click(function(){
       numero = $('#inputNumero').val(); 
    });
});