/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuncionario;

import static java.lang.Character.toUpperCase;

public class Funcionario {
    private String nome;
    private char sexo;
    private String cpf;
   // private double salarioBruto;
    private Endereco endereco;
    
    public Funcionario() {
        
    }
    
    public Funcionario (String n, char s, String cpf, String rua, int numero) {
        this.nome = n;
        this.sexo = s;
        this.cpf = cpf;
        
        
        Endereco e = new Endereco(rua, numero);
        this.setEndereco(e);
        
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        
        this.nome = nome;
    }
    
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char sexo) {
        
        if (sexo=='M' || sexo=='F' || sexo=='f' || sexo=='m') {
            this.sexo = toUpperCase(sexo);
        } else {
            System.out.println("Valor inválido. Insira M ou F \n");
        }
        
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /**
    public double getSalarioBruto() {
        return this.salarioBruto;
    }
    
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    **/
    
    /**
     * public double getSalarioBruto() {
        return this.salarioBruto;
    }
    
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
     
     */
    public double salario = 0;
    
    public double salarioBruto(double salario) {
        
        return salario;
    }
    
    public double txINSS() {
        double tINSS;
        if(salarioBruto(salario) <= 1000){
            tINSS = 0.08;
	}
	else if(salarioBruto(salario) > 1000 && salarioBruto(salario) <= 2000){
            tINSS = 0.09;
	}
	else if(salarioBruto(salario) > 1000 && salarioBruto(salario) <= 2000){
            tINSS = 0.10;
	}
	else {
            tINSS = 0.11;
	}
    return tINSS;
    }
    
    public double valorINSS() {
        double s = this.salarioBruto(salario);
        double vINSS = s * this.txINSS();
        if (vINSS > 900) {
            vINSS = 900;
        }
        return vINSS;
    }
    
    public double salarioLiquido() {
        return this.salarioBruto(salario) - this.valorINSS();
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString( ) {
        return "Funcionario [nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf
        + ", salario bruto=" + salarioBruto(salario) + ", endereco=" + endereco;
    }
    
    
    public boolean equals(Funcionario f) {
        if (this.nome.equals(f.nome)
                && this.sexo==f.sexo 
                && this.cpf.equals(f.cpf) 
                && this.salarioBruto(salario)==f.salarioBruto(salario)
                && this.endereco.getRua().equals(f.endereco.getRua()) 
                && this.endereco.getNumero()==f.endereco.getNumero()) {
            return true;
        } else {
            return false;
        }
    }
}
