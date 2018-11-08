package com.navico.snakesandladders;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameShould {

	Game game = new Game();

	@Test
	public void placeTokenOnSquareOneWhenGameStarted() {
		assertThat(game.placeToken(), is(1));
	}

	@Test
	public void moveToken() {
		game.placeToken();
		assertThat(game.moveToken(3), is(4));
	}

	@Test
	public void moveTokenMoreThanOnce() {
		game.placeToken();
		game.moveToken(3);
		assertThat(game.moveToken(4), is(8));
	}

	@Test
	public void winTheGame() {
		game.placeToken();
		game.moveToken(96);
		game.moveToken(3);
		assertThat(game.isFinished(), is(true));
	}

	@Test
	public void continuePlayingTheGame() {
		game.placeToken();
		game.moveToken(96);
		game.moveToken(4);
		assertThat(game.isFinished(), is(false));
	}
	
	@Test
	public void notMoveWhenSpacesNumberIsGreaterThanRemainingSquares() {
		game.placeToken();
		game.moveToken(96);
		assertThat(game.moveToken(4), is(97));
	}

	@Test
	public void moveTokenAfterRollDice() {
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(4);
		Game gameWithDice = new Game(dice);

		gameWithDice.placeToken();

		assertThat(gameWithDice.moveToken(), is(5));
	}
}
