package Designpatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Designpatterns.model.Cliente;
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}