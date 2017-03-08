package br.edu.ifrs.poa.main;

import br.edu.ifrs.poa.pessoas.Aluno;
import br.edu.ifrs.poa.pessoas.Pessoa;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Revisao {      
    
    private static int exibeMenu() {
        String texto = "1 - Cadastrar Aluno\n" +
                       "2 - Pesquisar Aluno pelo nome\n" +
                       "3 - Pesquisar Aluno pelo CPF\n" +
                       "4 - Listar todos os Alunos\n" +
                       "5 - Sair";
        
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }

    public static void main(String[] args) {                       
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();        

        while (true) {
                                    
            try {
                switch(exibeMenu()){                       
                    
                    case 1:               
                        //pessoas.add(Dados.cadastrar());
                        pessoas.add(new Aluno("Matheus Ligabue", "51 9798-6807", "Rua Paulo Gomes de Oliveira", 559156, "SSI", 1, "034527460", 11));
                        pessoas.add(new Aluno("Matheus Renovado", "51 9798-6808", "Rua Gaston Englert", 559156, "SSI?", 0, "034527460", 12));                     
                        break;                    
                    case 2:
                        System.out.println("\n=============== Pesquisa por nome ==============");
                        Dados.exibir(Dados.pesquisarNome(pessoas));
                        break;
                    case 3:
                        System.out.println("\n=============== Pesquisa por CPF ===============");
                        Dados.exibir(Dados.pesquisarCpf(pessoas));
                        break;
                    case 4:
                        System.out.println("\n=============== Todas as pessoas ===============");
                        Dados.exibirTodos(pessoas);
                        break;
                    case 5:
                        System.out.println("\n===== Obrigado por utilizar nosso sistema! =====\n");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n================================================"+
                                           "\n                  Opção inválida!               "+
                                           "\n================================================");
                }
            } catch (HeadlessException e) {
                throw e;
            }
        }        
    }          
    
}
