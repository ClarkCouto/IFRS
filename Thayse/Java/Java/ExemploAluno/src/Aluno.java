
public class Aluno {

	
	public String nome;
	private float nota1;
	private float nota2;
	
	
	
	
/*	public void registraNota1(float nota1) {                //pra poder usar os atributos no programa
		if (nota1 >= 0 && nota1<=10) {
			this.nota1 = nota1;							   //a nota1 do atributo da classe vai receber a nota1 do método registraNota
		}													//setter
	}
	
	public float obterNota1() {								//getter
		return this.nota1;
	}
	
	
	public void registraNota2(float nota2) {                //pra poder usar os atributos no programa
		if (nota2 >= 0 && nota2<=10) {
			this.nota2 = nota2;							   //a nota1 do atributo da classe vai receber a nota1 do método registraNota
		}
	}
	
	public float obterNota2() {
		return this.nota2;
	}
	*/
	
	public float media() {
		return ((this.getNota1() + this.getNota2()) / 2);  //this referencia os atributos da classe
	}




	public float getNota1() {
		return nota1;
	}




	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}




	public float getNota2() {
		return nota2;
	}




	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	
} //Aluno
