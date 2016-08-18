package classes;

public class FuncionarioComissionado extends FuncionarioAbstrato{
	private float salarioBase;
	private float valorVendas;
	private float porcentagemComissao;
	
	public FuncionarioComissionado(){}
	
	public FuncionarioComissionado(String nome, char sexo, String cpf, float salario){
		super(nome, sexo, cpf);
		setSalarioBase(salario);
	}
	
	public FuncionarioComissionado(String nome, char sexo, String cpf, Endereco endereco, float salario){
		super(nome, sexo, cpf, endereco);
		setSalarioBase(salario);
	}
	
	public FuncionarioComissionado(String nome, char sexo, String cpf, Endereco endereco, float salario, float porcentagemComissao){
		this(nome, sexo, cpf, endereco, salario);
		setPorcentagemComissao(porcentagemComissao);		
	}
	
	public FuncionarioComissionado(String nome, char sexo, String cpf, Endereco endereco, float salario, float porcentagemComissao, float valorVendas){
		this(nome, sexo, cpf, endereco, salario, porcentagemComissao);	
		setValorVendas(valorVendas);	
	}
	
	public void setSalarioBase(float salario){
		this.salarioBase = salario;
	}
	
	public void setPorcentagemComissao(float porcentagemComissao){
		this.porcentagemComissao = porcentagemComissao;
	}
	
	public void setValorVendas(float valorVendas){
		this.valorVendas = valorVendas;
	}

	@Override
	public float salarioBruto(){
		return this.salarioBase + this.valorVendas * this.porcentagemComissao / 100;
	}
	
}