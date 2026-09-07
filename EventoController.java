package com.eventpass.eventos.controller;

import com.eventpass.eventos.service.EventoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping
    public String listarEventos() {
        return eventoService.obtenerEventos();
    }

    @PutMapping("/{id}/aforo")
    public boolean descontarAforo(@PathVariable Long id) {
        return eventoService.descontarAforo(id);
    }
}
