package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Foyer")

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private Long idFoyer;
    private String nomFoyer;
    private Long capacitFoyer;
    @OneToOne(mappedBy = "foyer")
    University univ;
    @OneToMany
    List<Bloc> bloc=new ArrayList<>();
}
