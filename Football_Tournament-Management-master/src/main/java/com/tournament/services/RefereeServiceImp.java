package com.tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tournament.entities.Referee;
import com.tournament.repositories.IReferee;


@Service
public class RefereeServiceImp implements IRefereeService{
    @Autowired
    IReferee refereeRepo;

	@Override
	public Referee saveReferee(Referee referee) {
		// TODO Auto-generated method stub
		return refereeRepo.save(referee);
	}

	@Override
	public List<Referee> findAllReferees() {
		// TODO Auto-generated method stub
		return refereeRepo.findAll();
	}

	@Override
	public void deleteReferee(Referee referee) {
		// TODO Auto-generated method stub
		refereeRepo.delete(referee);
	}

	@Override
	public void deleteRefereeById(Long id) {
		// TODO Auto-generated method stub
		refereeRepo.deleteById(id);
	}
	

}
