package br.com.sindeaux.passwd.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_DADO_ACESSO")
public class DadoAcesso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CO_DADO_ACESSO",nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CO_SERVICO",nullable = false,insertable = false,updatable = false)
    private Servico servico;

    @Column(name = "DS_LOGIN_CONTA",nullable = false)
    private String login;

    @Column(name = "DS_PASSWORD_CONTA",nullable = false)
    private String senha;

    @Column(name = "CO_PRIORIDADE")
    private Integer prioridade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }
}
