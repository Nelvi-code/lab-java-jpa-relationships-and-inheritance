package com.ironhack.labjavajparelationshipsandinheritance.repository;

import com.ironhack.labjavajparelationshipsandinheritance.model.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
