package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private Long idChambre;
    private String numChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typec;
    @ManyToOne
    Bloc bloc;
    @OneToMany
    List<Reservation> res=new ArrayList<>();
}