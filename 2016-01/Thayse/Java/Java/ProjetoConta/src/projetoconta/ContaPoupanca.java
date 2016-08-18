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
public class ContaPoupanca extends Conta {
    private static double taxaJuros;
    
    public double getTaxaJuros() {
        return this.taxaJuros;
    }
    
    public void setTaxaJuros(double valor) {
        ContaPoupanca.taxaJuros = valor;
    }

    public ContaPoupanca(int agencia, int conta, Cliente cli) {
        super(agencia, conta, cli);
    }
    
    public ContaPoupanca(int agencia, int conta, double valor, Cliente cli) {
        super(agencia, conta, valor, cli);
    }
    
    public void aplicarJuros() {
        super.creditar(this.taxaJuros * super.getSaldo());
    }
    
}
