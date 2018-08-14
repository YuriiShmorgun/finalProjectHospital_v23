package model.dao;

public interface IUpdateGenericDao<T> extends AutoCloseable {
    void update(T entity);
}
