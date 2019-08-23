package br.com.sindeaux.passwd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_CATEGORIA")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CO_CATEGORIA")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CO_USUARIO", nullable = false, insertable = false, updatable = false)
    private Usuario usuario;

    @Column(name = "DS_NOME_CATEGORIA",nullable = false, unique = true)
    private String nomeCategoria;

    @Column(name = "DS_CATEGORIA")
    private String descricaoCategoria;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
    private List<Servico> servicos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
}
