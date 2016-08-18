/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Clark
 */
public class Cliente {
    private String nome;
    private String cpf;
    
    public Cliente(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }  
    
    public String getCpf(){
        return this.cpf;
    }
    
    @Override
    public String toString(){
        return "Nome = " + this.nome + ", CPF = " + this.cpf;
    }
}
