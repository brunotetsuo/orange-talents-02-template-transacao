package com.br.zup.transacao.cartao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cartao {

    @Id
    private String id;

    private String email;

    @Deprecated
    public Cartao(){}

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
