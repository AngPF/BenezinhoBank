package br.com.benezinhobank.model;

import br.com.benezinhobank.model.Banco;

public class Agencia {

    private String numero;

    private String nome;

    private Banco bannco;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco getBannco() {
        return bannco;
    }

    public void setBannco(Banco bannco) {
        this.bannco = bannco;
    }

    public Agencia() {
    }

    public Agencia(String numero, String nome, Banco bannco) {
        this.numero = numero;
        this.nome = nome;
        this.bannco = bannco;
    }
}
