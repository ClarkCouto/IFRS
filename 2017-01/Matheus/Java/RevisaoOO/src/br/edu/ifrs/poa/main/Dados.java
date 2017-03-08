/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.poa.main;

import br.edu.ifrs.poa.docs.Cpf;
import br.edu.ifrs.poa.pessoas.Aluno;
import br.edu.ifrs.poa.pessoas.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 0559156
 */
public class Dados {
    
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
        String numero = JOptionPane.showInputDialog("Informe o número:");
        int digito = Integer.parseInt(JOptionPane.showInputDialog("Informe o dígito:"));
        
        Pessoa novoAluno = new Aluno(nome, telefone, endereco, matricula, curso, situacao, numero, digito);
        return novoAluno;       
    }
    

    public static ArrayList<Pessoa> pesquisarNome(ArrayList<Pessoa> pessoas) {
        
        String nome = JOptionPane.showInputDialog("Informe o nome da pessoa:");
        
        ArrayList<Pessoa> resultado = new ArrayList<>();
        
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().toLowerCase().contains(nome.toLowerCase()))
                resultado.add(pessoa);
        }
        
        // implementar depois
        return resultado;
    }
    
    public static ArrayList<Pessoa> pesquisarCpf(ArrayList<Pessoa> pessoas) {
        
        String numero = JOptionPane.showInputDialog("Informe o número do CPF do aluno:"); 
        int digito = Integer.parseInt(JOptionPane.showInputDialog("Informe o dígito do CPF do aluno:"));                
        
        ArrayList<Pessoa> resultado = new ArrayList<>();
        
        for (Pessoa pessoa : pessoas) {            
            if (pessoa instanceof Aluno) {
                Cpf cpf = ((Aluno) pessoa).getCpf();
                if (cpf.getNumero().equals(numero) && cpf.getDigito() == digito)
                    resultado.add(pessoa);
            }
        }
        
        return resultado;
    }
    
    
    public static void exibir(ArrayList<Pessoa> pessoas) {
        switch (pessoas.size()) {
            case 0:
                System.out.println("Não foram encontradas pessoas de acordo com os dados inseridos.");
                break;
            case 1:
                System.out.println(pessoas.get(0));
                break;
            default:
                String menuText = "Escolha a pessoa desejada: \n";
                int i;
                for(i = 0; i < pessoas.size(); i++) {
                    menuText = menuText + (Integer) (i+1) + ". " + pessoas.get(i).getNome() + "\n";                    
                }
                
                int selectedOption = Integer.parseInt(JOptionPane.showInputDialog(menuText))-1;
                
                if (selectedOption < 0 || selectedOption > pessoas.size())
                    System.out.println("Opção inválida.");
                else
                    System.out.println(pessoas.get(selectedOption));
                break;
        }
    }
    
    public static void exibirTodos(ArrayList<Pessoa> pessoas) {
        int i;
        for(i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i));
        }
    }
}
