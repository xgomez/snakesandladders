package com.navico.snakesandladders;

public class Game {

	public static final int INITIAL_SQUARE = 1;
	public static final int BOARD_SIZE = 100;
	private Integer position;

	public Game() {}

	public Game(Dice dice) {
		throw new UnsupportedOperationException();
	}

	public Integer placeToken() {
		position = INITIAL_SQUARE;
		return position;
	}

	public Integer moveToken(Integer spaces) {
		if (isThereRoomToMove(spaces)) {
			this.position += spaces;
		}
		return position;
	}

	public Boolean isFinished() {
		return position == BOARD_SIZE;
	}

	private Boolean isThereRoomToMove(Integer spaces) {
		return (this.position + spaces) <= BOARD_SIZE;
	}

	public Integer moveToken() {
		throw new UnsupportedOperationException();
	}
}
