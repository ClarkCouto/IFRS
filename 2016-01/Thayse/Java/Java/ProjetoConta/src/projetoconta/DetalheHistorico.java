/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Thayse
 */
public class DetalheHistorico {
    private Date dataHora;
    private String tipoOperacao;
    private double valor;
    private double saldo;
    
    public DetalheHistorico() {
        
    }
    
    public DetalheHistorico(Date dataHora, String tipoOperacao, double valor, double saldo) {
        this.dataHora = dataHora;
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
        this.saldo = saldo;
    }
    
    public Date getDataHora() {
	return dataHora;
    }

    public String getTipoOperacao() {
	return tipoOperacao;
    }

    public double getValor() {
	return valor;
    }

    public double getSaldo() {
	return saldo;
    }
    
    @Override
    public String toString() {
        return "\n------------------------------------------" 
                + "\nData :" + dataHora 
                + "\nTipo de Operação: " + tipoOperacao 
                + "\n Valor: " + valor 
                + "\n Saldo: " + saldo;
    }
}
