/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuncionario;

/**
 *
 * @author Thayse
 */
public class Endereco {
    private String rua;
    private int numero;
    
    public Endereco() {
        
    }
    
    public Endereco(String rua, int numero) {
        this.setRua(rua);
        this.setNumero(numero);
    }
    
    public String getRua() {
        return rua;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setRua(String r) {
        if (r==null) {
            throw new RuntimeException("O endereco nao pode estar null");
        } else if (r.equals("")) {
            throw new RuntimeException("O endereco nao pode estar vazio");
        } else {
            this.rua = r;
        }
        
    }
    
    public void setNumero(int n) {
        this.numero = n;
    }
    
    @Override
    public String toString() {
        return "Endereco: \n Rua: " + rua + " \n Numero: " + numero;
    }
}
