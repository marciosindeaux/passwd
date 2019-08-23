package br.com.sindeaux.passwd.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_DADO_PESSOAL")
public class DadoPessoal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CO_DADO_PESSOAL")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CO_USUARIO", nullable = false)
    private Usuario usuario;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "dadoPessoal", cascade = CascadeType.ALL)
    private DadosContato dadosContato;

    @Column(name = "DS_NOME",nullable = false)
    private String primeiroNome;

    @Column(name = "DS_SOBRENOME",nullable = false)
    private String sobrenome;

    @Column(name = "DS_NOME_COMPLETO",nullable = false)
    private String nomeCompleto;

    @Column(name = "NU_IDADE")
    private String idade;

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

    public DadosContato getDadosContato() {
        return dadosContato;
    }

    public void setDadosContato(DadosContato dadosContato) {
        this.dadosContato = dadosContato;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
