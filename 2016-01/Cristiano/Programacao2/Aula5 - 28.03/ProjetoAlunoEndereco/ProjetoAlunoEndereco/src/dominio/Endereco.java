package dominio;

public class Endereco {

  private String rua;
  private int numero;

  //Não implementar o construtor default, senão poderá ser 
  //instanciado um Endereco com rua invalida (vazia ou null).
  /*
  public Endereco() {
  }
  */
  
  public Endereco(String rua, int numero) {
    this.setRua(rua);
    this.setNumero(numero);
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    if (rua==null) {
      //Lancando um excecao.
      throw new RuntimeException("Erro Endereco: rua não pode ser null");
    }
    else if (rua.equals("")) {
      //Lancando um excecao.
      throw new RuntimeException("Erro Endereco: rua não pode ser vazio");
    }
    else {
      this.rua = rua;
    }
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    return "Endereco [rua=" + rua + ", numero=" + numero + "]";
  }

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + numero;
	result = prime * result + ((rua == null) ? 0 : rua.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Endereco other = (Endereco) obj;
	if (numero != other.numero)
		return false;
	if (rua == null) {
		if (other.rua != null)
			return false;
	} else if (!rua.equals(other.rua))
		return false;
	return true;
}
  
  
  /*
  public boolean equals(Object obj){
	  Endereco e = (Endereco) obj;
	  if(this.numero == e.getNumero() && this.rua.equals(e.getRua())){
		  return true;
	  }
	  else{
		  return false;
	  }
  }
 */
}//Endereco.