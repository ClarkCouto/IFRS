$(document).ready(function (){  
    $('#num1').focus();
    $('#btnVoltarFigurasInicio').click(function(){
       window.location="../PaginaInicial.html"; 
    });
    
    $('.btnVoltarFiguras').click(function(){
       window.location="Figuras.php"; 
    });
    
    $('#btnCalcularCirculo').click(function(){
       var numero = $('#num2').val() * ($('#num1').val() * $('#num1').val()); 
       $('#areaCirculo').val(numero);
    });
    
    $('#btnCalcularPararelogramo').click(function(){
       var numero = $('#num1').val() * $('#num2').val(); 
       $('#areaParalelogramo').val(numero);
    });
    
    $('#btnCalcularQuadrado').click(function(){
       var numero = $('#num1').val() * $('#num1').val(); 
       $('#areaQuadrado').val(numero);
    });
    
    $('#btnCalcularRetangulo').click(function(){
       var numero = $('#num1').val() * $('#num2').val(); 
       $('#areaRetangulo').val(numero);
    });
    
    $('#btnCalcularTriangulo').click(function(){
       var numero = ($('#num1').val() * $('#num2').val())/2; 
       $('#areaTriangulo').val(numero);
    });
    
    $('#btnCalcularTrapezio').click(function(){
       var numero = (($('#num1').val() * 1) + ($('#num2').val() * 1))/2;
       numero = (numero * 1 * $('#num3').val());
       $('#areaTrapezio').val(numero);
    });
});

