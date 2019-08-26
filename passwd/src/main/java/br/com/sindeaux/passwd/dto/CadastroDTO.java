package br.com.sindeaux.passwd.dto;

public class CadastroDTO extends UsuarioDTO {


    private String confirmacaoEmail;

    private String senha;

    public String getConfirmacaoEmail() {
        return confirmacaoEmail;
    }

    public void setConfirmacaoEmail(String confirmacaoEmail) {
        this.confirmacaoEmail = confirmacaoEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
