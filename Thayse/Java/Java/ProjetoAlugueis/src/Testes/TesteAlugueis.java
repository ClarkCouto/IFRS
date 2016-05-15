/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import domínio.Apto;
import domínio.AptoTipoA;
import domínio.AptoTipoB;
import domínio.Edificio;
import domínio.Inquilino;

/**
 *
 * @author Thayse
 */
public class TesteAlugueis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia edificios
        Edificio portalDoSul = new Edificio();
        Edificio estelar = new Edificio();
        portalDoSul.setNome("Portal do Sul");
        estelar.setNome("Estelar");
        
        Inquilino Maria = new Inquilino("Maria");
        Inquilino Joao = new Inquilino("Joao");
        
        
        //adiciona apartamentos do tipo A à lista do edifício Portal Do Sul
        portalDoSul.adicionaApartamento(new AptoTipoA(101, 50, 1, Joao));
        portalDoSul.adicionaApartamento(new AptoTipoA(201, 60, 2));
        portalDoSul.adicionaApartamento(new AptoTipoA(301, 70, 3));
        
        //adiciona apartamentos do tipo B à lista do edifício Portal do Sul
        portalDoSul.adicionaApartamento(new AptoTipoB(102, 80, 1));
        portalDoSul.adicionaApartamento(new AptoTipoB(202, 90, 2));
        portalDoSul.adicionaApartamento(new AptoTipoB(302, 100, 3, Maria));
        
        //adiciona apartamentos à lista de apartamentos do edifício Estelar
        estelar.adicionaApartamento(new AptoTipoA(1001, 50, 1));
        estelar.adicionaApartamento(new AptoTipoA(1002, 50, 1, Maria));
        estelar.adicionaApartamento(new AptoTipoA(1003, 50, 1));
        
        
        System.out.println("Edifício " + portalDoSul.getNome());
        System.out.println("*************************************************");
        for (Apto a : portalDoSul.getApartamentosAlugados()) {
            System.out.println("Número apartamento: " + a.getNumero());
            System.out.println("Nome do Inquilino: " + a.getInquilino().getNome());
            System.out.println("Valor do aluguel: " + a.precoFinal());
            System.out.println("-------------------------------------------------");
        }
        
        System.out.println("Edifício " + estelar.getNome());
        System.out.println("*************************************************");
        for(Apto a : estelar.getApartamentosAlugados()) {
            System.out.println("Número apartamento: " + a.getNumero());
            System.out.println("Nome do Inquilino: " + a.getInquilino().getNome());
            System.out.println("Valor do aluguel: " + a.precoFinal());
            System.out.println("-------------------------------------------------");
        }
        //tela
        //FALTA FAZER IMPRIMIR CERTO SÓ OS APARTAMENTOS ALUGADOS
//        for (Apto a : portalDoSul.getApartamentosAlugados()) {
//            if (a.getInquilino() != null) {
//                System.out.println("Edifício: " + portalDoSul.getNome());
//                System.out.println("Número do Apartamento: " + a.getNumero());
//                System.out.println("Inquilino: " + a.getInquilino().getNome());
//                System.out.println("Valor do aluguel: " + a.precoFinal());
//            }
//        }
//        
//        for (Apto a : estelar.getApartamentosAlugados()) {
//            if (a.getInquilino() != null) {
//                System.out.println(a.getNumero());
//                
//            } else {
//                System.out.println();
//            }
//            
//        }
            
        
    }
    
}
