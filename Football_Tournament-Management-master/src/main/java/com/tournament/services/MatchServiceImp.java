package com.tournament.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tournament.entities.Match;
import com.tournament.repositories.IMatch;


@Service
public class MatchServiceImp implements IMatchService{
    
    @Autowired
    IMatch matchRepo;

	@Override
	public Match saveMatch(Match match) {
		return matchRepo.save(match);
	}


	@Override
	public void deleteMatch(Match match) {
		// TODO Auto-generated method stub
		matchRepo.delete(match);
		
	}

	@Override
	public void deleteMatchById(Long id) {
		matchRepo.deleteById(id);
		
	}
	
	@Override
	public void deleteMatchByDatebefore() {
		  LocalDate today = LocalDate.now();
		  List<Match> pastMatches = matchRepo.findMatchByDateBefore(today);
		  for (Match match : pastMatches) 
		     matchRepo.delete(match);
		
	}
	@Override
	public List<Match> findAllMatchs() {
		// TODO Auto-generated method stub
		return matchRepo.findAll();
	}
	
	@Override
	public List<Match> findMatchByDate(LocalDate Date) {

		return matchRepo.findMatchByDate(Date);
	}


	@Override
	public Match findMatchById(Long id) {
		// TODO Auto-generated method stub
		return (Match) matchRepo.findById(id).get();
	}
	
}
