package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Date;

public abstract class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	private List<DetalheHistorico> historico = new ArrayList<DetalheHistorico>();
	
	public Conta (int agencia, int numero, Cliente cliente) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0.0d;
		this.cliente = cliente;		
	}
	
	public Conta (int agencia, int numero, int saldo, Cliente cliente) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	

	public void creditar(double valor) {		
		this.saldo += valor; 
		historico.add(new DetalheHistorico(new Date(), "Crédito", valor, this.getSaldo()));
	}
	
	public void debitar(double valor) {		
		setSaldo(getSaldo() - valor);		
		historico.add(new DetalheHistorico(new Date(), "Débito", valor, this.getSaldo()));
	}	
	
	public void transferir(Conta contaDestino, double valor) {
		if (this.saldo < valor)
			throw new RuntimeException("O saldo da conta debitada é insuficiente.");
		else {
			this.saldo -= valor;
			contaDestino.saldo += valor;
		}
	}
		
	public List<DetalheHistorico> getHistorico(){
		return historico;
	}
	
	public List<DetalheHistorico> getHistorico(Date inicio, Date fim){
		List<DetalheHistorico> histIntervalo = new ArrayList<DetalheHistorico>();	
		for (DetalheHistorico temp : historico)
			if (temp.getDataHora().after(inicio) && temp.getDataHora().before(fim))
					histIntervalo.add(temp);
		return histIntervalo;
	}
	
	public double totalDepositos(Date inicio, Date fim){
		double total = 0.0d;
		for (DetalheHistorico temp : historico)
			if (temp.getTipoOperacao() == "Débito")
				total += temp.getValor();
		return total;
	}	
	
}
