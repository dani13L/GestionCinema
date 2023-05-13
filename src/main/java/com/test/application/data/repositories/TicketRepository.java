package com.test.application.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.application.data.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Long>{
    
}
