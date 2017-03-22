
public interface Lista<T> {
	public void adicionar (int i, T obj);
	public boolean remover(T obj);
	public String listar();
	public int totalizar();
	public T getFirst();
	public T getLast();


}
