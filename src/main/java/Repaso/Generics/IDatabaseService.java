package Repaso.Generics;

import java.util.List;

public interface IDatabaseService<T> {

    T getById(Long id);
    List<T> getAll();
}
