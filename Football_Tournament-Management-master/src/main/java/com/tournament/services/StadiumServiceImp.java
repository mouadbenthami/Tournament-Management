package com.tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tournament.entities.Stadium;
import com.tournament.repositories.IStadium;
@Service

public class StadiumServiceImp implements IStadiumService{
    @Autowired
    IStadium stadiumRepo;

	@Override
	public Stadium saveStadium(Stadium stadium) {
		// TODO Auto-generated method stub
		return stadiumRepo.save(stadium);
	}

	@Override
	public List<Stadium> findAllStadiums() {
		// TODO Auto-generated method stub
		return stadiumRepo.findAll();
	}

	@Override
	public void deleteStadium(Stadium stadium) {
		// TODO Auto-generated method stub
		stadiumRepo.delete(stadium);
	}

	@Override
	public Stadium findStadiumByMatchsId(Long id) {
		// TODO Auto-generated method stub
		return stadiumRepo.findStadiumByMatchsId(id);
	}

	@Override
	public void deleteStadiumById(Long id) {
		// TODO Auto-generated method stub
		stadiumRepo.deleteById(id);
	}
	
}
