package com.ironhack.labjavajparelationshipsandinheritance.repository;

import com.ironhack.labjavajparelationshipsandinheritance.model.nurse.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
