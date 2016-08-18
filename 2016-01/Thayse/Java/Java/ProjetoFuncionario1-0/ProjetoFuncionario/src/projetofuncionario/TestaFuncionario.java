/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuncionario;

/**
 *
 * @author Thayse
 */
public class TestaFuncionario {
    
    
    	public static void main(String[] args) {
            
            Funcionario func = new Funcionario();
            
            func.setNome("João da Silva");
            func.setCpf("123.456.789-99");
            func.setSexo('M');
            func.setSalarioBruto(10000.00);
        
            System.out.println("----------------------------------");
            System.out.println("Dados do Funcionário:");
            System.out.println("----------------------------------");
            System.out.println("Nome: " + func.getNome());
            System.out.println("Sexo: " + func.getSexo());
            System.out.println("CPF: " + func.getCpf());
            System.out.println("----------------------------------");
            System.out.println("Salário Bruto:             " + func.getSalarioBruto());
            System.out.println("Taxa INSS:                   " + func.txINSS()*100 + "%");
            System.out.println("Valor do INSS:               " + func.valorINSS());
            System.out.println("                   ---------------");
            System.out.println("Salário Líquido:            " + func.salarioLiquido());
            System.out.println("----------------------------------");
            
            
        }
}
