/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

import java.util.Date;

/**
 *
 * @author Thayse
 */
public class FuncionarioComissionado extends FuncionarioAbstrato{
    //atributos da classe
    private float salarioBase;
    private float valorVendas;
    private float porcentagemComissao;
    
    //construtores
    
    public FuncionarioComissionado() {
        super();
    }
    
    public FuncionarioComissionado(String n, char s, String cpf, Date d, 
                               String rua, int numero, String bairro, String cid) {
        super(n, s, cpf, d, rua, numero, bairro, cid);
      
    }
    
    public FuncionarioComissionado(String n, char s, String cpf, Date d, 
                               String rua, int numero, String complemento, String bairro, String cid) {
        super(n, s, cpf, d, rua, numero, complemento, bairro, cid);
      
    }
    
    //getters e setters
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public float getSalarioBase() {
        return this.salarioBase;
    }
    
    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }
    
    public float getValorVendas() {
        return this.valorVendas;
    }
    
    public void setPorcentagemComissao(float porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao/100;
    }
    
    public float getPorcentagemComissao() {
        return this.porcentagemComissao;
    }
    
    @Override
    public float salarioBruto() {
         return this.getSalarioBase() + this.getValorVendas() * this.getPorcentagemComissao();
    }
    
}
