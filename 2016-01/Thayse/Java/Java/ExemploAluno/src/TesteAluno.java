
public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();    //declara com "Aluno a1" e instancia com "new Aluno()"
		
		//Aluno é um método construtor da classe Aluno
		// a1 = new Aluno();
		
		a1.nome = "Alex";
		a1.setNota1(9.5f);
		a1.setNota2(8.5f);
		
/*		a1.registraNota1(8);
		a1.registraNota2(9);
		*/
		float m;
		m = a1.media();
		System.out.println("Media = " + m);
		
		if (m < 3) {
			System.out.println("Reprovado");
		} else if ( m < 7) {
			System.out.println("Recuperação");
			
		} else {
			System.out.println("Aprovado");
		}
	}

} //Teste Aluno
