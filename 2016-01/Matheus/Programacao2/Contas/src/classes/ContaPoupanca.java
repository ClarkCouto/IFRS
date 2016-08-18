package classes;

public class ContaPoupanca extends Conta {

	private static double taxaJuros = 0.02d;
	
	public ContaPoupanca(int agencia, int numero, Cliente cliente) {
		super(agencia, numero, cliente);
	}
	
	public ContaPoupanca(int agencia, int numero, int saldo, Cliente cliente) {
		super(agencia, numero, saldo, cliente);
	}
	
	public static double getTaxaJuros() {
		return taxaJuros;
	}

	public static void setTaxaJuros(double taxaJuros) {
		ContaPoupanca.taxaJuros = taxaJuros;
	}

	public void aplicarJuros() {						
		double v = getSaldo();
		v -= getSaldo() * taxaJuros;		
		setSaldo(v);
	}	

}
