package tlucena.springbootapi.repository;

import org.springframework.data.repository.CrudRepository;
import tlucena.springbootapi.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
