package com.ironhack.labjavajparelationshipsandinheritance.model.nurse;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String district;

    @OneToMany
    private List<Member> members;

    @ManyToOne
    private Association association;

    @OneToOne
    private Member president;


}
