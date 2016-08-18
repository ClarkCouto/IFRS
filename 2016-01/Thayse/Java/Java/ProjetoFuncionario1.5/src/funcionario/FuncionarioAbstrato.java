/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Thayse
 */
public abstract class FuncionarioAbstrato {
    //declaração de constantes
    public final static char MASCULINO = 'M';
    public final static char FEMININO = 'F';
    
    //atributos da classe
    private static float limiteINSS = 900f;
    public float salario = 0f;
    
    private String nome;
    private char sexo;
    private String cpf;
    private Date dataNascimento;
    
    private Endereco endereco;
    
    public NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    //construtores
    
    public FuncionarioAbstrato() {
        
    }
    
    public FuncionarioAbstrato(String n, char s, String cpf, Date d, 
                               String rua, int numero, String bairro, String cid) {
        this.nome = n;
        this.sexo = s;
        this.cpf = cpf;
        this.dataNascimento = d;
        
        Endereco e = new Endereco(rua, numero, bairro, cid);
        this.setEndereco(e);
      
    }
    
    public FuncionarioAbstrato(String n, char s, String cpf, Date d, 
                               String rua, int numero, String complemento, String bairro, String cid) {
        this.nome = n;
        this.sexo = s;
        this.cpf = cpf;
        this.dataNascimento = d;
        
        Endereco e = new Endereco(rua, numero, complemento, bairro, cid);
        this.setEndereco(e);
      
    }
    
    //acesso aos atributos privados
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setSexo(char sexo) {
        if (sexo == MASCULINO || sexo == FEMININO) {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo inválido.");
        }
    }
    
    public char getSexo() {
        return this.sexo;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setDate(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public Date getDate() {
        return this.dataNascimento;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    //metodos
    
    public void setLimiteINSS(float v) {
        this.limiteINSS = v;
    }
    
    public abstract float salarioBruto();
    
    public float txIR() {
        if (salarioBaseIR() <= 1000) {
            return 0.00f;
        } else if (salarioBaseIR() <=3000){
            return 0.1f;
        } else if (salarioBaseIR() <=5000) {
            return 0.2f;
        } else {
            return 0.3f;
        }
        
    }
    
    public float txINSS() {
        if (salarioBruto() <= 1000) {
            return 0.08f;
        } else if (salarioBruto() <= 2000) {
            return 0.09f;
        } else if(salarioBruto() <= 3000) {
            return 0.1f;
        } else {
            return 0.1f;
        }
                
    }
    
    public float valorIR() {
        return salarioBaseIR() *txIR() / 100f;
    }
    
    public float valorINSS() {
        float valorINSS = this.salarioBruto() * this.txINSS();
        if(valorINSS > limiteINSS) {
            valorINSS = limiteINSS;
        }
        
        return limiteINSS;
        
        
    }
    
    public float salarioBaseIR() {
        return salarioBruto() - valorINSS();
    }
    
    public float salarioLiquido() {
        return salarioBruto() - valorINSS() - valorIR();
    }
    
    
}
