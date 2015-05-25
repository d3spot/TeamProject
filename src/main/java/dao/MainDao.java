package dao;

import java.util.List;

public interface MainDao<E> {
	public void add(E element);

	public void update(E element);

	public E getByID(Long elementId);

	public List<E> getAll();

	public void delete(E element);
}
