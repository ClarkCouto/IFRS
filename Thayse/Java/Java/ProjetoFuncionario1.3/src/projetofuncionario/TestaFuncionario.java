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
            
            Funcionario func1 = new Funcionario();
            Funcionario func2 = new Funcionario();
            TelaFuncionario tela = new TelaFuncionario(func1);
            
            
           
            
            /*
            func.setNome("João da Silva");
            func.setCpf("123.456.789-99");
            func.setSexo('M');
            func.setSalarioBruto(10000.00);
            Endereco e = new Endereco("Lajeado", 1621);
            func.setEndereco(e);
            */
            
            tela.leNome();
            tela.leCpf();
            tela.leSexo();
            tela.leSalarioBruto();
            tela.leEndereco();
            tela.setFuncionario(func2);
            
            tela.leNome();
            tela.leCpf();
            tela.leSexo();
            tela.leSalarioBruto();
            tela.leEndereco();
            tela.setFuncionario(func1);
            
            tela.getFuncionario();
        
            System.out.println("----------------------------------");
            System.out.println("Dados do Funcionário:");
            System.out.println("----------------------------------");
            System.out.println("Nome: " + func1.getNome());
            System.out.println("Sexo: " + func1.getSexo());
            System.out.println("CPF: " + func1.getCpf());
            System.out.println(func1.getEndereco());
            System.out.println("----------------------------------");
            System.out.println("Salário Bruto:             " + func1.getSalarioBruto());
            System.out.println("Taxa INSS:                   " + func1.txINSS()*100 + "%");
            System.out.println("Valor do INSS:               " + func1.valorINSS());
            System.out.println("                   ---------------");
            System.out.println("Salário Líquido:            " + func1.salarioLiquido());
            System.out.println("----------------------------------");
            
            
            
            
            
            System.out.println("----------------------------------");
            System.out.println("Dados do Funcionário:");
            System.out.println("----------------------------------");
            System.out.println("Nome: " + func2.getNome());
            System.out.println("Sexo: " + func2.getSexo());
            System.out.println("CPF: " + func2.getCpf());
            System.out.println(func2.getEndereco());
            System.out.println("----------------------------------");
            System.out.println("Salário Bruto:             " + func2.getSalarioBruto());
            System.out.println("Taxa INSS:                   " + func2.txINSS()*100 + "%");
            System.out.println("Valor do INSS:               " + func2.valorINSS());
            System.out.println("                   ---------------");
            System.out.println("Salário Líquido:            " + func2.salarioLiquido());
            System.out.println("----------------------------------");
            
            if (func1.equals(func2)) {
                System.out.println("Funcionários são iguais");
            } else {
                System.out.println("Funcionários são diferentes");
            }
        }
}
