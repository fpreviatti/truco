package com.truco.controller;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.truco.model.Carta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController

public class JogoController {


    @GetMapping(value = "/novo-jogo")
    public ResponseEntity<Multimap<String,String>> getNumeros(){

        //aqui sera hash
        Carta carta = new Carta();

        //Cartas jogador
        Multimap<String, String> cartas = LinkedHashMultimap.create();

        //Cartas jogador
        Multimap<String, String> cartasComputador = LinkedHashMultimap.create();

        cartas = carta.getCartas();

        return ResponseEntity.status(HttpStatus.OK).body(cartas);
    }
}
