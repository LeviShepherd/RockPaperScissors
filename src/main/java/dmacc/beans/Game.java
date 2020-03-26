package dmacc.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {

	private String player1;
	private String computerPlayer;
	private String winner;
	
	/**
	 * @param player1
	 */
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	/**
	 * Determines the winner, either player1 or computerPlayer
	 */
	private void determineWinner() {
		switch(player1) {
		case "rock":
			if(this.computerPlayer == "scissors") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "lizard") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "paper") {
				this.setWinner("Computer");
				break;
			}
			else if(this.computerPlayer == "spock") {
				this.setWinner("Computer");
				break;
			}
			else {
				this.setWinner("Tie");
				break;
			}
		case "paper":
			if(this.computerPlayer == "rock") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "spock") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "scissors") {
				this.setWinner("Computer");
				break;
			}
			else if(this.computerPlayer == "lizard") {
				this.setWinner("Computer");
				break;
			}
			else {
				this.setWinner("Tie");
				break;
			}
		case "scissors":
			if(this.computerPlayer == "paper") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "lizard") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "rock") {
				this.setWinner("Computer");
				break;
			}
			else if(this.computerPlayer == "spock") {
				this.setWinner("Computer");
				break;
			}
			else {
				this.setWinner("Tie");
				break;
			}
		case "lizard":
			if(this.computerPlayer == "paper") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "spock") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "rock") {
				this.setWinner("Computer");
				break;
			}
			else if(this.computerPlayer == "scissors") {
				this.setWinner("Computer");
				break;
			}
			else {
				this.setWinner("Tie");
				break;
			}
		case "spock":
			if(this.computerPlayer == "rock") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "scissors") {
				this.setWinner("Player1");
				break;
			}
			else if(this.computerPlayer == "lizard") {
				this.setWinner("Computer");
				break;
			}
			else if(this.computerPlayer == "paper") {
				this.setWinner("Computer");
				break;
			}
			else {
				this.setWinner("Tie");
				break;
			}
		}
	}

	/**
	 * Sets computer to either rock, paper or scissors
	 */
	private void setComputerPlayerToRandom() {
		String[] options= {"rock", "paper", "scissors", "lizard", "spock"};
		Random r = new Random();
		int randNum = r.nextInt(options.length);
		setComputerPlayer(options[randNum].toString());
	}

	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getComputerPlayer() {
		return computerPlayer;
	}
	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	
}
