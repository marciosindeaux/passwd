package br.com.sindeaux.passwd.controller;

import br.com.sindeaux.passwd.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario/")
public class UsuarioRest {

    @PostMapping("cadastrar")
    public ResponseEntity<ResponseDTO> cadastrarUsuario(){
        return null;
    }

}
