/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author Thayse
 */
public class Endereco {
    //atributos
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    
    //construtores
    public Endereco() {
        
    }
    
    
    public Endereco(String rua, int numero, String bairro, String cid) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cid;
    }
    
    public Endereco(String rua, int numero, String com, String bairro, String cid) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = com;
        this.bairro = bairro;
        this.cidade = cid;
    }

    
    
    //getters and setters
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getRua() {
        return this.rua;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getBairro() {
        return this.bairro;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getCidade() {
        return this.cidade;
    }
}
