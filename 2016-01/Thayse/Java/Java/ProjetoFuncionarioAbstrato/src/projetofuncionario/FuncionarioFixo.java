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
public class FuncionarioFixo extends Funcionario {
    private double salarioBruto;
    
    public FuncionarioFixo() {
        
    }
    
    public FuncionarioFixo(String n, char s, String cpf, String rua, int numero) {
        super(n, s, cpf, rua, numero);
    }
    
    @Override
    public double salarioBruto() {
        
        return salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /*
    public double getSalarioBruto() {
    
    }
    
    public void setSalarioBruto(double salarioBruto) {
        
        
    }
    
    
    
    @Override
    public double salarioBruto() {
        
    }
    */
}

