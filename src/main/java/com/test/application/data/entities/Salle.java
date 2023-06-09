package com.test.application.data.entities;



import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Salle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOM",length = 25)
    private String nom;
    @OneToMany(mappedBy="salle")
    private Collection<Place> places;
    @OneToMany(mappedBy = "salle")
    private Collection<Projection> projections;
    @ManyToOne
    private Cinema cinema;
    
}
