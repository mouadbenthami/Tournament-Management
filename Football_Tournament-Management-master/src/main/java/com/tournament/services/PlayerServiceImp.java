package com.tournament.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tournament.entities.Player;
import com.tournament.repositories.IPlayer;


@Service
public class PlayerServiceImp implements IPlayerService {
	
    @Autowired
    IPlayer playerRepo;

	@Override
	public Player savePlayer(Player player) {
		// TODO Auto-generated method stub
		return playerRepo.save(player);
	}

	@Override
	public List<Player> findAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepo.findAll();
	}

	@Override
	public void deletePlayer(Player player) {
		// TODO Auto-generated method stub
		playerRepo.delete(player);
	}

	@Override
	public List<Player> findPlayerByTeamTeamName(String team) {
		// TODO Auto-generated method stub
		return playerRepo.findPlayerByTeamTeamName(team);
	}

	@Override
	public List<Player> findPlayerByTeamTeamNameAndPost(String team, String post) {
		// TODO Auto-generated method stub
		return playerRepo.findPlayerByTeamTeamNameAndPost(team, post);
	}

	@Override
	public void deletePlayerById(Long id) {
		// TODO Auto-generated method stub
		playerRepo.deleteById(id);
		
	}


}
