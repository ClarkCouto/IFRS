/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

/**
 *
 * @author Thayse
 */
public final class Cliente {
    private String nome;
    private String cpf;
    
    public Cliente() {
        
    }
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
   
    
  
  @Override
    public String toString() {
        return "Cliente:" + nome;
    }
}
