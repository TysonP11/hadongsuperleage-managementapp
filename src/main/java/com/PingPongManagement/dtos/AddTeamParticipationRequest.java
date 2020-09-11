package com.PingPongManagement.dtos;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.PingPongManagement.models.League;
import com.PingPongManagement.models.Team;

public class AddTeamParticipationRequest {

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

	@NotNull
	private Integer teamId;
	
	@NotNull
	private Integer leagueId;

	public AddTeamParticipationRequest(
			@NotNull(message = "Must register series!") @NotBlank(message = "Must register series!") String series,
			@NotNull @NotBlank String group, @NotNull int ranking, @NotNull Double points, @NotNull int teamId,
			@NotNull int leagueId) {
		
		this.series = series;
		this.group = group;
		this.ranking = ranking;
		this.points = points;
		this.teamId = teamId;
		this.leagueId = leagueId;
	}

	public AddTeamParticipationRequest() {
		
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

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}
	
	
	
}
