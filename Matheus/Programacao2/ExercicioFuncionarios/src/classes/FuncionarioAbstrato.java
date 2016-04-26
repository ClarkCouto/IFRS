/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author 0559156
 */
public abstract class FuncionarioAbstrato {

    private String nome;
    private char sexo;
    private String cpf;
    private Endereco endereco;
    private float limiteINSS;
    
    public final char MASCULINO = 'M';
    public final char FEMININO = 'F';

    
     public FuncionarioAbstrato (String nome, char sexo, String cpf, String rua,
                                 int numero, String complemento, String bairro,
                                 String cidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = new Endereco(rua, numero, complemento, bairro, cidade);
     }
    
    public abstract float salarioBruto(); 
    
    public float salarioBaseIR () {
        return salarioBruto() - valorINSS();
    }
    
    public float salarioLiquido () {
        return salarioBaseIR() - valorIR();
    }
    
    public float txINSS () {
        
        float taxa;
        
        if (salarioBruto() <= 1000f)
            taxa = 0.08f;
        else if (salarioBruto() <= 2000f)
            taxa = 0.09f;
        else if (salarioBruto() <= 3000f)
            taxa = 0.10f;
        else
            taxa = 0.11f;
        
        return taxa;
    }
    
    public float valorINSS () {
        
        float valor = salarioBruto() * txINSS();
        
        if (valor > limiteINSS)
            valor = limiteINSS;
        
        return valor;
    }
    
    public float txIR () {
        float taxa;
        
        if (salarioBaseIR() <= 1000f)
            taxa = 0f;
        else if (salarioBaseIR() <= 3000f)
            taxa = 0.10f;
        else if (salarioBaseIR() <= 5000f)
            taxa = 0.20f;
        else
            taxa = 0.30f;
        return taxa;
    }
    
    public float valorIR () {
        return salarioBaseIR() * txIR();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the limiteINSS
     */
    public float getLimiteINSS() {
        return limiteINSS;
    }

    /**
     * @param limiteINSS the limiteINSS to set
     */
    public void setLimiteINSS(float limiteINSS) {
        this.limiteINSS = limiteINSS;
    }
    
    
}
