package telas;

import java.util.Scanner;

import classes.Endereco;
import classes.FuncionarioAbstrato;
import classes.FuncionarioComissionado;
import classes.FuncionarioFixo;
import classes.FuncionarioHorista;

public class TelaFuncionario {
	protected static Scanner scan = new Scanner(System.in);
	FuncionarioFixo ff;
	FuncionarioHorista fh;
	FuncionarioComissionado fc;
	
	public TelaFuncionario(FuncionarioFixo ff, FuncionarioHorista fh, FuncionarioComissionado fc){
		this.ff = ff;
		this.fh = fh;
		this.fc =fc;
	}
		
	public FuncionarioFixo preencherFuncionarioFixo(){
		setNome(ff);
		setSexo(ff);
		setCpf(ff);
		setSalarioFuncionarioFixo(ff);
		return ff;
	}
	
	public FuncionarioHorista preencherFuncionarioHorista(){
		setNome(fh);
		setSexo(fh);
		setCpf(fh);
		setSalarioFuncionarioHorista(fh);
		return fh;
	}
	
	public FuncionarioComissionado preencherFuncionarioComissionado(){
		setNome(fc);
		setSexo(fc);
		setCpf(fc);
		setSalarioFuncionarioComissionado(fc);
		return fc;
	}
		
	public FuncionarioAbstrato setNome(FuncionarioAbstrato f){
		String nome = null;
		boolean valido = false;
		do{
			System.out.println("Digite o Nome: ");
			nome = scan.nextLine();
			valido = f.setNome(nome);
			if (!valido) {
		    	System.out.println("Erro: Nome do Funcionário não pode ser nulo nem vazio");
		    }
		}
		while(!valido);
		return f;
	}
	
	public FuncionarioAbstrato setSexo(FuncionarioAbstrato f){
		char sexo;
		boolean valido = false;
		do{
			System.out.println("Digite o Sexo (M ou F): ");
			sexo = scan.nextLine().toUpperCase().charAt(0);	
			valido = f.setSexo(sexo);
			if (!valido) {
		    	System.out.println("Erro: Sexo Inválido!");
		    }
		}
		while(!valido);
		return f;
	}
	
	public FuncionarioAbstrato setCpf(FuncionarioAbstrato f){
		String cpf = null;
		boolean valido = false;
		do{
			System.out.println("Digite o CPF: ");				
			cpf = scan.nextLine();
			valido = f.setCpf(cpf);
			if (!valido){ 
		    	System.out.println("Erro: CPF Inválido!");
		    }
		}
		while(!valido);
		return f;
	}
	
	public FuncionarioAbstrato setEndereco(FuncionarioAbstrato f, Endereco endereco){
		f.setEndereco(endereco);
		return f;
	}

	public FuncionarioFixo setSalarioFuncionarioFixo(FuncionarioFixo ff){
		ff.setSalario(buscarValorFloat("Salário"));
		return ff;
	}
	
	public FuncionarioHorista setSalarioFuncionarioHorista(FuncionarioHorista fh){
		fh.setSalarioPorHora(buscarValorFloat("Salário por Hora"));
		fh.setHorasTrabalhadas(buscarValorInt("Horas Trabalhadas"));
		return fh;
	}
	public FuncionarioComissionado setSalarioFuncionarioComissionado(FuncionarioComissionado fc){
		fc.setSalarioBase(buscarValorFloat("Salário Base"));
		fc.setPorcentagemComissao(buscarValorFloat("Percentual de Comissão"));
		fc.setValorVendas(buscarValorFloat("Valor de Vendas"));
		return fc;
	}

	public float buscarValorFloat(String palavra){
		float valorFloat = 0;
		do{
			System.out.println("Digite o " + palavra + ": ");
			valorFloat = scan.nextFloat();
			scan.nextLine();
			if (valorFloat == 0) {
		    	System.out.println("Erro: " + palavra + " não pode ser Zero!");
		    }
		}
		while(valorFloat == 0);
		return valorFloat;
	}
	
	public int buscarValorInt(String palavra){
		int valorInt = 0;
		do{
			System.out.println("Digite " + palavra + ": ");
			valorInt = scan.nextInt();
			scan.nextLine();
			if (valorInt == 0) {
		    	System.out.println("Erro: "+ palavra + " não pode ser Zero!");
		    }
		}
		while(valorInt == 0);
		return valorInt;
	}
	 
	public void imprimirDadosFuncionario(FuncionarioAbstrato f, String tipo){		
		System.out.println("--------------------------------");
		System.out.println("Dados do Funcionário");
		System.out.println("--------------------------------");
		System.out.println("Nome: " + f.getNome());
		System.out.println("Sexo: " + f.getSexo());
		System.out.println("CPF : " + f.getCpf());
		System.out.println("--------------------------------");
		switch(tipo){
			case "Fixo":
				f = (FuncionarioFixo) f;
				break;
			case "Horista":
				f = (FuncionarioHorista) f;
				break;
			case "Comissionado":
				f = (FuncionarioComissionado) f;
				break;
		}
		System.out.printf("Salario Bruto    = %.2f\n", f.salarioBruto());
		System.out.println("INSS (" + fc.txINSS() + "%)     =  " + fc.valorINSS()); 
		System.out.println("                   -------");
		System.out.printf("Salario Base IR  = %.2f\n", f.salarioBaseIR());
		System.out.printf("IR (%d%%)         =  %.2f\n", f.txIR(), f.valorIR()); 
		System.out.println("                   -------");
		System.out.printf("Salario Liquido  = %.2f\n", f.salarioLiquido());
		System.out.println("--------------------------------");
	}
}
