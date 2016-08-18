/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author matheus
 */
public class FuncionarioComissionado extends FuncionarioAbstrato {
    
    private float salarioBase;
    private float valorVendas;
    private float porcentagemComissao;

    public FuncionarioComissionado(String nome, char sexo, String cpf,
                                   String rua, int numero, String complemento,
                                   String bairro, String cidade,
                                   float salarioBase, float valorVendas,
                                   float porcentagemComissao) {
        super(nome, sexo, cpf, rua, numero, complemento, bairro, cidade);
        this.salarioBase = salarioBase;
        this.valorVendas = valorVendas;
        this.porcentagemComissao = porcentagemComissao;
    }
    
    @Override
    public float salarioBruto() {
        return getSalarioBase() + (getValorVendas() * getPorcentagemComissao());
    }

    /**
     * @return the salarioBase
     */
    public float getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return the valorVendas
     */
    public float getValorVendas() {
        return valorVendas;
    }

    /**
     * @param valorVendas the valorVendas to set
     */
    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }

    /**
     * @return the porcentagemComissao
     */
    public float getPorcentagemComissao() {
        return porcentagemComissao;
    }

    /**
     * @param porcentagemComissao the porcentagemComissao to set
     */
    public void setPorcentagemComissao(float porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }
    
}
