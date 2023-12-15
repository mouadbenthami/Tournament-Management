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
import com.tournament.entities.Player;
import com.tournament.services.PlayerServiceImp;

@RestController
public class PlayerController {
@Autowired
private PlayerServiceImp playerServ;
	
@PostMapping("/player")
public Player addPlayer(@RequestBody Player maatch) {
	return playerServ.savePlayer(maatch);
}

@PutMapping("/player")
public Player updatePlayer( @RequestBody Player maatch) {
	 return playerServ.savePlayer(maatch);
}

@DeleteMapping("player/{id}")
public void deletePlayer(@PathVariable Long id) {
	 playerServ.deletePlayerById(id);
}

@GetMapping("/player")
public List<Player> getPlayers() {
	return playerServ.findAllPlayers();
}

}
