package com.test.application.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.data.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Long>{
    
}
