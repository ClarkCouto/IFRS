package classes;

public abstract class FuncionarioAbstrato {
	public static final char MASCULINO = 'M';
	private static final char FEMININO = 'F';
	private static double limiteINSS = 900;
	private String nome;
	private char sexo;
	private String cpf;
	private Endereco endereco;
	
	public FuncionarioAbstrato(){}
	
	public FuncionarioAbstrato(String nome, char sexo, String cpf){
		setNome(nome);
		setSexo(sexo);
		setCpf(cpf);
	}
	
	public FuncionarioAbstrato(String nome, char sexo, String cpf, Endereco endereco){
		setNome(nome);
		setSexo(sexo);
		setCpf(cpf);
		setEndereco(endereco);
	}
	
	public FuncionarioAbstrato(String nome, char sexo, String cpf, String rua, int numero, String complemento, String bairro, String cidade){
		setNome(nome);
		setSexo(sexo);
		setCpf(cpf);
		this.endereco.setRua(rua);
		this.endereco.setNumero(numero);
		this.endereco.setComplemento(complemento);
		this.endereco.setBairro(bairro);
		this.endereco.setCidade(cidade);
	}
	
	public static double getLimiteINSS(){
		return limiteINSS;
	}
	
	public static boolean setLimiteINSS(double limite){
		 if(limite>= 0){
			 limiteINSS = limite;
			 return true;
		 }
		 else{
			 return false;
		 }
	}
	
	public String getNome() {
		return this.nome;
	}

	public boolean setNome(String nome) {
		if (nome == null || nome.equals("")) {
			return false;
		}
		else{
			this.nome = nome;
			return true;
		}
	}
	
	public char getSexo() {
		return this.sexo;
	}

	public boolean setSexo(char sexo) {
		if(sexo == MASCULINO || sexo == FEMININO){
			this.sexo = sexo;
			return true;
		}
		else{
			return false;
		}
	}

	
	public String getCpf() {
		return this.cpf;
	}

	public boolean setCpf(String cpf) {
		if (cpf == null || cpf.equals("")) {
		    return false;
		}
		else{
			this.cpf = cpf;
			return true;
		}
	}

	public float txINSS(){
		float salario = salarioBruto();
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
	
	public float valorINSS(){
		float inss = salarioBruto() * this.txINSS()/100;
		if(inss > 900){
			inss = 900;
		}			
		return inss;
	}
	
	public int txIR(){
		float salario = salarioBruto() - this.valorINSS();
		if(salario <= 1000){
			return 0;
		}
		else if(salario > 1000 && salario <= 3000){
			return 10;
		}
		else if(salario > 3000 && salario <= 5000){
			return 20;
		}
		else {
			return 30;
		}

	}
	
	public abstract float salarioBruto();
	
	public float salarioBaseIR(){
		return salarioBruto() - this.valorINSS();
	}
	
	public float valorIR(){
		return this.salarioBaseIR() * this.txIR() / 100;
	}
	
	public float salarioLiquido(){
		return salarioBruto() - this.valorINSS() - this.valorIR();
	}	
		
	public String getEndereco(){
		return endereco.toString();
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
		FuncionarioAbstrato other = (FuncionarioAbstrato) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}
	
	
}
