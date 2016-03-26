import java.util.Scanner;


public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        Aluno a1 = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        a1.setNome(scan.nextLine());
        System.out.println("Digite a nota da prova 1 do aluno " + a1.getNome() + ": ");
        a1.setNota1(Float.parseFloat(scan.nextLine()));
        System.out.println("Digite a nota da prova 2 do aluno " + a1.getNome() + ": ");
        a1.setNota2(Float.parseFloat(scan.nextLine()));
        System.out.println("\nA nota da primeira prova do aluno " + a1.getNome() + " foi = " + a1.getNota1());
        System.out.println("A nota da segunda prova do aluno " + a1.getNome() + " foi = " + a1.getNota2());
        System.out.println("A média das notas do aluno " + a1.getNome() + " é: " + a1.media());
        System.out.println("Situação do Aluno " + a1.getNome() + " = " + a1.situacao());
        scan.close();
	}

}
