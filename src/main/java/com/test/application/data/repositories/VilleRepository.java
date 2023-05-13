package com.test.application.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.data.entities.Ville;

public interface VilleRepository extends JpaRepository<Ville,Long>{
    
}
