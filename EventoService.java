package com.eventpass.eventos.service;

import org.springframework.stereotype.Service;

@Service
public class EventoService {

    public boolean descontarAforo(Long eventoId) {
        // Lógica para verificar y descontar aforo
        return true; // true = hay cupo
    }

    public String obtenerEventos() {
        return "Lista de eventos";
    }
}
