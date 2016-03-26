import java.util.Scanner;

public class TestaRetangulo {

	public static void main(String[] args) {
		int opcao = 1, valor;
		
		Retangulo r = new Retangulo();
		Scanner scan = new Scanner(System.in);
		System.out.println("\nVamos Criar o Retangulo..\n");
		System.out.print("Digite a Altura: ");
		r.setAltura(scan.nextInt());
		System.out.print("Digite a Largura: ");
		r.setLargura(scan.nextInt());
		System.out.print("Digite a posicao X: ");
		r.setX(scan.nextInt());
		System.out.print("Digite a posicao Y: ");
		r.setY(scan.nextInt());

		System.out.println("\nRetângulo Criado...");
		r.mostrarInformacoes();
		
		do{
			menu();
			opcao = getOpcao();
			switch(opcao){
				case 0:
					System.out.println("\n\nSistema Encerrado...");
					break;
				case 1:
					System.out.println("\nA Área do retângulo: " + r.getArea() + " mm");
					break;
				case 2:
					System.out.println("\nPerímetro do retângulo: " + r.getPerimetro() + " mm");
					break;
				case 3:
					System.out.println("\nDigite a nova altura (em mm): ");
					valor = scan.nextInt();
					r.setAltura(valor);
					r.mostrarInformacoes();
					break;	
				case 4:
					System.out.println("\nDigite a nova largura (em mm): ");
					valor = scan.nextInt();
					r.setLargura(valor);
					r.mostrarInformacoes();
					break;		
				case 5:
					System.out.println("\nMover para Cima...");
					System.out.println("Quantos mm deseja mover: ");
					valor = scan.nextInt();
					r.moverParaCima(valor);
					r.mostrarInformacoes();
					break;	
				case 6:
					System.out.println("\nMover para Baixo...");
					System.out.println("Quantos mm deseja mover: ");
					valor = scan.nextInt();
					r.moverParaBaixo(valor);
					r.mostrarInformacoes();
					break;	
				case 7:
					System.out.println("\nMover para Direita...");
					System.out.println("Quantos mm deseja mover: ");
					valor = scan.nextInt();
					r.moverParaDireita(valor);
					r.mostrarInformacoes();
					break;	
				case 8:
					System.out.println("\nMover para Esquerda...");
					System.out.println("Quantos mm deseja mover: ");
					valor = scan.nextInt();
					r.moverParaEsquerda(valor);
					r.mostrarInformacoes();
					break;	
			}
		}
		while(opcao != 0);
		
		scan.close();
		
	}//Main
	
	private static void menu(){
		System.out.println("\n\nMENU");
		System.out.println("1 - Calcular Área");
		System.out.println("2 - Calcular Perímetro");
		System.out.println("3 - Alterar Altura");
		System.out.println("4 - Alterar Largura");
		System.out.println("5 - Mover para Cima");
		System.out.println("6 - Mover para Baixo");
		System.out.println("7 - Mover para Esquerda");
		System.out.println("8 - Mover para Direita");
		System.out.println("0 - Sair");
	}//Menu
	
	private static int getOpcao(){
		int opcao;
		boolean ok = false;
		
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("\nDigite a opção desejada: ");
			opcao = scan.nextInt();
			if(opcao >= 0 && opcao <= 8){
				ok = true;
			}
		}
		while(!ok);
		return opcao;
	}//getOpcao

}//TestaRetangulo
