package com.tournament.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tournament.entities.Player;
import com.tournament.entities.Team;
import com.tournament.services.PlayerServiceImp;
import com.tournament.services.TeamServiceImp;

@RestController
public class TeamController {
@Autowired
private TeamServiceImp teamServ;
@Autowired
private PlayerServiceImp playerServ;
	 
@PostMapping("/team")
public Team addTeam(@RequestBody Team maatch) {
	return teamServ.saveTeam(maatch);
}
@PutMapping("/team")
public Team updateTeam( @RequestBody Team maatch) {
	 return teamServ.saveTeam(maatch);
}
@DeleteMapping("team/{id}")
public void deleteTeam(@PathVariable Long id) {
	 teamServ.deleteTeamById(id);
}
@GetMapping("/team")
public List<Team> getTeams() {
	return teamServ.findAllTeams();
}
@GetMapping("/team/{country}")
public List<Team> getTeams(@PathVariable String country) {
	return teamServ.findTeamByCountry(country);
}
@GetMapping("/team/{teamName}/players/{post}")
public List<Player> getplayerbyTeamsAndPost(@PathVariable String teamName, @PathVariable String post) {
	return playerServ.findPlayerByTeamTeamNameAndPost(teamName, post);
}
@GetMapping("/team/{team}/players")
public List<Player> getPlayersTeam(@PathVariable String team) {
	return playerServ.findPlayerByTeamTeamName(team);
}

}
