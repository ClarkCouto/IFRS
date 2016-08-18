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
public class ContaPoupanca extends Conta{
    public static double taxaJuros;

    public ContaPoupanca(int agencia, int conta, Cliente cli) {
        super(agencia, conta, cli);
    }
    
    public ContaPoupanca(int agencia, int conta, double valor, Cliente cli) {
        super(agencia, conta, valor, cli);
    }
    
    public double getTaxaJuros(){
        return this.taxaJuros;
    }
    
    public void setTaxaJuros(double valor){
        ContaPoupanca.taxaJuros = valor;
    }
    
    public void aplicarJuros(){
        this.creditar(this.getSaldo() * this.getTaxaJuros() / 100);
    }
}
