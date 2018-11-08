package com.navico.snakesandladders;

public class Game {

	public static final int INITIAL_SQUARE = 1;
	public static final int BOARD_SIZE = 100;
	private Integer position;
	private Dice dice;

	private Game() {}

	public Game(Dice dice) {
		this.dice = dice;
		position = INITIAL_SQUARE;
	}
	
	public Boolean isFinished() {
		return position == BOARD_SIZE;
	}

	public Integer moveToken() {
		return moveToken(dice.roll());
	}

	private Integer moveToken(Integer spaces) {
		if (isThereRoomToMove(spaces)) {
			this.position += spaces;
		}
		return position;
	}

	private Boolean isThereRoomToMove(Integer spaces) {
		return (this.position + spaces) <= BOARD_SIZE;
	}
}
