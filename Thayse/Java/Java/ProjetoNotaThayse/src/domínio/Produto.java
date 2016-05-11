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
public class Produto {
    //atributos
    private String descricao;
    private float preco;
    
    public Produto(String d, float p) {
        this.descricao = d;
        this.preco = p;
    }
    
    //getters e setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
       
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public float getPreco() {
        return this.preco;
    }
   
}
