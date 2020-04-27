package com.nnadozie.paw.repositories;

import com.nnadozie.paw.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
    
}