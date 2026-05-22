package com.ironhack.labjavajparelationshipsandinheritance.repository;

import com.ironhack.labjavajparelationshipsandinheritance.model.nurse.Association;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociationRepository extends JpaRepository<Association, Long> {
}
