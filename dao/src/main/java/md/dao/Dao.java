package md.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Dao<T>
{
    Optional<T> findById(UUID id);

    List<T> findAll();

    UUID save(T t);

    void delete(T t);
}
