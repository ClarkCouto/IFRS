package telas;

import java.util.Scanner;

import classes.Endereco;

public class TelaEndereco {

	protected static Scanner scan = new Scanner(System.in);
	
	private Endereco e;
	
	public TelaEndereco(Endereco endereco){
		e = endereco;
	}

	public String getEndereco(){
		return e.toString();
	}
	
	public void setEndereco(Endereco e){
		this.e = e; 
	}
	
	public Endereco preencherDadosEndereco(){
		setRua();
		setNumero();
		setComplemento();
		setBairro();
		setCidade();
		return e;
	}

	public void setRua() {
		String rua = null;
		boolean valido = false;
		do{
			System.out.println("Digite o nome da rua: ");
			rua = scan.nextLine();
			valido = e.setRua(rua);
			if(!valido){
				System.out.println("Rua Inválida");
			}
		}
		while(!valido);
	}

	public void setNumero() {
		int numero = 0;
		boolean valido = false;
		do{
			System.out.println("Digite o número: ");
			numero = scan.nextInt();
			scan.nextLine();
			e.setNumero(numero);
			valido = true;
		}
		while(!valido);
	}

	public void setComplemento() {
		String complemento = null;
		boolean valido = false;
		do{
			System.out.println("Digite o Complemento: ");
			complemento = scan.nextLine();
			valido = e.setComplemento(complemento);
			if(!valido){
				System.out.println("Complemento Inválido");
			}
		}
		while(!valido);
	}
	
	public void setBairro() {
		String bairro = null;
		boolean valido = false;
		do{
			System.out.println("Digite o Bairro: ");
			bairro = scan.nextLine();
			valido = e.setComplemento(bairro);
			if(!valido){
				System.out.println("Bairro Inválido");
			}
		}
		while(!valido);
	}
	
	public void setCidade() {
		String cidade = null;
		boolean valido = false;
		do{
			System.out.println("Digite o nome da Cidade: ");
			cidade = scan.nextLine();
			valido = e.setCidade(cidade);
			if(!valido){
				System.out.println("Cidade Inválida");
			}
		}
		while(!valido);
	}
/*
	public Endereco setEstado(Endereco e) {
		String estado = "";
		boolean valido = false;
		do{
			System.out.println("Digite o Estado: ");
			estado = scan.nextLine();
			valido = e.setEstado(estado);
			if(!valido){
				System.out.println("Estado Inválido");
			}
		}
		while(!valido);
		return e;
	}*/
}
	