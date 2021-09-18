package tlucena.springbootapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping(path = "/api/status")
    public String check(){
        return "Servidor online na porta 8080 (padrão Tomcat)!";
    }

}
