import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		char sexo;
		
		Funcionario f1 = new Funcionario();
		
		//f1.setNome("João da Silva");
		//f1.setSexo('M');
		//f1.setCpf("123456789-99");
		//f1.setSalarioBruto(10000.00);
		
		//Funcionario f1 = new Funcionario("João da Silva", 'M', "123456789-99", 10000.00);

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Nome do Funcionário: ");
		f1.setNome(scan.nextLine());
		
		do{
			System.out.println("Digite o Sexo (M ou F): ");
			sexo = scan.nextLine().toUpperCase().charAt(0);
			if(sexo != 'M' && sexo != 'F'){
				System.out.println("Sexo Inválido!");
			}
		}
		while(sexo != 'M' && sexo != 'F');
		f1.setSexo(sexo);
		
		System.out.println("Digite o CPF: ");
		f1.setCpf(scan.nextLine());

		System.out.println("Digite o Salário Bruto: ");
		f1.setSalarioBruto(scan.nextDouble());
		scan.close();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Dados do Funcionário");
		System.out.println("--------------------------------");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Sexo: " + f1.getSexo());
		System.out.println("CPF : " + f1.getCpf());
		System.out.println("--------------------------------");
		System.out.printf("Salario Bruto    = %.2f\n", f1.getSalarioBruto());
		System.out.printf("INSS (%d%%)       =  %.2f\n", f1.txINSS(f1.getSalarioBruto()), f1.valorINSS());  
		System.out.println("                   -------");
		System.out.printf("Salario Base IR  = %.2f\n", f1.salarioBaseIR());
		System.out.printf("IR (" + f1.txIR() + "%%)         =  %.2f\n", f1.valorIR()); 
		System.out.println("                   -------");
		System.out.printf("Salario Liquido  = %.2f\n", f1.salarioLiquido());
		System.out.println("--------------------------------");
	}
}