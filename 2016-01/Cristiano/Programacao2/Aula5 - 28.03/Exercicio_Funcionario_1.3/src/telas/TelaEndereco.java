package telas;

import java.util.Scanner;

import classes.Endereco;

public class TelaEndereco {

	protected static Scanner scan = new Scanner(System.in);
	
	private Endereco e;
	
	public TelaEndereco(Endereco endereco){
		setEndereco(endereco);
	}
	
	public void setEndereco(Endereco endereco){
		if (endereco == null) {
		    System.out.println("Erro: Endereço nulo.");
		}
		else {
		    this.e = endereco;
		}
	}
	
	public Endereco preencherDadosEndereco(){
		setRua();
		setNumero();
		setCidade();
		setEstado();
		return e;
	}
	
	public String getRua() {
		return e.getRua();
	}

	public void setRua() {
		String rua = null;
		do{
			System.out.println("Digite o nome da rua: ");
			rua = scan.nextLine();
			if (rua == null) {
				System.out.println("Erro: Rua não pode ser null");
			} else if (rua.equals("")) {
				System.out.println("Erro: Rua não pode ser vazio");
			} else {
				e.setRua(rua);
			}
		}
		while(rua == null || rua == "");
	}

	public int getNumero() {
		return e.getNumero();
	}

	public void setNumero() {
		int numero = 0;
		do{
			System.out.println("Digite o número: ");
			try{
				numero = scan.nextInt();
				scan.nextLine();
				if (numero == 0) {
					System.out.println("Erro: Número não pode ser igual a 0");
				}
				else {
					e.setNumero(numero);
				}
			}
			catch(Exception e){
				scan.nextLine();
				System.out.println("Somente Números!");
			}
		}
		while(numero == 0);
	}

	public String getCidade() {
		return e.getCidade();
	}

	public void setCidade() {
		String cidade = null;
		do{
			System.out.println("Digite o nome da Cidade: ");
			cidade = scan.nextLine();
			if (cidade == null) {
				System.out.println("Erro: Cidade não pode ser null");
			} else if (cidade.equals("")) {
				System.out.println("Erro: Cidade não pode ser vazia");
			} else {
				e.setCidade(cidade);
			}
		}
		while(cidade == null || cidade == "");
	}

	public String getEstado() {
		return e.getEstado();
	}

	public void setEstado() {
		String estado = "";
		boolean valido = false;
		do{
			System.out.println("Digite o Estado: ");
			estado = scan.nextLine();
			if (estado == null) {
				System.out.println("Erro: Estado não pode ser null");
			} else if (estado.equals("")) {
				System.out.println("Erro: Estado não pode ser vazio");
			} else{
				if(estado.length() >= 2){
					estado = estado.substring(0, 2);
				}
				valido = estadoValido(estado.toUpperCase());
				if(!valido){
					System.out.println("Erro: Estado inválido!");
				}
				else{
					e.setEstado(estado);
				}
			}
		}
		while(estado == null || estado == "" || valido == false);
	}
	
	public boolean estadoValido(String estado){
		boolean valido = false;
		switch(estado){
			case "AC":	 
			case "AL":	 
			case "AP": 
			case "AM": 
			case "BA": 
			case "CE": 
			case "DF": 
			case "ES": 
			case "GO": 
			case "MA": 
			case "MT": 
			case "MS": 
			case "MG": 
			case "PA": 
			case "PB": 
			case "PR": 
			case "PE": 
			case "PI": 
			case "RJ": 
			case "RN": 
			case "RS": 
			case "RO": 
			case "RR": 
			case "SC": 
			case "SP": 
			case "SE": 
			case "TO":
				valido = true;
				break;
			default: 
				break;
		}
		return valido;
	}
}
