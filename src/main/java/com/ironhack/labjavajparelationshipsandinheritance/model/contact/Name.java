package com.ironhack.labjavajparelationshipsandinheritance.model.contact;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Name {

    private String salutation;
    private String firstNane;
    private String middleName;
    private String lastName;

}
