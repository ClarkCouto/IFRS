package testes;

import telas.TelaAluno;
import dominio.Aluno;

public class TesteTelaAluno {

  public static void main(String[] args) {
    Aluno a1 = new Aluno("---");
    Aluno a2 = new Aluno("---");
    
    TelaAluno tela = new TelaAluno(a1);

    tela.leTodosDados();
    tela.imprime();

    tela.setAluno(a2);
    tela.leTodosDados();
    tela.imprime();
    
    tela.setAluno(a1);
    tela.imprime();

  }

}
