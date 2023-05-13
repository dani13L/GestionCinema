package com.test.application.data.services;

import org.springframework.stereotype.Service;
import com.test.application.data.repositories.SalleRepository;
import com.test.application.data.entities.Salle;

@Service
public class SalleService {
    private SalleRepository salleRepository;
    public SalleService(SalleRepository salleRepository){
        this.salleRepository=salleRepository;
    }
    //save 
    public void saveSalle(String nom){
        Salle salle=new Salle(null,nom, null, null, null);
        this.salleRepository.save(salle);
    }
}
