package com.br.zup.transacao.transacao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, String> {

    List<Transacao> findFirst10ByCartaoIdOrderByEfetivadaEmDesc(String id);

}
