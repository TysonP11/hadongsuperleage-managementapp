package com.PingPongManagement.models;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Date;

@Entity
public class Player {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;

    @Column(unique = true)
    @NotNull(message = "Player Code is required!")
    private String playerCode;

    @NotNull(message = "First Name is required!")
    private String firstName;

    @NotNull(message = "Last Name is required!")
    private String lastName;

    private String nickName;

    @NotNull(message = "Date Of Birth is required!")
    private Date dateOfBirth;

    @NotNull(message = "Ranking is required!")
    private String ranking;

    private Double updatedPoint;

    private Double accumulatedPoint;

    private String image;

	public Player(Integer playerId, @NotNull(message = "Player Code is required!") String playerCode,
			@NotNull(message = "First Name is required!") String firstName,
			@NotNull(message = "Last Name is required!") String lastName, String nickName,
			@NotNull(message = "Date Of Birth is required!") Date dateOfBirth,
			@NotNull(message = "Ranking is required!") String ranking, Double updatedPoint, Double accumulatedPoint,
			String image) {
		super();
		this.playerId = playerId;
		this.playerCode = playerCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.dateOfBirth = dateOfBirth;
		this.ranking = ranking;
		this.updatedPoint = updatedPoint;
		this.accumulatedPoint = accumulatedPoint;
		this.image = image;
	}

	public Player() {
		super();
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getPlayerCode() {
		return playerCode;
	}

	public void setPlayerCode(String playerCode) {
		this.playerCode = playerCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public Double getUpdatedPoint() {
		return updatedPoint;
	}

	public void setUpdatedPoint(Double updatedPoint) {
		this.updatedPoint = updatedPoint;
	}

	public Double getAccumulatedPoint() {
		return accumulatedPoint;
	}

	public void setAccumulatedPoint(Double accumulatedPoint) {
		this.accumulatedPoint = accumulatedPoint;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
    
}
