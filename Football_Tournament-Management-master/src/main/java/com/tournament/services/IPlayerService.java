package com.tournament.services;

import java.util.List;
import com.tournament.entities.Player;

public interface IPlayerService {
	Player savePlayer(Player player);
	List<Player> findAllPlayers();
	void deletePlayer(Player player);
	void deletePlayerById(Long id);
	List<Player> findPlayerByTeamTeamName(String team);
    List<Player> findPlayerByTeamTeamNameAndPost(String team, String post);
}
