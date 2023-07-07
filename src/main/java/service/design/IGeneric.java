package service.design;

import java.util.List;

public interface IGeneric<T> {
    List<T> findAll();
    T findById(Long id);
    T save(T t);
}
