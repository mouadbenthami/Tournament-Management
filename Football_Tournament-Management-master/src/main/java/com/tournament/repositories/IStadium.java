package com.tournament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tournament.entities.Stadium;


public interface IStadium extends JpaRepository<Stadium, Long> {
	public Stadium findStadiumByMatchsId(Long id);
}
