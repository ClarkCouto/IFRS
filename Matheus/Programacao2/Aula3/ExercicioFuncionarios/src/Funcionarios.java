
public class Funcionarios {
	
	private String nome;
	private char sexo;
	private String cpf;
	private double salarioBruto;
	
	public Funcionarios(String n, char s, String cpf, double sal) {
		this.nome = n;
		this.sexo = s;
		this.cpf = cpf;
		this.salarioBruto = sal;
	}
	
	public double txINSS() {
		if (this.salarioBruto <= 1000.00) {
			return 0.08;
		}
		else if (this.salarioBruto <= 2000.00) {
			return 0.09;
		}
		else if (this.salarioBruto <= 3000.00) {
			return 0.10;
		}
		else {
			return 0.11;
		}
	}
	
	public double valorINSS() {
		double v = (this.salarioBruto) * txINSS();
		if (v >= 900.00) {
			return 900.00;
		}
		else {
			return v;
		}
	}
	
	public double salarioLiquido() {
		return this.salarioBruto - valorINSS();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;		
	}
	
	public void setSalarioBruto (double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
}
