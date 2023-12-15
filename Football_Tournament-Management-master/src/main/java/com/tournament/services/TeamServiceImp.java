package com.tournament.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tournament.entities.Team;
import com.tournament.repositories.ITeam;

@Service
public class TeamServiceImp implements ITeamService {
@Autowired
ITeam teamRepo;

@Override
public Team saveTeam(Team team) {
	// TODO Auto-generated method stub
	return teamRepo.save(team);
}

@Override
public List<Team> findAllTeams() {
	// TODO Auto-generated method stub
	return teamRepo.findAll();
}

@Override
public void deleteTeam(Team team) {
	// TODO Auto-generated method stub
	teamRepo.delete(team);
}

@Override
public List<Team> findTeamByCountry(String country) {
	// TODO Auto-generated method stub
	return teamRepo.findTeamByCountry(country);
}

@Override
public void deleteTeamById(Long id) {
	// TODO Auto-generated method stub
	teamRepo.deleteById(id);
}
	
}
