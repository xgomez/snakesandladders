package com.navico.snakesandladders;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameShould {

	@Test
	public void placeTokenOnSquareOneWhenGameStarted() {
		Game game = new Game();
		assertThat(game.placeToken(), is(1));
	}

	@Test
	public void moveTokenToSquareFourWhenMovedThreeSpacesGivenTokenAtSquareOne() {
		Game game = new Game();
		game.placeToken();
		assertThat(game.moveToken(3), is(4));
	}
}
