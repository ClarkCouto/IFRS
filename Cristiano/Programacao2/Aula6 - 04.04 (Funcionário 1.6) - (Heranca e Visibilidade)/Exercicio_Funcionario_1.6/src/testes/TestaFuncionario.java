package testes;

public class TestaFuncionario {

	public static void main(String[] args) {

		PreencherDadosAutomaticamente pa = new PreencherDadosAutomaticamente();
		PreencherDadosManualmente pm = new PreencherDadosManualmente();
		

		//DESCOMENTAR A LINHA DE BAIXO PARA CRIAR OS FUNCIONÁRIOS COM DADOS SETADOS AUTOMATICAMENTE
		pa.iniciar();
		
		//DESCOMENTAR A LINHA DE BAIXO PARA CRIAR OS FUNCIONÁRIOS COM DADOS SETADOS MANUALMENTE
		//pm.iniciar();
		
	}
}

