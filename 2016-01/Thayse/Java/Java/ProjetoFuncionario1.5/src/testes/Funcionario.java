package testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import funcionario.FuncionarioAbstrato;
import funcionario.FuncionarioComissionado;
import funcionario.FuncionarioFixo;
import funcionario.FuncionarioHorista;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import static testes.TelaFuncionario.scan;
/**
 *
 * @author Thayse
 */
public class Funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        FuncionarioHorista funch = new FuncionarioHorista();
        FuncionarioFixo ffixo = new FuncionarioFixo();
        FuncionarioComissionado funcc = new FuncionarioComissionado();
        TelaFuncionario tela = new TelaFuncionario(ffixo, funch, funcc);
        
        tela.leDados(ffixo);
        
        tela.mostraDados(funcc);
        
        TestaFuncionario5 testa = new TestaFuncionario5();
        
        System.out.println("Digite a sua data de nascimento no seguinte formato: dia/mês/ano \n");
        String string = scan.nextLine();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = format.parse(string);
        funch.setDate(date);
        
        Date d = new Date();
        
        
        Calendar dataAtual = Calendar.getInstance(Locale.getDefault());
        dataAtual.setTime(d);
        Calendar dataAniver = Calendar.getInstance(Locale.getDefault());
        dataAniver.setTime(funch.getDate());
        
        
        if ((dataAtual.get(MONTH) == dataAniver.get(MONTH)) && (dataAtual.get(DAY_OF_MONTH) == dataAniver.get(DAY_OF_MONTH))) {
            System.out.println("Hoje é o aniversário desse funcionário!");
            
        } else {
            System.out.println("Hoje não é o aniversário desse funcionário.");
            int days = (int)dataAniver.get(Calendar.DAY_OF_YEAR) - dataAtual.get((Calendar.DAY_OF_YEAR));
            if (days <= 0) {
                System.out.println("O aniversário já passou.");
            } else {
                System.out.println("Faltam " + days + " dias pro aniversário");
            }
        }


        
        if (dataAtual.get(MONTH) == dataAniver.get(MONTH)) {
            System.out.println("O aniversário é esse mês.");
        } else {
            System.out.println("O aniversário não é esse mês.");
        }
        testa.diasAniversario();
        testa.mesAniversario();
        testa.testaAniversario();
        
        
    }
    
}
