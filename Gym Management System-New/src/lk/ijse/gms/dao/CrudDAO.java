package lk.ijse.gms.dao;

import java.util.ArrayList;

public interface CrudDAO<T ,ID>extends SuperDAO {
    boolean save(T varl)throws Exception;

    boolean update(T varl)throws Exception;

    boolean delete(ID varl)throws Exception;

    T search(ID varl)throws Exception;

    ArrayList<T> getAll()throws Exception;

    Integer lastIndex()throws Exception;

    Integer getIncrementIndex()throws Exception;
}
