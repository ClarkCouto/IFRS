/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoretangulo;

import java.util.Scanner;

/**
 *
 * @author Thayse
 */
public class TestaRetangulo {
    
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Criar um retângulo.");
        
        System.out.println("Digite a altura do retângulo.");
        ret.setAltura(scan.nextDouble());
        System.out.println("Digite a largura do retângulo.");
        ret.setLargura(scan.nextDouble());
        System.out.println("Digite a posição X do retângulo.");
        ret.setPosicaoX(scan.nextDouble());
        System.out.println("Digite a posição Y do retângulo.");
        ret.setPosicaoY(scan.nextDouble());
        
        
        System.out.println("Retângulo criado:");
        
        System.out.println("Altura: " + ret.getAltura());
        System.out.println("Largura: " + ret.getLargura());
        System.out.println("Posição X: " + ret.getPosicaoX());
        System.out.println("Posição Y: " + ret.getPosicaoY());
        
        System.out.println("Editar o retângulo.");
        
        System.out.println("Digite a nova altura do retângulo.");
        ret.mudarAltura(scan.nextDouble());
        System.out.println("Digite a nova largura do retângulo.");
        ret.mudarLargura(scan.nextDouble());
        System.out.println("Digite a nova posição X do retângulo.");
        ret.mudarPosicaoX(scan.nextDouble());
        System.out.println("Digite a nova posição Y do retângulo.");
        ret.mudarPosicaoY(scan.nextDouble());
        
        System.out.println("Retângulo criado:");
        
        System.out.println("Altura: " + ret.getAltura());
        System.out.println("Largura: " + ret.getLargura());
        System.out.println("Posição X: " + ret.getPosicaoX());
        System.out.println("Posição Y: " + ret.getPosicaoY());
        
        System.out.println("Cálculo do perímetro: ");
        System.out.println("Perímetro: " + ret.calcularPerimetro());
        
        System.out.println("Cálculo da área: ");
        System.out.println("Área: " + ret.calcularArea());
        
        System.out.println("Mover o retângulo.");
        
        System.out.println("Digite quanto deseja mover para a esquerda.");
        ret.moverEsquerda(scan.nextDouble());
        System.out.println("Digite quanto deseja mover para a direita.");
        ret.moverDireita(scan.nextDouble());
        System.out.println("Digite quanto deseja mover para cima.");
        ret.moverCima(scan.nextDouble());
        System.out.println("Digite quanto deseja mover para baixo.");
        ret.moverBaixo(scan.nextDouble());
        
        System.out.println("Nova posição do retângulo:");
        
        System.out.println("Posição X: " + ret.getPosicaoX());
        System.out.println("Posição Y: " + ret.getPosicaoY());
        
        
        
    }
    
}
