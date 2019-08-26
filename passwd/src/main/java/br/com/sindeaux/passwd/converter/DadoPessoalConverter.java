package br.com.sindeaux.passwd.converter;

import br.com.sindeaux.passwd.dto.CadastroDTO;
import br.com.sindeaux.passwd.entity.DadoPessoal;

public class DadoPessoalConverter {

    public static DadoPessoal convertCadastroDTOToDadoPessoal(CadastroDTO cadastroDTO){
        DadoPessoal dadoPessoal = new DadoPessoal();
        dadoPessoal.setNomeCompleto(cadastroDTO.getNome() +" "+ cadastroDTO.getSobrenome());
        dadoPessoal.setPrimeiroNome(cadastroDTO.getNome());
        dadoPessoal.setSobrenome(cadastroDTO.getSobrenome());
        return dadoPessoal;
    }
}
