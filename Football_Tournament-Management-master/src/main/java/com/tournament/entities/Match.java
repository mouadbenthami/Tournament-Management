package com.tournament.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="`match`")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column(nullable=false)
	private LocalTime time;
	
	@Column(nullable=false)
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "referee_id")
	private Referee referee;
	
	@ManyToMany
	@JoinTable(name="MatchTeams",joinColumns =@JoinColumn(name="Match_id"),
	  inverseJoinColumns=@JoinColumn(name="Team_id"))
	@JsonProperty(access = Access.WRITE_ONLY) 
	private List<Team> Teams;
	@ManyToOne
	@JoinColumn(name = "stadium_id") 
	private Stadium stadium;
	
	
}
