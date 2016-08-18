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
public class TestaFuncionario4 {
    
    public void inicio(){
        Funcionario func = new FuncionarioFixo();

        TelaFuncionario tela = new TelaFuncionario((FuncionarioFixo)func);
        
        tela.leNome();
        tela.leCpf();
        tela.leSexo();
        tela.leSalarioBruto();
        tela.leLimiteINSS();
        tela.leEndereco();
        tela.setFuncionarioFixo((FuncionarioFixo)func);
        tela.getFuncionarioFixo();
        
        System.out.println("----------------------------------");
        System.out.println("Dados do Funcionário Fixo:");
        System.out.println("----------------------------------");
        System.out.println("Nome: " + func.getNome());
        System.out.println("Sexo: " + func.getSexo());
        System.out.println("CPF: " + func.getCpf());
        System.out.println(func.getEndereco());
        System.out.println("----------------------------------");
        System.out.println("Salário Bruto:             " + func.salarioBruto());
        System.out.println("Limite do INSS Inserido:             " + func.getLimiteINSS());
        System.out.println("Taxa INSS:                   " + func.txINSS()*100 + "%");
        System.out.println("Valor do INSS:               " + func.valorINSS());
        System.out.println("                   ---------------");
        System.out.println("Salário Líquido:            " + func.salarioLiquido());
        System.out.println("----------------------------------");
    }
}
