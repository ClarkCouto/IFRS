/*
Deseja-se trabalhar com figuras geom�tricas de forma retangular, que ser�o chamadas
de Retangulo. Cada Retangulo possui um valor de largura e altura bem como ser� 
posicionado em um plano cartesiano (posi��o x e y). A unidade de medida utilizada 
� o mil�metro (mm). Deve ser possibilitado modificar-se o tamanho do ret�ngulo 
(largura e altura) bem como a posi��o (x e y) do retangulo. Tamb�m deve ser poss�vel 
perguntar ao ret�ngulo quais sua largura, altura, posi��o x e posi��o y. Tamb�m 
deve ser poss�vel perguntar ao ret�ngulo qual o seu per�metro (soma de todos os 
		lados) bem como a sua �rea (altura x largura). Tamb�m deve ser poss�vel 
solicitar ao ret�ngulo que ele se mova para esquerda, direita, para cima ou para 
baixo, informando-se a dist�ncia a ser movimentada. 

1) Modele em UML a abstra��o Retangulo apresentada.
2) Crie uma classe em Java, chamada Retangulo, que implemente essa abstra��o.
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
		System.out.println("Posi��o X: " + x + " mm");
		System.out.println("Posi��o Y: " + y + " mm");
		System.out.println("-------------------");
	}
}
