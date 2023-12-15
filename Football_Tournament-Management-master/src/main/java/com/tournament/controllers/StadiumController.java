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
import com.tournament.entities.Stadium;
import com.tournament.services.StadiumServiceImp;

@RestController
public class StadiumController {
@Autowired
private StadiumServiceImp stadiumServ;
	
@PostMapping("/stadium")
public Stadium addStadium(@RequestBody Stadium stadium) {
	return stadiumServ.saveStadium(stadium);
}

@PutMapping("/stadium")
public Stadium updateStadium( @RequestBody Stadium stadium) {
	 return stadiumServ.saveStadium(stadium);
}

@DeleteMapping("/stadium/{id}")
public void deleteStadium(@PathVariable Long id) {
	 stadiumServ.deleteStadiumById(id);
}
@GetMapping("/stadium")
public List<Stadium> getStadiums() {
	return stadiumServ.findAllStadiums();
}

}
