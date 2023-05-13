package com.test.application.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.data.entities.Seance;

public interface SeanceRepository extends JpaRepository<Seance,Long>{
    
}
