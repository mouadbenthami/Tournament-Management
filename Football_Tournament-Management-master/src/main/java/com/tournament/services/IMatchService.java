package com.tournament.services;

import java.time.LocalDate;
import java.util.List;

import com.tournament.entities.Match;


public interface IMatchService   {
Match saveMatch(Match match);
List<Match> findAllMatchs();
Match findMatchById(Long id);
void deleteMatch(Match match);
void deleteMatchById(Long id);
void deleteMatchByDatebefore();
List<Match> findMatchByDate(LocalDate Date);


}
