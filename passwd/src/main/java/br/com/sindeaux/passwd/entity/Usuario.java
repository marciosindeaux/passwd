package br.com.sindeaux.passwd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CO_USUARIO")
    private Long id;

    @Column(name = "DS_LOGIN",unique = true,nullable = false)
    private String login;

    @Column(name = "DS_SENHA",nullable = false)
    private String senha;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.ALL)
    private DadoPessoal dadoPessoal;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    private List<Categoria> categorias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public DadoPessoal getDadoPessoal() {
        return dadoPessoal;
    }

    public void setDadoPessoal(DadoPessoal dadoPessoal) {
        this.dadoPessoal = dadoPessoal;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
