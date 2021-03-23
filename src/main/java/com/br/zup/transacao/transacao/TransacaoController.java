package com.br.zup.transacao.transacao;

import com.br.zup.transacao.cartao.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/transacoes")
public class TransacaoController {

    @Autowired
    private CartaoRepository cartaoRepository;

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping(value = "/cartao/{id}")
    public ResponseEntity<?> buscaTransacoes(@PathVariable("id") String id) {
        if(!cartaoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        List<Transacao> transacoes = transacaoRepository.findFirst10ByCartaoIdOrderByEfetivadaEmDesc(id);
        return ResponseEntity.ok().body(transacoes);
    }
}
