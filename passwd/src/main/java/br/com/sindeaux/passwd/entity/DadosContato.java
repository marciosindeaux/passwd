package br.com.sindeaux.passwd.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_DADOS_CONTATO")
public class DadosContato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DS_EMAIL_PRINCIPAL",unique = true,nullable = false)
    private String emailPrincipal;

    @Column(name = "DS_EMAIL_ALTERNATIVO")
    private String emailAlternativo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CO_DADO_PESSOAL", nullable = false)
    private DadoPessoal dadoPessoal;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailPrincipal() {
        return emailPrincipal;
    }

    public void setEmailPrincipal(String emailPrincipal) {
        this.emailPrincipal = emailPrincipal;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }

    public DadoPessoal getDadoPessoal() {
        return dadoPessoal;
    }

    public void setDadoPessoal(DadoPessoal dadoPessoal) {
        this.dadoPessoal = dadoPessoal;
    }
}
