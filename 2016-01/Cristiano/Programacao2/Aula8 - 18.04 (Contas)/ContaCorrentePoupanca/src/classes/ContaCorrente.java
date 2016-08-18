/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Clark
 */
public class ContaCorrente extends Conta{
    private static double taxaCPMF;
    private double totalCPMF;
    
    public ContaCorrente(int agencia, int conta, Cliente cli) {
        super(agencia, conta, cli);
    }
    
    public ContaCorrente(int agencia, int conta, double valor, Cliente cli) {
        super(agencia, conta, valor, cli);
    }
    
    public double getTaxaCPMF(){
        return taxaCPMF;
    }
    public void setTaxaCPMF(double valor){
        ContaCorrente.taxaCPMF = valor;
    }
    
    @Override
    public void debitar(double valor){
        super.debitar(valor + this.getTaxaCPMF());
        this.totalCPMF += this.getTaxaCPMF();   
    }
    
    public double getTotalCPMF(){
        return this.totalCPMF;
    }
}
