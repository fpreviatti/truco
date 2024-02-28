package com.truco.model;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Carta {

    public Multimap<String,String> getCartas(){

        Multimap<String, String> cartas = LinkedHashMultimap.create();

        for (int i=0; i<3;i++){

            int randomInt;
            randomInt = ThreadLocalRandom.current().nextInt(1, 13);

            Integer valor = Integer.valueOf(randomInt);

            String valorString = valor.toString();

            if(valor == 8 || valor == 9 || valor == 10){
                i = i-1;
            }

            else{

                cartas.put(valorString, gerarNaipe());

            }

        }

        return cartas;
    }


    private String gerarNaipe(){

        int randomInt;
        randomInt = ThreadLocalRandom.current().nextInt(1, 4);

        Integer naipe = Integer.valueOf(randomInt);

        return naipe.toString();

    }
}
