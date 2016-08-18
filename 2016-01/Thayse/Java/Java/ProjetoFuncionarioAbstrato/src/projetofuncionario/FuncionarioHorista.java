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
public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double salarioPorHora;
    
    public FuncionarioHorista() {
        
    }
    
    public FuncionarioHorista(String n, char s, String cpf, String rua, int numero) {
        super(n, s, cpf, rua, numero);
    }
    
    
    
    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double getSalarioPorHora() {
        return this.salarioPorHora;
    }
    
    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
    
   
    @Override
    public double salarioBruto() {
        this.salario = getSalarioPorHora() * getHorasTrabalhadas();
        return this.salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
