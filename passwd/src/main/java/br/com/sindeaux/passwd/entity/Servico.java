package br.com.sindeaux.passwd.entity;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_SERVICO")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CO_SERVICO")
    private Long id;

    @Column(name = "DS_NOME_SERVICO",unique = true,nullable = false)
    private String nome;

    @JoinColumn(name = "CO_CATEGORIA",nullable = false,insertable = false,updatable = false)
    private Categoria categoria;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "servico")
    private List<DadoAcesso> dadosAcesso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<DadoAcesso> getDadosAcesso() {
        return dadosAcesso;
    }

    public void setDadosAcesso(List<DadoAcesso> dadosAcesso) {
        this.dadosAcesso = dadosAcesso;
    }
}
