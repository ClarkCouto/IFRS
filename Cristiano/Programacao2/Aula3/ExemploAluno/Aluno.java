
public class Aluno {
    private String nome;
    private float nota1;
    private float nota2;
        
    public Aluno(){
    }

    public String getNome() {
        return this.nome;
    }

    public float getNota1() {
        return this.nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(float nota1) {
    	if(nota1 >= 0 && nota1 <= 10){
            this.nota1 = nota1;
    	}
    }

    public void setNota2(float nota2) {
    	if(nota2 >= 0 && nota2 <= 10){
            this.nota2 = nota2;
    	}
    }
    
    public float media(){
        return (this.nota1 + this.nota2)/2;
    }
    
    public String situacao(){
    	float media = this.media();
    	if(media < 3){
    		return "REPROVADO";
    	}
    	else if(media >= 3 && media <7){
    		return "RECUPERAÇÃO";
    	}
    	else{
    		return "APROVADO!";
    	}
    }
}
