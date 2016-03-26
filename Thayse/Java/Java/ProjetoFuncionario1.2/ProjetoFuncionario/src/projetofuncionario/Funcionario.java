/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuncionario;

public class Funcionario {
    private String nome;
    private char sexo;
    private String cpf;
    private double salarioBruto;
    
    public Funcionario() {
        
    }
    
    public Funcionario (String n, char s, String cpf, double sal) {
        this.nome = n;
        this.sexo = s;
        this.cpf = cpf;
        this.salarioBruto = sal;
               
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
        if (sexo=='M' || sexo=='F') {
            this.sexo = sexo;
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
    
    public double getSalarioBruto() {
        return this.salarioBruto;
    }
    
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public double txINSS() {
        double tINSS;
        if(salarioBruto <= 1000){
            tINSS = 0.08;
	}
	else if(salarioBruto > 1000 && salarioBruto <= 2000){
            tINSS = 0.09;
	}
	else if(salarioBruto > 2000 && salarioBruto <= 3000){
            tINSS = 0.10;
	}
	else {
            tINSS = 0.11;
	}
    return tINSS;
    }
    
    public double valorINSS() {
        double salario = this.getSalarioBruto();
        double vINSS = salario * this.txINSS();
        if (vINSS > 900) {
            vINSS = 900;
        }
        return vINSS;
    }
    
    public double salarioLiquido() {
        return this.getSalarioBruto() - this.valorINSS() - this.valorIR();
    }
    
    public double salarioBaseIR() {
        return salarioBruto - this.valorINSS();
    }
    
    public double txIR() {
        double taxaIR;
        if(this.salarioBaseIR() <= 1000){
            taxaIR = 0.0;
	}
	else if(this.salarioBaseIR() > 1000 && this.salarioBaseIR() <= 3000){
            taxaIR = 0.10;
	}
	else if(this.salarioBaseIR() > 3000 && this.salarioBaseIR() <= 5000){
            taxaIR = 0.20;
	}
	else {
            taxaIR = 0.30;
	}
    return taxaIR;
    }
   
    public double valorIR() {
        return this.salarioBaseIR() * this.txIR();
    }
}
