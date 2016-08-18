package telas;

import java.util.Scanner;

import classes.Endereco;
import classes.Funcionario;

public class TelaFuncionario {
	protected static Scanner scan = new Scanner(System.in);
	
	private Funcionario f = null;
	
	public TelaFuncionario(Funcionario funcionario){
		setFuncionario(funcionario);
	}
	
	public Funcionario preencherDadosFuncionario(){
		setNome();
		setCpf();
		setSexo();
		setSalarioBruto();
		return f;
	}
	
	public void setFuncionario(Funcionario f){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		}
		else {
		    this.f = f;
		}
	}
	
	public void setNome(){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		}
		else{
			String nome = null;
			do{
				System.out.println("Digite o Nome: ");
				nome = scan.nextLine();
				if (nome == null) {
			    	System.out.println("Erro: Nome do Funcion�rio n�o pode ser null");
			    }
			    else if (nome.equals("")) {
			    	System.out.println("Erro: Nome do Funcion�rio n�o pode ser vazio!");
			    }
			}
			while(nome == "" || nome == null);
			f.setNome(nome);
		}
	}
	
	public void setSexo(){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		}
		else{
			char sexo;
			do{
				System.out.println("Digite o Sexo: ");
				sexo = scan.nextLine().toUpperCase().charAt(0);
				if(sexo != 'M' && sexo != 'F'){
					System.out.println("Sexo Inv�lido!");
				}
			}
			while(sexo != 'M' && sexo != 'F');
			f.setSexo(sexo);
		}
	}
	
	public void setCpf(){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		}
		else{
			String cpf = null;
			do{
				System.out.println("Digite o CPF: ");
				cpf = scan.nextLine();
				if (cpf == null) {
			    	System.out.println("Erro: CPF do Funcion�rio n�o pode ser null");
			    }
			    else if (cpf.equals("")) {
			    	System.out.println("Erro: CPF do Funcion�rio n�o pode ser vazio!");
			    }
			}
			while(cpf == "" || cpf == null);
			f.setCpf(cpf);
		}
	}
	
	public void setSalarioBruto(){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		}
		else{
			double salario = 0;
			do{
				System.out.println("Digite o Sal�rio Bruto: ");
				salario = scan.nextDouble();
				scan.nextLine();
				if (salario == 0) {
			    	System.out.println("Erro: Sal�rio Bruto do Funcion�rio n�o pode ser Zero!");
			    }
			}
			while(salario == 0);
			f.setSalarioBruto(salario);
		}
	}
	
	public void setEndereco(Endereco e){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		}
		else if( e == null){
			System.out.println("Erro: Endere�o nulo.");
		}
		else{
			f.setEndereco(e);
		}
	}
	public String getNome(){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		    return "";
		}
		else{
			return f.getNome();
		}
	}
	
	public char getSexo(){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		    return ' ';
		}
		else{
			return f.getSexo();
		}
	}
	
	public String getCpf(){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		    return null;
		}
		else{
			return f.getCpf();
		}
	}
	
	public double getSalarioBruto(){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		    return 0;
		}
		else{
			
		}
		return f.getSalarioBruto();
	}
	
	public String getEndereco(){
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		    return null;
		}
		else{
			return f.getEndereco();
		}
	}
	
	public void imprimirDados(){	
		if (f == null) {
		    System.out.println("Erro: Funcion�rio nulo.");
		}
		else{	
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("Dados do Funcion�rio");
			System.out.println("--------------------------------");
			System.out.println("Nome: " + f.getNome());
			System.out.println("Sexo: " + f.getSexo());
			System.out.println("CPF : " + f.getCpf());
			System.out.println("--------------------------------");
			System.out.println("Salario Bruto    = " + f.getSalarioBruto());
			System.out.println("INSS ("+ f.txINSS(f.getSalarioBruto()) +  "%)      = " + f.valorINSS());  
			System.out.println("                   -------");
			System.out.println("Salario Liquido  = " + f.salarioLiquido());
			System.out.println("--------------------------------");
		}
	}
	
}
