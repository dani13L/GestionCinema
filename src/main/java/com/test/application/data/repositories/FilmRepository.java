package com.test.application.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.data.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {
    
}
