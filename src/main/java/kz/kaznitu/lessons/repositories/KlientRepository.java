package kz.kaznitu.lessons.repositories;

import kz.kaznitu.lessons.models.Klient;
import org.springframework.data.repository.CrudRepository;

public interface KlientRepository extends CrudRepository<Klient,Long> {
}
