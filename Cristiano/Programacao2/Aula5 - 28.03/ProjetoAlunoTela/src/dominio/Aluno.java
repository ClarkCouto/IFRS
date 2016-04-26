package dominio;

public class Aluno {
  private String nome;
  private float nota1;
  private float nota2;

  //Construtor
  public Aluno(String n) {
    this.nome = n;
    this.nota1 = 0;
    this.nota2 = 0;
  }

  //Outro construtor
  public Aluno(String n, float n1, float n2) {
    this.nome = n;
    this.setNota1(n1);
    this.setNota2(n2);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getNota1() {
    return nota1;
  }

  //Utilizando o parâmetro x para ceceber a nota.
  public void setNota1(float x) {
    if ( (x >= 0) && (x <= 10) ) {
      this.nota1 = x;
    }
    else {
      //Lançando um exceção.
      throw new RuntimeException("Nota 1 inválida.");
    }
  }

  public float getNota2() {
    return nota2;
  }

  //Utilizando o parâmetro nota2 para receber a nota.
  public void setNota2(float nota2) {
    if ( (nota2 >= 0) && (nota2 <= 10) ) {
      this.nota2 = nota2;
    }
    else {
      //Lançando um exceção.
      throw new RuntimeException("Nota 2 inválida.");
    }
  }

  public float media(){
    float m;
    m = (this.nota1 + this.nota2) / 2;
    return m;
  }
  
  public String situacao() {
    if (media() < 3) {
      return "REPROVADO";
    }
    else if ( media()< 7 ) {
      return "RECUPERACAO";
    }
    else {
      return "APROVADO";
    }
  }

}//Aluno.
