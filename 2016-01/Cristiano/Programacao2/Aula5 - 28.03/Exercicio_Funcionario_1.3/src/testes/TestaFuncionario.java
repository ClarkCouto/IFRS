package testes;

//import java.util.ArrayList;

import classes.Endereco;
import classes.Funcionario;
import telas.TelaEndereco;
import telas.TelaFuncionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Endereco e1 = new Endereco();
		Endereco e2 = new Endereco();
		TelaFuncionario tf;
		TelaEndereco te;
		
		System.out.println("\n\nCriando os funcionários...");
		System.out.println("===================================================");
		System.out.println("Funcionario 1...\n");		
		tf = new TelaFuncionario(f1);
		f1 = tf.preencherDadosFuncionario();
		te = new TelaEndereco(e1);
		e1 = te.preencherDadosEndereco();
		f1.setEndereco(e1);
		System.out.println("\n" + f1.toString());
		System.out.println("===================================================");
		System.out.println("Funcionario 2...\n");
		tf.setFuncionario(f2);
		f2 = tf.preencherDadosFuncionario();
		te.setEndereco(e2);
		e2 = te.preencherDadosEndereco();
		if(e1.equals(e2)){
			System.out.println("\nEste endereço já foi cadastrado anteriormente! Mesclando informações!");
			e2 = e1;
		}
		f1.setEndereco(e1);
		System.out.println("\n" + f1.toString());
		System.out.println("===================================================");
				
		System.out.println("Testando se os funcionários são iguais...");
		if(f1.equals(f2)){
			System.out.println(f1.getNome() + " e " + f2.getNome() + " são iguais!");
		}
		else{
			System.out.println(f1.getNome() + " e " + f2.getNome() + " são diferentes!");
		}
		
		
		/*
		 * 		
		System.out.println("\n\nCriando os funcionários...");
		System.out.println("===================================================");
		System.out.println("Funcionario 1...\n");		
		tf = new TelaFuncionario(f1);
		f1 = tf.preencherDadosFuncionario();
		te = new TelaEndereco(e1);
		e1 = te.preencherDadosEndereco();
		f1.setEndereco(e1);
		System.out.println("\n" + f1.toString());
		System.out.println("===================================================");
		System.out.println("Funcionario 2...\n");
		tf.setFuncionario(f2);
		f2 = tf.preencherDadosFuncionario();
		te.setEndereco(e2);
		e2 = te.preencherDadosEndereco();
		if(e1.equals(e2)){
			System.out.println("Este endereço já foi cadastrado anteriormente! Mesclando informações!");
			e2 = e1;
		}
		f1.setEndereco(e2);
		System.out.println("\n" + f1.toString());
		System.out.println("===================================================");
		System.out.println("Funcionario 3...\n");
		tf.setFuncionario(f3);
		f3 = tf.preencherDadosFuncionario();
		te.setEndereco(e3);
		e3 = te.preencherDadosEndereco();
		if(e3.equals(e2)){
			System.out.println("Este endereço já foi cadastrado anteriormente! Mesclando informações!");
			e3 = e2;
		}
		else if(e1.equals(e2)){
			System.out.println("Este endereço já foi cadastrado anteriormente! Mesclando informações!");
			e2 = e1;
		}
		f1.setEndereco(e3);
		System.out.println("\n" + f1.toString());
				
		System.out.println("Testando se os funcionários são iguais...");
		if(f1.equals(f2)){
			System.out.println(f1.getNome() + " e " + f2.getNome() + " são iguais!");
		}
		else if(f1.equals(f3)){
			System.out.println(f1.getNome() + " e " + f3.getNome() + " são iguais!");
		}
		else if(f2.equals(f3)){
			System.out.println(f2.getNome() + " e " + f3.getNome() + " são iguais!");
		}
		else{
			System.out.println("Todos os funcionários são diferentes!");
		}
		 */
	}

}

