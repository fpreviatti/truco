package com.truco.enums;

public enum Valor {
    As(1),
    Dois(2),
    Tres(3),
    Quatro(4),
    Cinco(5),
    Seis(6),
    Sete(7),
    Dama(11),
    Valete(12),

    Rei(13);

    private int valor;

    Valor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}