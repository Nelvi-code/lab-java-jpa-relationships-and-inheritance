package com.ironhack.labjavajparelationshipsandinheritance.repository;

import com.ironhack.labjavajparelationshipsandinheritance.model.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository <Contact, Long> {
}
