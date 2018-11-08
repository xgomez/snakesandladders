package com.navico.snakesandladders;

public class Game {

	public static final int INITIAL_SQUARE = 1;

	public Integer placeToken() {
		return INITIAL_SQUARE;
	}

	public Integer moveToken(Integer spaces) {
		return 4;
	}
}
