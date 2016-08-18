
public class Funcionario {
	private String nome;
	private char sexo;
	private String cpf;
	private double salarioBruto;
	
	public Funcionario(){}
	
	public Funcionario(String n, char s, String cpf, double sal){
		this.nome = n;
		this.sexo = s;
		this.cpf = cpf;
		this.salarioBruto = sal;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getSexo() {
		return this.sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalarioBruto() {
		return this.salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double txINSS(double salario){
		if(salario <= 1000){
			return 8;
		}
		else if(salario > 1000 && salario <= 2000){
			return 9;
		}
		else if(salario > 1000 && salario <= 2000){
			return 10;
		}
		else {
			return 11;
		}
	}
	
	public double valorINSS(){
		double salario = this.getSalarioBruto();
		double inss = salario * this.txINSS(salario)/100;
		if(inss > 900){
			inss = 900;
		}			
		return inss;
	}
	
	public double salarioLiquido(){
		return this.getSalarioBruto() - this.valorINSS();
	}	
}
