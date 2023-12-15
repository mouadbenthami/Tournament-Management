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

import com.tournament.entities.Referee;
import com.tournament.services.RefereeServiceImp;

@RestController
public class RefereeController {
@Autowired
private RefereeServiceImp refereeServ;
	
@PostMapping("/referee")
public Referee addReferee(@RequestBody Referee maatch) {
	return refereeServ.saveReferee(maatch);
}

@PutMapping("/referee")
public Referee updateReferee( @RequestBody Referee maatch) {
	 return refereeServ.saveReferee(maatch);
}

@DeleteMapping("referee/{id}")
public void deleteReferee(@PathVariable Long id) {
	 refereeServ.deleteRefereeById(id);
}

@GetMapping("/referee")
public List<Referee> getReferees() {
	return refereeServ.findAllReferees();
}

}
