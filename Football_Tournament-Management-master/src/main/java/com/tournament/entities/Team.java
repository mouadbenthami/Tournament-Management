package com.tournament.entities;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="`team`")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String teamName;
	
	@Column(nullable=false)
	private String country;

	@ManyToMany
	@JoinTable(name="MatchTeams",joinColumns =@JoinColumn(name="Team_id"),
			inverseJoinColumns=@JoinColumn(name="Match_id"))
	@JsonProperty(access = Access.WRITE_ONLY) 
	private List<Match> Matchs;
	
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
	@JsonProperty(access = Access.WRITE_ONLY) 
	private List<Player> players;

}
