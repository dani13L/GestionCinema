package com.test.application.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.data.entities.Place;

public interface PlaceRepository extends JpaRepository<Place,Long>{
    
}
