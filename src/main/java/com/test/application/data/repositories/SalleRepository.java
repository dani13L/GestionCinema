package com.test.application.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.data.entities.Salle;

public interface SalleRepository extends JpaRepository<Salle,Long> {
    
}
