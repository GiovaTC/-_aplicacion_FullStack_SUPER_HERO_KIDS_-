package com.superhero.service;

import com.superhero.model.SuperHeroe;
import com.superhero.repository.SuperHeroeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperHeroeService {

    private final SuperHeroeRepository repository;

    public SuperHeroeService(SuperHeroeRepository repository) {
        this.repository = repository;
    }
    public List<SuperHeroe> listar() {
        return repository.findAll();
    }

    public SuperHeroe guardar(SuperHeroe heroe) {
        return repository.save(heroe);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
