/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuncionario;

import java.util.Scanner;


/**
 *
 * @author Thayse
 */
public class TelaFuncionario {
    private Funcionario funcionario;
    
    
    protected static Scanner scan = new Scanner(System.in);
    
    public TelaFuncionario(Funcionario f) {
        setFuncionario(f);
        
        
        
    }
    
    public void setFuncionario(Funcionario f){
        if (f==null) {
            throw new RuntimeException("Erro: funcionario null");
        } else {
            this.funcionario = f;
            
        }
    }
    
  
    
    public Funcionario getFuncionario() {
        return funcionario;
    }
    
    public Funcionario leNome() {
        System.out.println("Digite um nome: ");
        String n = scan.nextLine();
        funcionario.setNome(n);
        return funcionario;
    }
    
    public Funcionario leSexo() {
        System.out.println("Digite o sexo: ");
        char sexo = scan.next().charAt(0);
        scan.nextLine();
        funcionario.setSexo(sexo);
        return funcionario;
    }
    
    public Funcionario leCpf() {
        System.out.println("Digite o cpf: ");
        String cpf = scan.nextLine();
        funcionario.setCpf(cpf);
        return funcionario;
    }
    
    public Funcionario leSalarioBruto() {
        System.out.println("Digite o salario bruto: ");
        double sB = scan.nextDouble();
        scan.nextLine();
        funcionario.setSalarioBruto(sB);
        return funcionario;
    }
    
    public Funcionario leEndereco() {
        System.out.println("Digite a rua: ");
        String r = scan.nextLine();
        Endereco e = new Endereco();
        e.setRua(r);
        System.out.println("Digite o numero: ");
        int n = scan.nextInt();
        scan.nextLine();
        e.setNumero(n);
        funcionario.setEndereco(e);
        
        return funcionario;
    }
    
  
    
    
    
    
}
