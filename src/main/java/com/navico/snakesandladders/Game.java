package com.navico.snakesandladders;

public class Game {

	public static final int INITIAL_SQUARE = 1;
	public static final int BOARD_SIZE = 100;
	private Integer position;

	public Integer placeToken() {
		position = INITIAL_SQUARE;
		return position;
	}

	public Integer moveToken(Integer spaces) {
		position += spaces;
		return position;
	}

	public Boolean isFinished() {
		return position == BOARD_SIZE;
	}
}
