/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domínio;

/**
 *
 * @author Thayse
 */
public class Inquilino {
    private String nome;
    
    public Inquilino() {
        
    }
    
    public Inquilino(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
}
