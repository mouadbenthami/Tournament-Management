package com.tournament.controllers;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tournament.entities.Match;
import com.tournament.entities.Stadium;
import com.tournament.entities.Team;
import com.tournament.services.MatchServiceImp;
import com.tournament.services.StadiumServiceImp;


@RestController
public class MatchController {
@Autowired
private MatchServiceImp matchServ;
@Autowired
private StadiumServiceImp stadiumServ;
 @PostMapping("/match")
 public Match addMatch(@RequestBody Match match) {
	return matchServ.saveMatch(match);
 }
 
 @PutMapping("/match")
 public Match updateMatch( @RequestBody Match match) {
	 return matchServ.saveMatch(match);
 }
 
 @DeleteMapping("/match/{id}")
 public void deleteclient(@PathVariable Long id) {
	 matchServ.deleteMatchById(id);
 }
 
 @DeleteMapping("/match/plaied")
 public void deletePastMatchs() {
     matchServ.deleteMatchByDatebefore();
 }
 
@GetMapping("/match")
public List<Match> getMatchs() {
	return matchServ.findAllMatchs();
}

@GetMapping("/match/{Date}")
public List<Match> getMatchesByDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate Date) {
    List<Match> matchs = matchServ.findMatchByDate(Date);
    return matchs;
}

@GetMapping("/match/{id}/teams")
public List<Team> getTaemsBymatch(@PathVariable Long id) {
	 Match m=matchServ.findMatchById(id);
	 return m.getTeams();
}

@GetMapping("/match/{matchId}/stadium")
public Stadium getStadiumbyMatchId(@PathVariable Long matchId) {
	return stadiumServ.findStadiumByMatchsId(matchId);
}
}

 
