package com.br.zup.transacao.cartao;

public class EventoDeCartao {

    private String id;

    private String email;

    public Cartao toModel() {
        return new Cartao(id, email);
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
