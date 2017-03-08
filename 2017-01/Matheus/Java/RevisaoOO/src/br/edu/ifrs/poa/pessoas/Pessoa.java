package br.edu.ifrs.poa.pessoas;

public class Pessoa {
    
    // Atributos
    
    private String nome;
    private String telefone;
    private String endereco;
    
    // Construtores
  
    public Pessoa(){}
    
    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }    
    
    // Getters & Setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    // Métodos
    
    @Override
    public String toString() {
        return "Pessoa: nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco;
    }    
    
    public void imprimir() {
        System.out.println(toString());
    }
    
}
