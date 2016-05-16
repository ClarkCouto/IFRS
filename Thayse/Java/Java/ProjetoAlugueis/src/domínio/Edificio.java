/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domínio;

import java.util.List;
import domínio.Apto;
import java.util.ArrayList;

/**
 *
 * @author Thayse
 */
public class Edificio {
    private String nome;
    private Apto apto;
    
    List<Apto> listaApto = new ArrayList<>();
    List<Apto> listaAptoAlugado = new ArrayList<>();
    
    public Edificio() {
        
    }
    
    public Edificio(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setApto(Apto apto) {
        this.apto = apto;
    }
    
    public Apto getApto() {
        return this.apto;
    }
    
    public void adicionaApartamento(Apto a){
        listaApto.add(a);
    }
    
    public List<Apto> getApartamentosAlugados(){
        List<Apto> apartamentos = new ArrayList<>();
        for(Apto a : listaApto){
            if(a.getAlugado()){
                listaAptoAlugado.add(a);
            }
        }
        return listaAptoAlugado;
    }
    
    

}
