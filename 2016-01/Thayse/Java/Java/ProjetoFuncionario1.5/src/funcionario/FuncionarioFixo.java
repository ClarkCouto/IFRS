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
public class FuncionarioFixo extends FuncionarioAbstrato {
    private float salario;
    
    //construtor chamando o da super
    
    public FuncionarioFixo() {
        super();
    }
    
    public FuncionarioFixo(String n, char s, String cpf, Date d, 
                               String rua, int numero, String bairro, String cid) {
        super(n, s, cpf, d, rua, numero, bairro, cid);
      
    }
    
    public FuncionarioFixo(String n, char s, String cpf, Date d, 
                               String rua, int numero, String complemento, String bairro, String cid) {
        super(n, s, cpf, d, rua, numero, complemento, bairro, cid);
      
    }

    
    
    //getters e setters
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float getSalario() {
        return this.salario;
    }
    
    @Override
    public float salarioBruto() {
        return salario;
    }
}
