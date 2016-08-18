/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.FuncionarioComissionado;
import classes.FuncionarioFixo;
import classes.FuncionarioHorista;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public final class TelaFuncionario {
    
    //Atributos que mantem uma referencia aos objetos funcionário*
    private FuncionarioComissionado funcComissionado;
    private FuncionarioFixo funcFixo;
    private FuncionarioHorista funcHorista;
    
    //Atributo para fazer leitura pelo teclado.
    protected static Scanner scan = new Scanner(System.in);
    
    //Construtores
    public TelaFuncionario (FuncionarioComissionado func) {
        setFuncComissionado(func);
    }
    
    public TelaFuncionario (FuncionarioFixo func) {
        setFuncFixo(func);
    }
    
    public TelaFuncionario (FuncionarioHorista func) {
        setFuncHorista(func);
    }

    
    /**
     * @return the funcComissionado
     */
    public FuncionarioComissionado getFuncComissionado() {
        return funcComissionado;
    }

    /**
     * @param funcComissionado the funcComissionado to set
     */
    public void setFuncComissionado(FuncionarioComissionado funcComissionado) {
        if (funcComissionado == null)
            throw new RuntimeException("Erro: aluno null.");
        else        
            this.funcComissionado = funcComissionado;
    }

    /**
     * @return the funcFixo
     */
    public FuncionarioFixo getFuncFixo() {
        return funcFixo;
    }

    /**
     * @param funcFixo the funcFixo to set
     */
    public void setFuncFixo(FuncionarioFixo funcFixo) {
        if (funcFixo == null)
            throw new RuntimeException("Erro: aluno null.");
        else        
            this.funcFixo = funcFixo;
    }

    /**
     * @return the funcHorista
     */
    public FuncionarioHorista getFuncHorista() {
        return funcHorista;
    }

    /**
     * @param funcHorista the funcHorista to set
     */
    public void setFuncHorista(FuncionarioHorista funcHorista) {
        if (funcHorista == null)
            throw new RuntimeException("Erro: aluno null.");
        else
            this.funcHorista = funcHorista;
    }
}
