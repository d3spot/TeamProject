package dao;

import java.util.List;

public interface MainDao<E, N extends Number> {
	public void add(E element);

	public void update(E element);

	public E getByID(N elementId);

	public List<E> getAll();

	public void delete(E element);
}
