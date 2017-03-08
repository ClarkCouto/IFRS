package br.edu.ifrs.poa.docs.ui;

import br.edu.ifrs.poa.pessoas.Pessoa;
import br.edu.ifrs.poa.utils.Crud;

public class Revisao {       

    public static void main(String[] args) {
        
        int maxAlunos = 2;
                
        Pessoa pessoas[] = new Pessoa[maxAlunos];
        
        Menu meuMenu = new Menu();
        String textoMenu = "1 - Cadastrar Aluno\n" +
                           "2 - Pesquisar Aluno pelo nome\n" +
                           "3 - Pesquisar Aluno pelo CPF\n" +
                           "4 - Listar todos os Alunos\n" +
                           "5 - Sair";
        
        int alunosCadastrados = 0;

        while (true) {
            
            try {
                switch(meuMenu.exibe(textoMenu)){
                    case 1:
                        if (alunosCadastrados < maxAlunos) {
                            pessoas[alunosCadastrados] = Crud.cadastrar();
                        }
                        else {
                            System.exit(0);
                        }                
                        break;                    
                    case 2:

                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                throw e;
            }
        }        
    }          
    
}
