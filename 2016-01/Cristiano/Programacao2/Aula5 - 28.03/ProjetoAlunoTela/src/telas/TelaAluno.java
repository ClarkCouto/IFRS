package telas;

import java.util.Scanner;

import dominio.Aluno;

public class TelaAluno {

  //Atributo que mantem uma referencia ao objeto aluno.
  private Aluno aluno;
  
  //Atributo para fazer leitura pelo teclado.
  protected static Scanner scan = new Scanner(System.in);
  
  //Construtor.
  public TelaAluno(Aluno a) {
    setAluno(a);
  }
  
  public void setAluno(Aluno a){
    if (a == null) {
      throw new RuntimeException("Erro: aluno null.");
    }
    else {
      this.aluno = a;
    }
  }
  
  public Aluno getAluno() {
    return aluno;
  }

  public Aluno leNome() {
    System.out.print("Digite o nome: ");
    String s = scan.nextLine();
    aluno.setNome(s);
    return aluno;
  }

  public Aluno leNota1() {
    System.out.print("Digite a Nota 1: ");
    Float f = scan.nextFloat();
    scan.nextLine(); //Necessário sempre depois que lê um número (para limpar o ENTER do buffer do teclado).
    aluno.setNota1(f);
    return aluno;
  }

  public Aluno leNota2() {
    System.out.print("Digite a Nota 2: ");
    Float f = scan.nextFloat();
    scan.nextLine(); //Necessário sempre depois que lê um número (para limpar o ENTER do buffer do teclado).
    aluno.setNota2(f);
    return aluno;
  }

  public Aluno leNotas() {
    leNota1();
    leNota2();
    return aluno;
  }

  public Aluno leTodosDados() {
    leNome();
    leNota1();
    leNota2();
    return aluno;
  }

  public void imprime() {
    System.out.println("Nome   : " + aluno.getNome());
    System.out.println("Nota 1 = " + aluno.getNota1());
    System.out.println("Nota 2 = " + aluno.getNota2());
  }
  
}//TelaAluno