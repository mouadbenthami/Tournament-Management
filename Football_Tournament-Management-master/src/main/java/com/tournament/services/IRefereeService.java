package com.tournament.services;

import java.util.List;
import com.tournament.entities.Referee;

public interface IRefereeService {
	Referee saveReferee(Referee referee);
	List<Referee> findAllReferees();
	void deleteRefereeById(Long id);
	void deleteReferee(Referee referee);
}
