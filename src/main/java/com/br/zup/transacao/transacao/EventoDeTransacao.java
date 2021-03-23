package com.br.zup.transacao.transacao;

import com.br.zup.transacao.Estabelecimento.Estabelecimento;
import com.br.zup.transacao.Estabelecimento.EventoDeEstabelecimento;
import com.br.zup.transacao.cartao.Cartao;
import com.br.zup.transacao.cartao.EventoDeCartao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDeTransacao {

    private String id;

    private BigDecimal valor;

    private EventoDeEstabelecimento estabelecimento;

    private EventoDeCartao cartao;

    private LocalDateTime efetivadaEm;

    public Transacao toModel() {
        return new Transacao(id, valor, estabelecimento.toModel(), cartao.toModel(), efetivadaEm);
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EventoDeEstabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public EventoDeCartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
