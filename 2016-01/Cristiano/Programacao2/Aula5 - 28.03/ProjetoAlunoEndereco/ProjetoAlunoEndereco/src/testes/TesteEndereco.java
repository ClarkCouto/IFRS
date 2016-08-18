package testes;

import dominio.Endereco;

public class TesteEndereco {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco e1;
		e1 = new Endereco("Rua Lima e Silva", 500);
		System.out.println(e1.getRua());
		System.out.println(e1.getNumero());
		System.out.println(e1);
		
		Endereco e2;
		e2 = new Endereco("Rua Lima e Silva", 500);
		System.out.println(e2);
		if(e1.equals(e2)){
			System.out.println("Objtos são iguais.");
		}
		else{
			System.out.println("Objetos são diferentes.");			
		}
	}

}
