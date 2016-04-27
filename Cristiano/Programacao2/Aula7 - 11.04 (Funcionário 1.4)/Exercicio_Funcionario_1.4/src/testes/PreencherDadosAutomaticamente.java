package testes;

import classes.Endereco;
import classes.FuncionarioAbstrato;
import classes.FuncionarioComissionado;
import classes.FuncionarioFixo;
import classes.FuncionarioHorista;
import telas.TelaFuncionario;

public class PreencherDadosAutomaticamente {

	private Endereco e1;
	private Endereco e2;
	private Endereco e3;
	private FuncionarioFixo ff;
	private FuncionarioHorista fh;
	private FuncionarioComissionado fc;
	private TelaFuncionario tf;
	
	public PreencherDadosAutomaticamente(){
	}
	
	public void iniciar(){
		e1 = new Endereco("Rua A", 1, "Bl A", "Centro", "Poa");
		e2 = new Endereco("Rua B", 2, "Bl B", "Auxiliadora", "Poa");
		e3 = new Endereco("Rua C", 3, "Bl C", "Moinhos", "Poa");
	
		System.out.println("\n\nCriando os funcionários...");
		System.out.println("===================================================");
		System.out.println("Funcionario Fixo...\n");
		ff = new FuncionarioFixo("Fixo", ff.MASCULINO, "123", e1, 20000);
		System.out.println("Funcionario Horista...\n");
		fh = new FuncionarioHorista("Horista", fh.MASCULINO, "456", e2, 50, 200);
		System.out.println("Funcionario Comissionado...\n");
		fc = new FuncionarioComissionado("Comissionado", fc.FEMININO, "789", e3, 1000, 1, 50000);
	
		tf = new TelaFuncionario(ff, fh, fc);

		System.out.println("===================================================");
		System.out.println("Definindo o limite do INSS..");
		tf.setLimiteINSS(ff);
		System.out.println("\n===================================================");
		System.out.println("Imprimindo os dados cadastrados...");
		tf.imprimirDadosFuncionario(ff, "Fixo");
		System.out.println("===================================================");
		tf.imprimirDadosFuncionario(fh, "Horista");
		System.out.println("===================================================");
		tf.imprimirDadosFuncionario(fc, "Comissionado");
	}
}
