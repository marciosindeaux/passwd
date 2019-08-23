package br.com.sindeaux.passwd.dto;

import org.springframework.http.HttpStatus;

public class ResponseDTO {

    private String erros;
    private Object data;
    private String mensagem;
    private HttpStatus httpStatus;

    public ResponseDTO(Object data, String mensagem, HttpStatus httpStatus) {
        this.data = data;
        this.mensagem = mensagem;
        this.httpStatus = httpStatus;
    }

    public ResponseDTO(String mensagem, HttpStatus httpStatus) {
        this.mensagem = mensagem;
        this.httpStatus = httpStatus;
    }

    public String getErros() {
        return erros;
    }

    public void setErros(String erros) {
        this.erros = erros;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
