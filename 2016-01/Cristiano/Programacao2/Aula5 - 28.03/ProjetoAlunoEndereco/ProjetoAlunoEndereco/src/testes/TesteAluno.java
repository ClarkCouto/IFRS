package testes;

import dominio.Aluno;
import dominio.Endereco;

public class TesteAluno {

  public static void main(String[] args) {
    //Declara tres objetos Aluno.
    Aluno a1, a2, a3;
    
    //Declara dois objetos Endereco.
    Endereco e1, e2;

    //Instancia aluno somente com nome.
    a1 = new Aluno("Alberto");
    //Nao eh possivel acessar atributo private.
    //a1.nome = "Joao";
    //a1.nota1 = 8;
    //a1.nota2 = 9;
    //Atribui notas.
    a1.setNota1(8);
    a1.setNota2(9);
    //Instancia um endereco.
    e1 = new Endereco("Argentina", 1000);
    //Associa o aluno a1 ao endereco e1.
    a1.setEndereco(e1);

    //Instancia um Endereco
    e2 = new Endereco("Bolivia", 2000);
    //Instancia Aluno com nome, notas e o endereco e2 anteriormente criado.
    a2 = new Aluno("Benedito", 7, 8, e2);

    //Instancia um aluno com nome, notas, rua e número.
    //O próprio objeto aluno irá instanciar um endereco.
    a3 = new Aluno("Carlos", 4, 3, "Canada", 3000);

    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    
    System.out.println("=========================================");
    //Pega o endereco do aluno a2.
    Endereco e = a2.getEndereco();
    //Modifica o número.
    e.setNumero(2200);
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);

    System.out.println("=========================================");
    //Faz com que o endereco do aluno a2 seja o mesmo do a1.
    //Pega o endereco do a1.
    e = a1.getEndereco();
    //Atribui esse endereco para a2.
    a2.setEndereco(e);
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    
    System.out.println("=========================================");
    //Pega o endereco do a2.
    e = a2.getEndereco();
    //Modifica o número.
    e.setNumero(1100);
    //Veja que o endereco de a1 e a2 foram modificados, 
    //pois os dois estavam associados ao mesmo objeto Endereco.
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    
  }//main()

}//TesteAlunoEndereco.