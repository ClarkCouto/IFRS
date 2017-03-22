import java.util.NoSuchElementException;

public class Testes {

	public static void main(String[] args) {

		MinhaLista<Integer> inteiros = new MinhaLista<>();

		// adicionar()
		inteiros.adicionar(0, 2);
		inteiros.adicionar(0, 1);
		inteiros.adicionar(1, 33);
		inteiros.adicionar(4, 0);

		// remover()
		inteiros.remover(1);

		// listar()
		System.out.println(inteiros.listar());

		// totalizar()
		System.out.println("Tamanho: " + inteiros.totalizar());

		// getFirst()
		try {
			System.out.println(inteiros.getFirst());
		} catch(NoSuchElementException e) {
			System.out.println("Elemento não encontrado.");
		}

		// getLast()
		try {
			System.out.println(inteiros.getLast());
		} catch (NoSuchElementException e) {
			System.out.println("O método getLast() sempre vai dar throw nesta exception.");
		}
	}

}
