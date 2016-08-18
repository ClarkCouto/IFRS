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
public class FuncionarioHorista extends FuncionarioAbstrato {
    
    private float horasTrabalhadas;
    private float salarioPorHora;

    public FuncionarioHorista(String nome, char sexo, String cpf, String rua,
            int numero, String complemento, String bairro, String cidade,
            float horasTrabalhadas, float salarioPorHora) {
        super(nome, sexo, cpf, rua, numero, complemento, bairro, cidade);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }
    
    @Override
    public float salarioBruto() {
        return horasTrabalhadas * salarioPorHora;
    }
    
}
