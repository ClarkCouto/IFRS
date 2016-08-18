/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public abstract class  Conta {
    
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private List<DetalheHistorico> historico = new ArrayList<DetalheHistorico>();
    
    Calendar c = Calendar.getInstance();
    
    
   
    public Conta(int agencia, int conta, Cliente cli) {
        this.agencia = agencia; 
        this.numero = conta;
        this.setCliente(cli);
        
        this.setDate();
                
    }
    /*
    public Conta(int agencia, int conta, String nome, String cpf) {
        
        Cliente c = new Cliente(nome, cpf);
        this.setCliente(c);
                
    }
    */
    public Conta(int agencia, int conta, double valor, Cliente cli) {
        
        
        this.agencia = agencia; 
        this.numero = conta;
        this.saldo = valor;
        this.setCliente(cli);
        
        this.setDate();
                
    }
    
    
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setDate() {
        //define uma data inicial para a primeira operação
        c.set(2015, Calendar.JANUARY, 28, 9, 29, 40);
    }
    
    public void creditar(double valor) {
        this.saldo += valor;
        //adiciona 3 dias à ultima data definida
        c.add(Calendar.DAY_OF_YEAR, 3);
        
        historico.add(
                new DetalheHistorico(
                        c.getTime(), "Crédito", valor, this.getSaldo()
                )
        );
    }
    
    public void debitar(double valor) {
        this.saldo -= valor;
        //adiciona 7 dias à ultima data definida
        c.add(Calendar.DAY_OF_YEAR, 7);
        
        historico.add(
                new DetalheHistorico(
                        c.getTime(), "Débito", valor, this.getSaldo()
                )
        );
    }
    
    public void transferir(Conta contaDestino, double valor) {
        this.saldo -= valor;
        contaDestino.creditar(valor);
        
    }
    
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
      this.cliente = cliente;
    }
    
    public List<DetalheHistorico> getHistorico() {
        return historico;
    }
    
    public List<DetalheHistorico> getHistorico(Date inicio, Date fim) {
        List<DetalheHistorico> intervalo = new ArrayList<DetalheHistorico>();
        for (DetalheHistorico inter : historico) {
            if (inter.getDataHora().after(inicio) && inter.getDataHora().before(fim)) {
                intervalo.add(inter);
            }
        }
        return intervalo;
    }
    int qntDepositos = 0;
    public int quantidadeDepositos(Date inicio, Date fim) {
        
        for (DetalheHistorico inter : historico) {
            if (inter.getDataHora().after(inicio) && inter.getDataHora().before(fim)) {
                if (inter.getTipoOperacao().equals("Débito")) {
                    qntDepositos += 1;
                }
                
            }
            
        }
        return qntDepositos;
    }
    double totalDepositos = 0.0;
    public double totalDepositos(Date inicio, Date fim) {
        for (DetalheHistorico inter : historico) {
            if (inter.getDataHora().after(inicio) && inter.getDataHora().before(fim)) {
                if (inter.getTipoOperacao().equals("Débito")) {
                    totalDepositos += inter.getValor();
                }
                
            }
            
        }
        return totalDepositos;
    }
    
   
    
}
