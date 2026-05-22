package com.ironhack.labjavajparelationshipsandinheritance.repository;

import com.ironhack.labjavajparelationshipsandinheritance.model.event.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
