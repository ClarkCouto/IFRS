
public class TesteRetangulo {

	public static void main(String[] args) {
		
		Retangulo ret1 = new Retangulo(100, 200, 0, 30); // cria a variável ret1 e instancia um objeto da classe Retangulo
		
		
		System.out.println("---------------------------------");
		System.out.println("Dados do retângulo");
		System.out.println("---------------------------------");
		System.out.println("Largura: " + ret1.getLargura() + "mm");
		System.out.println("Altura: " + ret1.getAltura() + "mm");
		System.out.println("Posição X: " + ret1.getX());
		System.out.println("Posição Y: " + ret1.getY());
		System.out.println("Perímetro: " + ret1.perimetro() + "mm");
		System.out.println("Área: " + ret1.area() + "mm");
		
		//Alterando o tamanho do retângulo
		ret1.tamanho(20, 30);

		//Alterando a posição do retângulo
		ret1.posicao(-450, 20);
		
		
		//Movendo o retângulo
		ret1.mover('D', 400);
		
		
	}

}
