package com.tournament.services;

import java.util.List;
import com.tournament.entities.Team;

public interface ITeamService {
	Team saveTeam(Team team);
	List<Team> findAllTeams();
	void deleteTeam(Team team);
	void deleteTeamById(Long id);
    List<Team> findTeamByCountry(String country);
}
