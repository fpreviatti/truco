package com.truco.enums;

public enum Naipe {
    Ouros(1),
    Espadas(2),
    Copas(3),
    Paus(4);

    private int naipe;

    Naipe(int naipe) {
        this.naipe = naipe;
    }

    public int getNaipe() {
        return naipe;
    }
}