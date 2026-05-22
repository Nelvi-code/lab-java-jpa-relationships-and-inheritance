package com.ironhack.labjavajparelationshipsandinheritance.model.event;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

@EqualsAndHashCode(callSuper = true)
@Entity
public class Conference extends Event {

    @ManyToMany
    private List<Speaker>speakers;
}
