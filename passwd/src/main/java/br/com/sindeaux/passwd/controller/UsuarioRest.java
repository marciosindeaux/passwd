package br.com.sindeaux.passwd.controller;

import br.com.sindeaux.passwd.converter.DadoContatoConverter;
import br.com.sindeaux.passwd.converter.DadoPessoalConverter;
import br.com.sindeaux.passwd.converter.UsuarioConverter;
import br.com.sindeaux.passwd.dto.CadastroDTO;
import br.com.sindeaux.passwd.dto.ResponseDTO;
import br.com.sindeaux.passwd.entity.DadoPessoal;
import br.com.sindeaux.passwd.entity.DadosContato;
import br.com.sindeaux.passwd.entity.Usuario;
import br.com.sindeaux.passwd.repository.DadoPessoalRepository;
import br.com.sindeaux.passwd.repository.DadosContatoRepository;
import br.com.sindeaux.passwd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
@Transactional(rollbackOn = Exception.class)
public class UsuarioRest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private DadoPessoalRepository dadoPessoalRepository;

    @Autowired
    private DadosContatoRepository dadosContatoRepository;

    @PostMapping("/cadastrar")
    public ResponseEntity<ResponseDTO> cadastrarUsuario(@RequestBody CadastroDTO dadosCadastrais){
        ResponseDTO responseDTO ;

        if(!dadosCadastrais.getEmail().equals(dadosCadastrais.getConfirmacaoEmail())){
            responseDTO = new ResponseDTO("Emails não coincidem.", HttpStatus.PRECONDITION_REQUIRED);
            return new ResponseEntity<ResponseDTO>(responseDTO,responseDTO.getHttpStatus());
        }

        try{

            Usuario usuario = UsuarioConverter.convertCadastroDTOToUsuario(dadosCadastrais);
            usuario = usuarioRepository.saveAndFlush(usuario);

            DadoPessoal dadoPessoal = DadoPessoalConverter.convertCadastroDTOToDadoPessoal(dadosCadastrais);
            dadoPessoal.setUsuario(usuario);
            dadoPessoal = dadoPessoalRepository.saveAndFlush(dadoPessoal);

            DadosContato dadosContato = DadoContatoConverter.convvertCadastroDTOToDadoContato(dadosCadastrais);
            dadosContato.setDadoPessoal(dadoPessoal);
            dadosContatoRepository.saveAndFlush(dadosContato);

            responseDTO = new ResponseDTO("Cadastro Realizado com suucesso", HttpStatus.OK);
        }catch (Exception e ){

            responseDTO = new ResponseDTO("Não foi possivel completar o cadastro",HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<ResponseDTO>(responseDTO,responseDTO.getHttpStatus());
    }

}
