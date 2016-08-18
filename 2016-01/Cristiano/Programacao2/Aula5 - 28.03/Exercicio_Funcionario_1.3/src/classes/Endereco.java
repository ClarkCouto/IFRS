package classes;

public class Endereco {

	  private String rua;
	  private int numero;
	  private String cidade;
	  private String estado;
	  
	  public Endereco(){}
	  
	  public Endereco(String rua, int numero, String cidade, String estado) {
	    this.setRua(rua);
	    this.setNumero(numero);
	    this.setCidade(cidade);
	    this.setEstado(estado);
	  }

	  public String getRua() {
	    return rua;
	  }

	  public void setRua(String rua) {
	    if (rua == null) {
	      throw new RuntimeException("Erro Endereço: Rua não pode ser null");
	    }
	    else if (rua.equals("")) {
	      throw new RuntimeException("Erro Endereço: Rua não pode ser vazio");
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

	  public String getCidade(){
		  return this.cidade;
	  }
	  
	  public void setCidade(String cidade){
		  this.cidade = cidade;
	  }
	  
	  public String getEstado(){
		  return this.estado;
	  }
	  
	  public void setEstado(String estado){
		  this.estado = estado.substring(0, 2).toUpperCase();
	  }
	  
	  public void imprime(){
		    System.out.println("Imprime...Endereco = Rua " + this.rua + ", " + this.numero + " - " + this.cidade + " / " + this.estado);
	  }
	  
	  @Override
	  public String toString() {
	     return "Endereco = Rua " + this.rua + ", " + this.numero + " - " + this.cidade + " / " + this.estado;
	  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
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
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (numero != other.numero)
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}	  
}
