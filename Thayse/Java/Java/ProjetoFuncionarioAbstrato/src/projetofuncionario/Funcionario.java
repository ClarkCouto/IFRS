/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuncionario;

import static java.lang.Character.toUpperCase;

public abstract class Funcionario {
    private String nome;
    private char sexo;
    private String cpf;

    private Endereco endereco;
    
    private static double limiteINSS = 900;
    public double salario = 0;
    
    
    public static final char MASCULINO = 'M';
    public static final char FEMININO  = 'F';
    
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
        
        if (sexo==MASCULINO || sexo==FEMININO) {
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
    
    
    abstract public double salarioBruto();
    
    public double txINSS() {
        double tINSS;
        if(salarioBruto() <= 1000){
            tINSS = 0.08;
	}
	else if(salarioBruto() > 1000 && salarioBruto() <= 2000){
            tINSS = 0.09;
	}
	else if(salarioBruto() > 1000 && salarioBruto() <= 2000){
            tINSS = 0.10;
	}
	else {
            tINSS = 0.11;
	}
    return tINSS;
    }
    
    public double valorINSS() {
        double s = this.salarioBruto();
        double vINSS = s * this.txINSS();
        if (vINSS > limiteINSS) {
            vINSS = limiteINSS;
        }
        return vINSS;
    }
    
    public double salarioLiquido() {
        return this.salarioBruto() - this.valorINSS();
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public double getLimiteINSS() {
        return limiteINSS;
    }
    
    public void setLimiteINSS(double limiteINSS) {
        this.limiteINSS = limiteINSS;
    }
    
    @Override
    public String toString( ) {
        return "Funcionario [nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf
        + ", salario bruto=" + salarioBruto() + ", endereco=" + endereco;
    }
    
    
    
    public boolean equals(Funcionario f) {
        if (this.nome.equals(f.nome)
                && this.sexo==f.sexo 
                && this.cpf.equals(f.cpf) 
                && this.salarioBruto()==f.salarioBruto()
                && this.endereco.getRua().equals(f.endereco.getRua()) 
                && this.endereco.getNumero()==f.endereco.getNumero()) {
            return true;
        } else {
            return false;
        }
    }
}
