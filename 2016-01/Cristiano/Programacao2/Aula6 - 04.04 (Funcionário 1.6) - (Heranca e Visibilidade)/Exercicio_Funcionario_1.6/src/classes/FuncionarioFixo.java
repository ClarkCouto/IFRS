package classes;

public class FuncionarioFixo extends FuncionarioAbstrato{
	private float salario;
	
	public FuncionarioFixo(){}
	
	public FuncionarioFixo(String nome, char sexo, String cpf, float salario){
		super(nome, sexo, cpf);
		setSalario(salario);
	}
	
	public FuncionarioFixo(String nome, char sexo, String cpf, Endereco endereco, float salario){
		super(nome, sexo, cpf, endereco);
		setSalario(salario);
	}
	
	public void setSalario(float salario){
		this.salario = salario;
	}

	@Override
	public float salarioBruto(){
		return this.salario;
	}
}
