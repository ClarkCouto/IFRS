package classes;

import java.util.Date;

public class DetalheHistorico {
	private Date dataHora;
	private String tipoOperacao;
	private double valor;
	private double saldo;
	
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
	
}
