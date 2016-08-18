/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author matheus
 */
public class FuncionarioFixo extends FuncionarioAbstrato {

    private float salario;

    public FuncionarioFixo(String nome, char sexo, String cpf, String rua,
                           int numero, String complemento, String bairro,
                           String cidade, float salario) {
        super(nome, sexo, cpf, rua, numero, complemento, bairro, cidade);
        this.salario = salario;
    }
    
    @Override
    public float salarioBruto() {
        return getSalario();
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
