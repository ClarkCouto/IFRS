import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MinhaLista<E> implements Lista<E> {
	
	LinkedList<E> objetos = new LinkedList<>();
	
	
	@Override
	public void adicionar(int i, E obj) {
		try {
			objetos.add(i, obj);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("A posição a ser inserida é maior que o tamanho da lista.");
			
		}
		
	}

	@Override
	public boolean remover(E obj) throws NoSuchElementException {		
		return objetos.remove(obj);		
	}

	@Override
	public String listar() {
		String lista = "";
		for (E obj : objetos) {			
			lista += obj.toString() + " ";
		}
		return lista;
	}

	@Override
	public int totalizar() {						
		return objetos.size();
	}

	@Override
	public E getFirst() {
		try {
			return objetos.getFirst();
		} catch (NoSuchElementException e) {
			System.out.println("Impossível retornar primeiro elemento - A lista está vazia.");
			return null;
		}			
	}

	@Override
	public E getLast() {
		throw new NoSuchElementException();		
	}

	
	
}

	