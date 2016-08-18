/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import funcionario.FuncionarioHorista;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Thayse
 */
public class TestaFuncionario5 {
    FuncionarioHorista funch = new FuncionarioHorista();
    Date d = new Date();
    
    
    
        
    public boolean testaAniversario() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(funch.getDate());
        Calendar calHoje = null;
        calHoje.setTime(d);
        if ((Calendar.MONTH == Calendar.MONTH) && (Calendar.DAY_OF_MONTH == Calendar.DAY_OF_MONTH)) {
            System.out.println("Hoje é o aniversário desse funcionário!");
            return true;
        } else {
            System.out.println("Hoje não é o aniversário desse funcionário.");
            return false;
        }
//        if (d.equals(funch.getDate())) {
//            System.out.println("Hoje é o aniversário desse funcionário!");
//            return true;
//        } else {
//            System.out.println("Hoje não é o aniversário desse funcionário.");
//            return false;
//        }
    }
    
    public void diasAniversario() {
        if (testaAniversario() == false) {
            if (d.after(funch.getDate())) {
                System.out.println("O aniversário já passou.");
            } else {
                System.out.println("Faltam " + funch.getDate().compareTo(d) + "dias pro aniversário");
            }
        }
    }
    
    public void mesAniversario() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(funch.getDate());
        if (Calendar.MONTH == cal.get(Calendar.MONTH)) {
            System.out.println("O aniversário é esse mês.");
        } else {
            System.out.println("O aniversário não é esse mês.");
        }
    }
    
    
}
