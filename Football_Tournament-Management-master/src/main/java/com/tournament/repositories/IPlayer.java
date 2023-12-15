package com.tournament.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tournament.entities.Player;


public interface IPlayer extends JpaRepository<Player, Long>{
	public List<Player> findPlayerByTeamTeamName(String team);
	public List<Player> findPlayerByTeamTeamNameAndPost(String team, String post);
}
