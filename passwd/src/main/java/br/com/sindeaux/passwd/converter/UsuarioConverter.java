package br.com.sindeaux.passwd.converter;

import br.com.sindeaux.passwd.dto.CadastroDTO;
import br.com.sindeaux.passwd.entity.Usuario;

import java.util.ArrayList;

public class UsuarioConverter {

    public static Usuario convertCadastroDTOToUsuario(CadastroDTO cadastroDTO){
        Usuario payload = new Usuario();
        payload.setLogin(cadastroDTO.getEmail());
        payload.setSenha(cadastroDTO.getSenha());
        payload.setCategorias(new ArrayList<>());
        return payload;
    }
}
