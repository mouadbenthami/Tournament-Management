package com.tournament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tournament.entities.Referee;


public interface IReferee extends JpaRepository<Referee, Long> {
}
