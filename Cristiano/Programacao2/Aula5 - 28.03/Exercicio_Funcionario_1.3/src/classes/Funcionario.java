package classes;

public class Funcionario {
	private String nome;
	private char sexo;
	private String cpf;
	private double salarioBruto;
	private Endereco endereco;
	
	public Funcionario(){}
	
	public Funcionario(String nome, char sexo, String cpf, double salario){
		setNome(nome);
		setSexo(sexo);
		setCpf(cpf);
		setSalarioBruto(salario);
	}
	
	public Funcionario(String nome, char sexo, String cpf, double salario, Endereco endereco){
		setNome(nome);
		setSexo(sexo);
		setCpf(cpf);
		setSalarioBruto(salario);
		setEndereco(endereco);
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
	
	public String getEndereco(){
		return endereco.toString();
	}
	
	public Endereco getEnderecoObjeto(){
		return this.endereco;
	}
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salarioBruto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sexo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		Endereco e = other.getEnderecoObjeto();
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(e))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salarioBruto) != Double.doubleToLongBits(other.salarioBruto))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
	   return "Nome = " + this.getNome() + "\nSexo: " + this.getSexo() + "\nCPF: " + this.getCpf() + "\nSalário: R$ " + this.getSalarioBruto()   
	   		+ "\n"+ this.getEndereco();
	}
}
