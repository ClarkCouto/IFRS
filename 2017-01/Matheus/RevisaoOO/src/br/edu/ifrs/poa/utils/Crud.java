/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.poa.utils;

import br.edu.ifrs.poa.pessoas.Aluno;
import br.edu.ifrs.poa.pessoas.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author 0559156
 */
public class Crud {
    
    public static Pessoa cadastrar() {
        // Atributos de Pessoa
        String nome = JOptionPane.showInputDialog("Informe o nome:");
        String telefone = JOptionPane.showInputDialog("Informe o telefone:");
        String endereco = JOptionPane.showInputDialog("Informe o endereço:");
        // Atributos específicos de Aluno 
        long matricula = Long.parseLong(JOptionPane.showInputDialog("Informe a matrícula:"));
        String curso = JOptionPane.showInputDialog("Informe o curso:");
        int situacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a situação:"));
        // Atributos específicos de Cpf
        long numero = Long.parseLong(JOptionPane.showInputDialog("Informe o número:"));
        int digito = Integer.parseInt(JOptionPane.showInputDialog("Informe o dígito:"));
        
        Pessoa novoAluno = new Aluno(nome, telefone, endereco, matricula, curso, situacao, numero, digito);       

        return novoAluno;       
    }
    

    public static Pessoa[] pesquisar() {
        
        // implementar depois
        return new Aluno[1];
    }
    
}
