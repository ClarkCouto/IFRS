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
public class Conta {
    private final int numero;
    private final int agencia;
    private double saldo;
    private final Cliente cliente;
    
    public Conta(int agencia, int conta, Cliente cli){
        this.numero = conta;
        this.agencia = agencia;
        this.cliente = cli;
    }
    
    public Conta(int agencia, int conta, double valor, Cliente cli){
        this.numero = conta;
        this.agencia = agencia;
        this.cliente = cli;
        this.saldo = valor;
    }
    
    public int getConta(){
        return this.numero;
    }
        
    public int getAgencia(){
        return this.agencia;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void creditar(double valor){
        this.saldo += valor;
    }
    
    public void debitar(double valor){      
        if(this.saldo >= valor){
            this.saldo -= valor;  
        }
    }
    
    public void transferir(Conta contaDestino, double valor){
        if(valor <= this.getSaldo()){
            debitar(valor);
            contaDestino.creditar(valor);
        }
    }
    
    @Override
    public String toString(){
        return "Agência: " + this.getAgencia() + " Conta: " + this.getConta()+
                "\nCliente: " + this.cliente.getNome() + " Saldo: R$" + this.getSaldo();
    }
}
