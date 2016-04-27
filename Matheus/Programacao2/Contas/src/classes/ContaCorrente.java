package classes;

public class ContaCorrente extends Conta {
	
	private static double taxaCPMF = 0.09;
	private double totalCPMF;
	
	public ContaCorrente(int agencia, int numero, Cliente cliente) {
		super(agencia, numero, cliente);
	}

	public ContaCorrente(int agencia, int numero, int saldo, Cliente cliente) {
		super(agencia, numero, saldo, cliente);
	}
	
	public static double getTaxaCPMF() {
		return taxaCPMF;
	}

	public static void setTaxaCPMF(double taxaCPMF) {
		ContaCorrente.taxaCPMF = taxaCPMF;		
	}
	
	public double getTotalCPMF() {
		return totalCPMF;
	}

	@Override
	public void debitar(double valor) {
		double v = valor * getTaxaCPMF();
		this.totalCPMF += v;
		valor += v;				
		super.debitar(valor);
	}
	
}
