package com.superhero.controller;

import com.superhero.model.SuperHeroe;
import com.superhero.service.SuperHeroeService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heroes")
@CrossOrigin("*")
public class SuperHeroeController {

    private final SuperHeroeService service;

    public SuperHeroeController(SuperHeroeService service) {
        this.service = service;
    }

    @GetMapping
    public List<SuperHeroe> listar() {
        return service.listar();
    }

    @PostMapping
    public SuperHeroe guardar(@RequestBody SuperHeroe heroe) {
        return service.guardar(heroe);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}   
