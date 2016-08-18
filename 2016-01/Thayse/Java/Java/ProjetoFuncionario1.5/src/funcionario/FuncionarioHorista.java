/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

import java.util.Date;

/**
 *
 * @author Thayse
 */
public class FuncionarioHorista extends FuncionarioAbstrato {
    //atributos da classe
    private float horasTrabalhadas;
    private float salarioPorHora;
    
    //construtores
    
    public FuncionarioHorista() {
        super();
    }
    
    public FuncionarioHorista(String n, char s, String cpf, Date d, 
                               String rua, int numero, String bairro, String cid) {
        super(n, s, cpf, d, rua, numero, bairro, cid);
      
    }
    
    public FuncionarioHorista(String n, char s, String cpf, Date d, 
                               String rua, int numero, String complemento, String bairro, String cid) {
        super(n, s, cpf, d, rua, numero, complemento, bairro, cid);
      
    }
    
    //getters e setters
    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public float getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    
    public void setSalarioPorHora(float salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
    
    public float getSalarioPorHora() {
        return this.salarioPorHora;
    }
    
    @Override
    public float salarioBruto() {
        return this.getHorasTrabalhadas() * this.getSalarioPorHora();
    }
    
}
