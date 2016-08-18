package classes;

public class FuncionarioHorista extends FuncionarioAbstrato{
	private float salarioPorHora;
	private int horasTrabalhadas;
	
	public FuncionarioHorista(){}
	
	public FuncionarioHorista(String nome, char sexo, String cpf, float salario){
		super(nome, sexo, cpf);
		setSalarioPorHora(salario);
	}
	
	public FuncionarioHorista(String nome, char sexo, String cpf, Endereco endereco, float salario, int horasTrabalhadas){
		super(nome, sexo, cpf, endereco);
		setSalarioPorHora(salario);
		setHorasTrabalhadas(horasTrabalhadas);
	}
	
	public void setSalarioPorHora(float salario){
		this.salarioPorHora = salario;
	}
	
	public void setHorasTrabalhadas(int horas){
		this.horasTrabalhadas = horas;
	}

	@Override
	public float salarioBruto(){
		return this.salarioPorHora * this.horasTrabalhadas;
	}
}
