package com.PingPongManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Entity
public class TeamParticipation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer teamParticipationId;
	
	@NotNull(message = "Must register series!")
	@NotBlank(message = "Must register series!")
	private String series;
	
	@NotNull
	@NotBlank
	@Column(name = "`group`")
	private String group;
	
	@NotNull
	private int ranking;
	
	@NotNull
	private Double points;

	@ManyToOne
	@JoinColumn(name = "teamId", referencedColumnName = "teamId")
	private Team team;
	
	@ManyToOne
	@JoinColumn(name = "leagueId", referencedColumnName = "leagueId")
	private League league;

	public TeamParticipation(Integer teamParticipationId,
			@NotNull(message = "Must register series!") @NotBlank(message = "Must register series!") String series,
			@NotNull @NotBlank String group, @NotNull int ranking, @NotNull Double points, Team team, League league) {
		super();
		this.teamParticipationId = teamParticipationId;
		this.series = series;
		this.group = group;
		this.ranking = ranking;
		this.points = points;
		this.team = team;
		this.league = league;
	}

	public TeamParticipation() {
		super();
	}

	public Integer getTeamParticipationId() {
		return teamParticipationId;
	}

	public void setTeamParticipationId(Integer teamParticipationId) {
		this.teamParticipationId = teamParticipationId;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public Double getPoints() {
		return points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}
	
}
