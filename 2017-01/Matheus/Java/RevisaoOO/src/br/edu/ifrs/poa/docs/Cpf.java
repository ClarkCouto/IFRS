package br.edu.ifrs.poa.docs;

public class Cpf {
    
    // Atributos
    
    private String numero;
    private int digito;
    
    // Construtores

    public Cpf() {}
    
    public Cpf(String numero, int digito) {
        this.numero = numero;
        this.digito = digito;
    }
    
    // Getters & Setters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public long getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }
    
    // Métodos
    
    @Override
    public String toString() {
        return "Cpf:" + numero + "-" + digito;
    }
    
    public void imprimir() {
        System.out.println(toString());
    }
    
}
