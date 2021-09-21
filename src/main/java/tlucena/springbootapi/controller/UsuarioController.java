package tlucena.springbootapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tlucena.springbootapi.model.UsuarioModel;
import tlucena.springbootapi.repository.UsuarioRepository;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar (@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(item -> ResponseEntity.ok().body(item)) //se encontro retorno os dados do usuario
                .orElse(ResponseEntity.notFound().build()); // se não: não encontrado
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario); //salva no banco de dados
    }
}
