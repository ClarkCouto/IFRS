package testes;

import classes.Endereco;
import classes.FuncionarioComissionado;
import classes.FuncionarioFixo;
import classes.FuncionarioHorista;
import telas.TelaEndereco;
import telas.TelaFuncionario;

public class PreencherDadosManualmente {
	private FuncionarioFixo ff;
	private FuncionarioHorista fh;
	private FuncionarioComissionado fc;
	
	private Endereco e1;
	private Endereco e2;
	private Endereco e3;
	private TelaFuncionario tf;
	private TelaEndereco te;
	
	public PreencherDadosManualmente(){
	}
	
	public void iniciar(){
	
		tf = new TelaFuncionario(ff, fh, fc);
		System.out.println("\n\nCriando os funcionários...");
		System.out.println("===================================================");
		System.out.println("Funcionario Fixo...\n");
		ff = tf.preencherFuncionarioFixo();
		te = new TelaEndereco(e1);
		System.out.println("\nPreenchendo dados do endereço..\n");
		e1 = te.preencherDadosEndereco();
		ff.setEndereco(e1);
		System.out.println("\n---------------------------------------------------");
		System.out.println("Funcionario Horista...\n");
		//tf.setFuncionarioHorista(f2);
		fh = tf.preencherFuncionarioHorista();
		System.out.println("\nPreenchendo dados do endereço..\n");
		te.setEndereco(e2);
		e2 = te.preencherDadosEndereco();		
		if(e1.equals(e2)){
			e2 = e1;
			System.out.println("\nEndereço já cadastrado anteriormente! Mesclando Informações!\n");
		}
		fh.setEndereco(e2);
		System.out.println("\n---------------------------------------------------");
		System.out.println("Criando Funcionario Comissionado...\n");
		//tf.setFuncionarioComissionado(f3);
		fc = tf.preencherFuncionarioComissionado();
		System.out.println("\nPreenchendo dados do endereço..\n");
		te.setEndereco(e3);
		e3 = te.preencherDadosEndereco();	
		if(e3.equals(e1)){
			e3 = e1;
			System.out.println("\nEndereço já cadastrado anteriormente! Mesclando Informações!\n");
		}	
		else if(e3.equals(e2)){
			e3 = e2;
			System.out.println("\nEndereço já cadastrado anteriormente! Mesclando Informações!\n");
		}
		fc.setEndereco(e3);
		System.out.println("\n===================================================");
		System.out.println("Testando se os funcionários são iguais...");
		if(ff.equals(fh)){
			System.out.println(ff.getNome() + " e " + fh.getNome() + " são iguais!");
		}	
		else if(ff.equals(fc)){
			System.out.println(ff.getNome() + " e " + fc.getNome() + " são iguais!");
		}
		else if(fh.equals(fc)){
			System.out.println(fh.getNome() + " e " + fc.getNome() + " são iguais!");
		}
		else{
			System.out.println("Todos os funcionários são diferentes...");
		}
		
		System.out.println("===================================================");
		System.out.println("Imprimindo os dados cadastrados...");
		tf.imprimirDadosFuncionario(ff, "Fixo");
		System.out.println("===================================================");
		tf.imprimirDadosFuncionario(fh, "Horista");
		System.out.println("===================================================");
		tf.imprimirDadosFuncionario(fc, "Comissionado");
	}
}
