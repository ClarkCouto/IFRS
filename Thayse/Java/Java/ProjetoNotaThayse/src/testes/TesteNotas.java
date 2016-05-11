/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import domínio.Cliente;
import domínio.NotaFiscal;
import domínio.NotaFiscalComplexa;
import domínio.NotaFiscalSimples;
import domínio.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Thayse
 */
public class TesteNotas {
    public static void main(String[] args) {
        Cliente clienteJoao = new Cliente("Joao");
        Cliente clienteJose = new Cliente("Jose");
        Cliente clienteMaria = new Cliente("Maria");
        Cliente clientePaula = new Cliente ("Paula");
        
        NotaFiscal nf1 = new NotaFiscalSimples(clienteJoao, 1000);
        nf1.incluirProduto(new Produto("Computador", 900f));
        nf1.incluirProduto(new Produto("Teclado", 20f));
        nf1.incluirProduto(new Produto("Mouse", 15f));
        
        NotaFiscal nf2 = new NotaFiscalSimples(clienteMaria, 1001);
        nf2.incluirProduto(new Produto("Caderno", 10f));
        nf2.incluirProduto(new Produto("Caneta", 5f));
        nf2.incluirProduto(new Produto("Lapis", 1f));
        
            
        NotaFiscal nf3 = new NotaFiscalComplexa(clienteJoao, 1003);
        nf3.incluirProduto(new Produto("Sensor pH", 1000f));
        nf3.incluirProduto(new Produto("Sensor temperatura", 2000f));
        
        NotaFiscal nf4 = new NotaFiscalComplexa(clienteJose, 1004);
        nf4.incluirProduto(new Produto("Medidor UV", 10500f));
        nf4.incluirProduto(new Produto("Medidor Solar", 20500f));
   
        List<NotaFiscal> notasFiscais = new ArrayList<>();
        notasFiscais.add(nf1);
        notasFiscais.add(nf2);
        notasFiscais.add(nf3);
        notasFiscais.add(nf4);
        
        for(NotaFiscal nf : notasFiscais) {
            System.out.println("-----------Nota Fiscal--------------------\n");
            System.out.println("Número: " + nf.getNumero() + " \n");
            System.out.println("Cliente: " + nf.getCliente().getNome()+ " \n");
            System.out.println("Produtos: \n ");
            for (Produto p : nf.getProdutos())
                System.out.println(p.getDescricao() + " " + p.getPreco());
            System.out.println("Valor Produtos: " + nf.valorProdutos()+ " \n");
            System.out.println("Valor Imposto: " + nf.imposto()+ " \n");
            System.out.println("Valor Total: " + nf.valorTotal()+ " \n");
            System.out.println("-----------------------------------------\n");
        }
    }
}
