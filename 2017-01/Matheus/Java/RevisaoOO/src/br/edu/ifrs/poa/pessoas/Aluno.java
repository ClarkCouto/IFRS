package br.edu.ifrs.poa.pessoas;

import br.edu.ifrs.poa.docs.Cpf;

public class Aluno extends Pessoa{
    
    // Atributos
    
    private long matricula;
    private String curso;
    private int situacao;
    private Cpf cpf;
    
    // Construtores
    
    public Aluno() {
        super();
    }
    
    public Aluno(String nome, String telefone, String endereco, long matricula, String curso, int situacao) {
        super(nome, telefone, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.situacao = situacao;
    }

    public Aluno(String nome, String telefone, String endereco, long matricula, String curso, int situacao, String numero, int digito) {
        super(nome, telefone, endereco);
        this.matricula = matricula;
        this.curso = curso;
        this.situacao = situacao;
        this.cpf = new Cpf(numero, digito);
    }
    
    // Getters & Setters

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }
    
    // Métodos
    
    @Override
    public String toString() {
        return super.toString() +
               ", matricula =" + matricula +
               ", curso=" + curso +
               ", situacao=" + situacao +
                (cpf != null ? ", " + cpf.toString() : "");
    }
}
