package br.edu.ifrs.poa.docs;

public class Cpf {
    
    // Atributos
    
    private long numero;
    private int digito;
    
    // Construtores

    public Cpf() {}
    
    public Cpf(long numero, int digito) {
        this.numero = numero;
        this.digito = digito;
    }
    
    // Getters & Setters

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
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
