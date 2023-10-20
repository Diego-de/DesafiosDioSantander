package Designpatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Designpatterns.model.Endereco;
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}