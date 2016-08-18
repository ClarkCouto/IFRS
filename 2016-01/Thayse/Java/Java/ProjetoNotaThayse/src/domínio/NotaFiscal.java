/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domínio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thayse
 */
public abstract class NotaFiscal {
    //atributos da classe
    
    int numero;
    Cliente cliente;
    
    //cria uma lista de produtos
    List<Produto> lista = new ArrayList<>();
    
    
    //construtores
    public NotaFiscal() {
        
    }
    
    public NotaFiscal(int n) {
        this.numero = n;
    }
    
    public NotaFiscal(Cliente c, int n) {
        
        this.cliente = c;
        this.numero = n;
    }
    //getters e setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    //métodos
    public float valorProdutos() {
        //soma o preço de todos os produtos
        float soma = 0f;
        for(int i = 0; i<lista.size(); i++) {
            soma += lista.get(i).getPreco();
        }
        return soma;
    }
    
    public float valorTotal() {
        return this.valorProdutos() + this.imposto();
    }
    
    public void incluirProduto(Produto p) {
        //cria uma lista de produtos
        lista.add(p);
    
    }
    
    public abstract float imposto();
    
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public List<Produto> getProdutos() {
        
        return this.lista;
    }
}
