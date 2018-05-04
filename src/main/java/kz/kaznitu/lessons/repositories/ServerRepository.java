package kz.kaznitu.lessons.repositories;

import kz.kaznitu.lessons.models.Server;
import org.springframework.data.repository.CrudRepository;

public interface ServerRepository extends CrudRepository<Server, Long> {

}
