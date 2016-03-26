
public class Retangulo {
	private int largura, altura, x, y;
	
	public Retangulo(int largura, int altura, int x, int y) {
		this.largura = largura;
		this.altura = altura;
		this.x = x;
		this.y = y;
	}
	
	public int perimetro(){
		return (2 * largura) + (2 * altura);
	}
	
	public int area(){
		return (largura * altura);
	}
	
	public void tamanho(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		System.out.println("\n---------------------------------");
		System.out.println("Novo tamanho do retângulo");
		System.out.println("---------------------------------");
		System.out.println("Largura = " + this.largura + "mm");
		System.out.println("Altura = " + this.altura + "mm");
	}
	
	public void posicao(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("\n---------------------------------");
		System.out.println("Nova posição do retângulo");
		System.out.println("---------------------------------");
		System.out.println("X = " + this.x);
		System.out.println("Y = " + this.y);
	}
	
	public void mover(char dir, int valor){
		String dirExtenso;
		switch (dir) {
		case 'C':
			this.y = y + valor;
			dirExtenso = "cima";
			break;
		case 'B':
			this.y = y - valor;
			dirExtenso = "baixo";
			break;
		case 'E':
			this.x = x - valor;
			dirExtenso = "esquerda";
			break;
		case 'D':
			this.x = x + valor;
			dirExtenso = "direita";
			break;
		default:
			dirExtenso = "erro";
			break;
		}
		
		if (dirExtenso != "erro") {
			System.out.println("\n---------------------------------");
			System.out.println("O retângulo moveu-se "+ valor + "mm para " + dirExtenso + ".\n");
			System.out.println("X = " + this.x);
			System.out.println("Y = " + this.y);
			System.out.println("---------------------------------");

		}
		else {
			System.out.println("\n---------------------------------");
			System.out.println("Opção inválida!");
			System.out.println("---------------------------------");

		}
		
	}
	
	public int getLargura(){
		return largura;
	}
	
	public void setLargura(int largura){
		this.largura = largura;
	}
	
	public int getAltura(){
		return altura;
	}
	
	public void setAltura(int altura){
		this.altura = altura;
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
	
}
