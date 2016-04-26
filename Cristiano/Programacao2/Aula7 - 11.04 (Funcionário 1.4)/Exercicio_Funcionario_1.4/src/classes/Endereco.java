package classes;

public class Endereco {

	  private String rua;
	  private int numero;
	  private String complemento;
	  private String bairro;
	  private String cidade;
	  //private String estado;
	  
	  public Endereco(){}
	  
	  public Endereco(String rua, int numero, String complemento, String bairro, String cidade) {
	    this.setRua(rua);
	    this.setNumero(numero);
	    this.setComplemento(complemento);
	    this.setBairro(bairro);
	    this.setCidade(cidade);
	    //this.setEstado(estado);
	  }

	  public String getRua() {
	    return rua;
	  }

	  public boolean setRua(String rua) {
		  if (rua == null || rua.equals("")) {
			  return false;
		  }
		  else {
			  this.rua = rua;
			  return true;
		  }
	  }

	  public int getNumero() {
	    return numero;
	  }

	  public void setNumero(int numero) {
	    this.numero = numero;
	  }

	  public String getComplemento(){
		  return this.complemento;
	  }
	  
	  public boolean setComplemento(String complemento){
		  if(complemento == "" || complemento == null){
			  return false;
		  }
		  else{
			  this.complemento = complemento;
			  return true;
		  }
	  }
	  
	  public String getBairro(){
		  return this.bairro;
	  }
	  
	  public boolean setBairro(String bairro){
		  if(bairro == "" || bairro == null){
			  return false;
		  }
		  else{
			  this.bairro = bairro;
			  return true;
		  }
	  }
	  
	  public String getCidade(){
		  return this.cidade;
	  }
	  
	  public boolean setCidade(String cidade){
		  if(cidade == "" || cidade == null){
			  return false;
		  }
		  else{
			  this.cidade = cidade;
			  return true;
		  }
	  }
	  /*
	  public String getEstado(){
		  return this.estado;
	  }
	  
	  public boolean setEstado(String estado){
		  String e = estado.substring(0, 2).toUpperCase();
		  boolean existe = estadoValido(estado);
		  if(!existe){
			  return false;
		  }
		  else{
			  this.estado = e;
			  return true;
		  }	
	  }

		public boolean estadoValido(String estado){
			boolean valido = false;
			switch(estado){
				case "AC":	 
				case "AL":	 
				case "AP": 
				case "AM": 
				case "BA": 
				case "CE": 
				case "DF": 
				case "ES": 
				case "GO": 
				case "MA": 
				case "MT": 
				case "MS": 
				case "MG": 
				case "PA": 
				case "PB": 
				case "PR": 
				case "PE": 
				case "PI": 
				case "RJ": 
				case "RN": 
				case "RS": 
				case "RO": 
				case "RR": 
				case "SC": 
				case "SP": 
				case "SE": 
				case "TO":
					valido = true;
					break;
				default: 
					break;
			}
			return valido;
		}
	*/
	  
	  @Override
	  public String toString() {
	    return "Endereco = Rua " + rua + ", " + numero + " / " + complemento + " - " + cidade;
	  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
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
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
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
