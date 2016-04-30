/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

/**
 *
 * @author Thayse
 */
public class ContaCorrente extends Conta {
    private static double taxaCPMF;
    private double totalCPMF;
    
    public static double getTaxaCPMF() {
        return taxaCPMF;
    }
    
    public static void setTaxaCPMF(double valor) {
        ContaCorrente.taxaCPMF = valor;
    }

    public ContaCorrente(int agencia, int conta, Cliente cli) {
        super(agencia, conta, cli);
    }
    
    public ContaCorrente(int agencia, int conta, double valor, Cliente cli) {
        super(agencia, conta, valor, cli);
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
