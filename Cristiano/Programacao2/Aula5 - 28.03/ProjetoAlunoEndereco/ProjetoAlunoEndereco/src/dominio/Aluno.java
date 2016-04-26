package dominio;

public class Aluno {
  private String nome;
  private float nota1;
  private float nota2;
  private Endereco endereco;


  public Aluno() {

  }

  //Construtor
  public Aluno(String n) {
    this.setNome(n);
  }

  //Outro construtor
  public Aluno(String n, float n1, float n2) {
    this.setNome(n);
    this.setNota1(n1);
    this.setNota2(n2);
  }

  //Outro construtor
  public Aluno(String n, float n1, float n2, Endereco e ) {
    this.setNome(n);
    this.setNota1(n1);
    this.setNota2(n2);
    this.setEndereco(e);
  }

  //Outro construtor
  public Aluno(String n, float n1, float n2, String rua, int numero) {
    this.setNome(n);
    this.setNota1(n1);
    this.setNota2(n2);

    Endereco e;
    e = new Endereco(rua, numero);
    this.setEndereco(e);
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if (nome == null) {
      new RuntimeException("Erro Aluno: nome nao pode ser null");
    }
    else if (nome.equals("")) {
      new RuntimeException("Erro Aluno: nome nao pode ser vazio");
    }
    else {
      this.nome = nome;
    }
  }

  public float getNota1() {
    return nota1;
  }

  //Utilizando o paraametro x para receber a nota.
  public void setNota1(float nota1) {
    if ( (nota1 >= 0) && (nota1 <= 10) ) {
      this.nota1 = nota1;
    }
    else {
      //Lancando um excecao.
      throw new RuntimeException("Erro Aluno: Nota 1 invalida="+nota1+".");
    }
  }

  public float getNota2() {
    return nota2;
  }

  //Utilizando o parametro nota2 para receber a nota.
  public void setNota2(float nota2) {
    if ( (nota2 >= 0) && (nota2 <= 10) ) {
      this.nota2 = nota2;
    }
    else {
      //Lancando um excecao.
      throw new RuntimeException("Erro Aluno: Nota 2 invalida="+nota2+".");
    }
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
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

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2
        + ", endereco=" + endereco + "]";
  }

}//Aluno.