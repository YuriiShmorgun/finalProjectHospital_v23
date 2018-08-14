package model.dao;

import java.util.List;

public interface ICreateDeleteGenericDao<T> extends AutoCloseable{

    void create (T entity);
    T findById(int id);
    List<T> findAll();

    void delete(int id);

}



