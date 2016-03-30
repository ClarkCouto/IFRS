public class TestaFuncionario {

	public static void main(String[] args) {

	Funcionarios f1 = new Funcionarios("João da Silva", 'M', "123.456.789-99", 10000.00);

	System.out.println("---------------------------------");
	System.out.println("Dados do funcionário");
	System.out.println("---------------------------------");
	System.out.println("Nome: " + f1.getNome());
	System.out.println("Sexo: " + f1.getSexo());
	System.out.println("CPF: " + f1.getCpf());
	System.out.println("---------------------------------");
	System.out.println("Salário Bruto\t= " + f1.getSalarioBruto());
	System.out.println("INSS ("+ (int) (f1.txINSS() * 100) + "%)\t= " + f1.valorINSS());
	System.out.println("\t\t --------");
	System.out.println("Salário Líquido\t= " + f1.salarioLiquido());
	
	}

}
