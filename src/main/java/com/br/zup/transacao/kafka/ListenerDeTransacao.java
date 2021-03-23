package com.br.zup.transacao.kafka;

import com.br.zup.transacao.transacao.EventoDeTransacao;
import com.br.zup.transacao.transacao.Transacao;
import com.br.zup.transacao.transacao.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoDeTransacao eventoDeTransacao) {

        System.out.println("------------------------");
        System.out.println("Transação recebida, ID = " + eventoDeTransacao.getId());
        Transacao transacao = eventoDeTransacao.toModel();
        System.out.println(transacao.toString());
        transacaoRepository.save(transacao);
        System.out.println("Transação salva");
        System.out.println("------------------------");
        System.out.println();
    }
}
