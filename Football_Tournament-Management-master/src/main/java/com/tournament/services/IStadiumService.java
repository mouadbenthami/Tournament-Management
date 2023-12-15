package com.tournament.services;

import java.util.List;


import com.tournament.entities.Stadium;

public interface IStadiumService {
	Stadium saveStadium(Stadium stadium);
	List<Stadium> findAllStadiums();
	void deleteStadium(Stadium stadium);
	void deleteStadiumById(Long id);
	Stadium findStadiumByMatchsId(Long id);

}
