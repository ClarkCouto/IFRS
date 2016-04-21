var numero;

$(document).ready(function (){  
    $('#lblFormula').text("");     
    $('#inputTemperatura').focus();
 
    $('#btnVoltar').click(function(){
       window.location="../PaginaInicial.html"; 
    });
    
    $('#btnConverterCparaF').click(function(){
       $('#lblFormula').text("°F = °C × 1,8 + 32");
       $('#fieldFormula').show();
       numero = ($('#inputTemperatura').val() * 1.8) + 32; 
       $('#inputResultado').val(numero); 
    });
    
    $('#btnConverterFparaC').click(function(){
       $('#lblFormula').text("°C = (°F − 32) / 1,8");
       $('#fieldFormula').show();
       numero = ($('#inputTemperatura').val() - 32) / 1.8; 
       $('#inputResultado').val(numero); 
    });
    
    $('#btnConverterKparaC').click(function(){
       $('#lblFormula').text("°C = K − 273,15");
       $('#fieldFormula').show();
       numero = $('#inputTemperatura').val() - 273.5; 
       $('#inputResultado').val(numero); 
    });
    
    $('#btnConverterCparaK').click(function(){
       $('#lblFormula').text("K = °C + 273,15");
       $('#fieldFormula').show();
       numero = ($('#inputTemperatura').val() * 1) + 273.15; 
       $('#inputResultado').val(numero); 
    });
});