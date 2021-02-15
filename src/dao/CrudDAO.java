package dao;

import java.util.ArrayList;
import java.util.List;

public interface CrudDAO<T,ID> extends SuperDAO {

    public Boolean save(T entity)throws Exception;

    public Boolean delete(ID id)throws Exception;

    public Boolean update(T entity)throws Exception;

    public List<T> getAll()throws Exception;

    public T findByID(ID id)throws Exception;
}
