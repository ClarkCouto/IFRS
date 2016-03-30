
public class TesteAluno {

	public static void main(String[] args) {
	
			Aluno a1 = new Aluno(); // Declarando e instanciando um objeto da classe aluno

			a1.nome = "Matheus";
			a1.setNota1(10.0f);
			a1.setNota2(8.5f);
			
			float m = a1.media();
			
			System.out.println("A média do aluno é " + m);
		
			if (m >= 7) {
				System.out.println("O aluno foi aprovado!");
			}
			
			else if (m >= 3) {
				System.out.println("O aluno está de recuperação.");
			}
			
			else {
				System.out.println("O aluno foi reprovado.");
			}
			
	}

}
