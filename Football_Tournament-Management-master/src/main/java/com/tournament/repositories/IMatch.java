package com.tournament.repositories;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tournament.entities.Match;

public interface IMatch extends JpaRepository<Match, Long> {
	public  List<Match> findMatchByDate(LocalDate Date);
	public  List<Match> findMatchByDateBefore(LocalDate Date);
}
