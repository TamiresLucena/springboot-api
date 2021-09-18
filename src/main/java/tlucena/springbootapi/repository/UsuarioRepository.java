package tlucena.springbootapi.repository;

import org.springframework.data.repository.CrudRepository;
import tlucena.springbootapi.models.UsuarioModel;

import javax.persistence.criteria.CriteriaBuilder;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
