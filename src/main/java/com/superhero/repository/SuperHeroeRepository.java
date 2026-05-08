package com.superhero.repository;

import com.superhero.model.SuperHeroe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperHeroeRepository
extends JpaRepository<SuperHeroe, Long> {
}
