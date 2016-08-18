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
            
            //Funcionario func1 = new Funcionario();
            //Funcionario func2 = new Funcionario();
            
            FuncionarioHorista func1h = new FuncionarioHorista();
            FuncionarioFixo func1fixo = new FuncionarioFixo();
            FuncionarioComissionado func1c = new FuncionarioComissionado();
            TelaFuncionario tela = new TelaFuncionario(func1fixo, func1h, func1c);
            /*
            tela.leNome();
            tela.leCpf();
            tela.leSexo();
            tela.leSalarioBruto();
            tela.leEndereco();
            tela.setFuncionario(func2);
            */
            
            
            tela.leNome();
            tela.leCpf();
            tela.leSexo();
            tela.leSalarioBruto();
            tela.leEndereco();
            tela.setFuncionarioFixo(func1fixo);
            tela.getFuncionarioFixo();
            
            tela.leNomeH();
            tela.leCpfH();
            tela.leSexoH();
            tela.leHorasTrabalhadas();
            tela.leSalarioPorHora();
            tela.leEnderecoH();
            tela.setFuncionarioHorista(func1h);
            tela.getFuncionarioHorista();
            
            tela.leNomeC();
            tela.leCpfC();
            tela.leSexoC();
            tela.leSalarioBase();
            tela.leValorVendas();
            tela.lePorcentagemComissao();
            tela.leEnderecoC();
            tela.setFuncionarioComissionado(func1c);
            tela.getFuncionarioComissionado();
            /*
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
            
            */
            
            
            
            System.out.println("----------------------------------");
            System.out.println("Dados do Funcionário Fixo:");
            System.out.println("----------------------------------");
            System.out.println("Nome: " + func1fixo.getNome());
            System.out.println("Sexo: " + func1fixo.getSexo());
            System.out.println("CPF: " + func1fixo.getCpf());
            System.out.println(func1fixo.getEndereco());
            System.out.println("----------------------------------");
            System.out.println("Salário Bruto:             " + func1fixo.getSalario());
            System.out.println("Taxa INSS:                   " + func1fixo.txINSS()*100 + "%");
            System.out.println("Valor do INSS:               " + func1fixo.valorINSS());
            System.out.println("                   ---------------");
            System.out.println("Salário Líquido:            " + func1fixo.salarioLiquido());
            System.out.println("----------------------------------");
            
            System.out.println("----------------------------------");
            System.out.println("Dados do Funcionário Horista:");
            System.out.println("----------------------------------");
            System.out.println("Nome: " + func1h.getNome());
            System.out.println("Sexo: " + func1h.getSexo());
            System.out.println("CPF: " + func1h.getCpf());
            System.out.println(func1h.getEndereco());
            System.out.println("----------------------------------");
            System.out.println("Salário Bruto:             " + func1h.salarioBruto(func1h.salario));
            System.out.println("Taxa INSS:                   " + func1h.txINSS()*100 + "%");
            System.out.println("Valor do INSS:               " + func1h.valorINSS());
            System.out.println("                   ---------------");
            System.out.println("Salário Líquido:            " + func1h.salarioLiquido());
            System.out.println("----------------------------------");
            
            
            System.out.println("----------------------------------");
            System.out.println("Dados do Funcionário Comissionado:");
            System.out.println("----------------------------------");
            System.out.println("Nome: " + func1c.getNome());
            System.out.println("Sexo: " + func1c.getSexo());
            System.out.println("CPF: " + func1c.getCpf());
            System.out.println(func1c.getEndereco());
            System.out.println("----------------------------------");
            System.out.println("Salário Bruto:             " + func1c.salarioBruto(func1c.salario));
            System.out.println("Taxa INSS:                   " + func1c.txINSS()*100 + "%");
            System.out.println("Valor do INSS:               " + func1c.valorINSS());
            System.out.println("                   ---------------");
            System.out.println("Salário Líquido:            " + func1c.salarioLiquido());
            System.out.println("----------------------------------");
            
            /*
            if (func1.equals(func2)) {
                System.out.println("Funcionários são iguais");
            } else {
                System.out.println("Funcionários são diferentes");
            }
            */
        }
}
