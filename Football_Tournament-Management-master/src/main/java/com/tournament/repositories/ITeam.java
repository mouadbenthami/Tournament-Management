package com.tournament.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tournament.entities.Team;


public interface ITeam extends JpaRepository<Team, Long>{
	public List<Team> findTeamByCountry(String country);
	
	
}
