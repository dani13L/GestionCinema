package com.test.application.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.data.entities.Projection;

public interface ProjectionRepository extends JpaRepository<Projection,Long>{
    
}
