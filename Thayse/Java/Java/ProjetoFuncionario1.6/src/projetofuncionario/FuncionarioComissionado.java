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
public class FuncionarioComissionado extends Funcionario{
    private double salarioBase;
    private double valorVendas;
    private double porcentagemComissao;
    
    public FuncionarioComissionado() {
        
    }
    
    public FuncionarioComissionado(String n, char s, String cpf, String rua, int numero) {
        super(n, s, cpf, rua, numero);
    }
    
    
    
    public double getSalarioBase() {
        return this.salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double getValorVendas() {
        return this.valorVendas;
    }
    
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    
    public double getPorcentagemComissao() {
        return this.porcentagemComissao;
    }
    
    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }
   
    @Override
    public double salarioBruto(double salario) {
        
        super.salario = getSalarioBase() + getValorVendas() * (getPorcentagemComissao()/100);
        return this.salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
