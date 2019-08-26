package br.com.sindeaux.passwd.converter;

import br.com.sindeaux.passwd.dto.CadastroDTO;
import br.com.sindeaux.passwd.entity.DadosContato;

public class DadoContatoConverter {

    public static DadosContato convvertCadastroDTOToDadoContato(CadastroDTO cadastroDTO){
        DadosContato dadosContato = new DadosContato();
        dadosContato.setEmailPrincipal(cadastroDTO.getEmail());
        return dadosContato;
    }
}
