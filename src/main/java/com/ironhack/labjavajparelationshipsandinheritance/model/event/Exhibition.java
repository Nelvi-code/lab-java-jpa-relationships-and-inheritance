package com.ironhack.labjavajparelationshipsandinheritance.model.event;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data

@EqualsAndHashCode(callSuper = true)
@Entity
public class Exhibition  extends Event {
}
