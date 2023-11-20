package com.example.foyer_amani_chamakh.DAO.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private Long idbloc;
    private String nombloc;
    private Long capacitBloc;
    @ManyToOne
    Foyer foyer;
    @OneToMany
    List<Chambre> chamb=new ArrayList<>();
}
