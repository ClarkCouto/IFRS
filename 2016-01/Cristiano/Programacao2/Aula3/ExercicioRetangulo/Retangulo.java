/*
Deseja-se trabalhar com figuras geométricas de forma retangular, que serão chamadas
de Retangulo. Cada Retangulo possui um valor de largura e altura bem como será 
posicionado em um plano cartesiano (posição x e y). A unidade de medida utilizada 
é o milímetro (mm). Deve ser possibilitado modificar-se o tamanho do retângulo 
(largura e altura) bem como a posição (x e y) do retangulo. Também deve ser possível 
perguntar ao retângulo quais sua largura, altura, posição x e posição y. Também 
deve ser possível perguntar ao retângulo qual o seu perímetro (soma de todos os 
		lados) bem como a sua área (altura x largura). Também deve ser possível 
solicitar ao retângulo que ele se mova para esquerda, direita, para cima ou para 
baixo, informando-se a distância a ser movimentada. 

1) Modele em UML a abstração Retangulo apresentada.
2) Crie uma classe em Java, chamada Retangulo, que implemente essa abstração.
3) Crie um programa em Java, chamado TestaRetangulo, que permita testar o 
Retangulo implementado
*/
public class Retangulo {
	private int altura;
	private int largura;
	private int x;
	private int y;
	
	public Retangulo(){
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getPerimetro(){
		return this.altura * 2 + this.largura * 2;
	}
	
	public int getArea(){
		return this.altura * this.largura;
	}
	public void moverParaCima(int valor){
		this.x += valor;
	}
	
	public void moverParaBaixo(int valor){
		this.x -= valor;
	}
	
	public void moverParaDireita(int valor){
		this.y += valor;
	}
	
	public void moverParaEsquerda(int valor){
		this.y -= valor;
	}
	
	public void mostrarInformacoes(){
		System.out.println("-------------------");
		System.out.println("Altura   : " + altura + " mm");
		System.out.println("Largura  : " + largura + " mm");
		System.out.println("Posição X: " + x + " mm");
		System.out.println("Posição Y: " + y + " mm");
		System.out.println("-------------------");
	}
}
