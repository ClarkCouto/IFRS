
public class Aluno {

	public String nome;
	private float nota1, nota2;
	
	
	public float media() {
		return (this.nota1 + this.nota2) / 2;
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
	
}
