/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoretangulo;

public class Retangulo {
    
    private double largura;
    private double altura;
    private double posicaoX;
    private double posicaoY;
    
    public Retangulo() {
        
    }
    
    public Retangulo (double lar, double alt, double pX, double pY) {
        this.largura = lar;
        this.altura = alt;
        this.posicaoX = pX;
        this.posicaoY = pY;
    }
    
    public double getLargura() {
        return this.largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getPosicaoX() {
        return this.posicaoX;
    }
    
    public void setPosicaoX(double posicaoX) {
        this.posicaoX = posicaoX;
    }
    
    public double getPosicaoY() {
        return this.posicaoY;
    }
    
    public void setPosicaoY(double posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    public void mudarLargura(double novaLargura) {
        this.largura = novaLargura;
    }
    
    public void mudarAltura(double novaAltura) {
        this.altura = novaAltura;
    }
    
    public void mudarPosicaoX(double novaPosicaoX) {
        this.posicaoX = novaPosicaoX;
    }
    
    public void mudarPosicaoY(double novaPosicaoY) {
        this.posicaoY = novaPosicaoY;
    }
    
    public double calcularPerimetro() {
        double perimetro = (this.altura * 2) + (this.largura * 2);
        return perimetro;
    }
    
    public double calcularArea() {
        double area = (this.altura * this.largura);
        return area;
    }
    
    public void moverEsquerda(double mEsquerda) {
        this.posicaoY -= mEsquerda; 
    }
    
    public void moverDireita(double mDireita) {
        this.posicaoY += mDireita; 
    }
    
    public void moverCima(double mCima) {
        this.posicaoX += mCima; 
    }
    
    public void moverBaixo(double mBaixo) {
        this.posicaoX -= mBaixo; 
    }
}
