package com.navico.snakesandladders;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameShould {

	Game game = new Game();

	@Test
	public void placeTokenOnSquareOneWhenGameStarted() {
		assertThat(game.placeToken(), is(1));
	}

	@Test
	public void moveTokenToSquareFourWhenMovedThreeSpacesGivenTokenAtSquareOne() {
		game.placeToken();
		assertThat(game.moveToken(3), is(4));
	}

	@Test
	public void moveToSquareEightWhenMovedThreeAndFourSpacesGivenTokenAtSquareOne() {
		game.placeToken();
		game.moveToken(3);
		assertThat(game.moveToken(4), is(8));
	}
}
