package com.test.application.data.services;

import org.springframework.stereotype.Service;

import com.test.application.data.entities.Ville;
import com.test.application.data.repositories.VilleRepository;
@Service
public class VilleService {
  private VilleRepository villeRepository;

  public VilleService(VilleRepository villeRepository){
    this.villeRepository=villeRepository;
  }

  //save 
  public void saveSalle(String nom,double longitude,double latitude,double altitude){
    Ville salle=new Ville(null,nom,longitude,latitude,altitude,null);
    this.villeRepository.save(salle);
}
}
