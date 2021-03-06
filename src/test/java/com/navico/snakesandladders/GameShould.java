package com.navico.snakesandladders;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameShould {

	private Dice dice = mock(Dice.class);
	private Game game = new Game(dice);

	@Test
	public void moveToken() {
		when(dice.roll()).thenReturn(3);
		assertThat(game.moveToken(), is(4));
	}

	@Test
	public void moveTokenMoreThanOnce() {
		when(dice.roll()).thenReturn(3).thenReturn(4);
		game.moveToken();
		assertThat(game.moveToken(), is(8));
	}

	@Test
	public void winTheGame() {
		when(dice.roll()).thenReturn(96).thenReturn(3);
		game.moveToken();
		game.moveToken();
		assertThat(game.isFinished(), is(true));
	}

	@Test
	public void continuePlayingTheGame() {
		when(dice.roll()).thenReturn(96).thenReturn(4);
		game.moveToken();
		game.moveToken();
		assertThat(game.isFinished(), is(false));
	}

	@Test
	public void notMoveWhenSpacesNumberIsGreaterThanRemainingSquares() {
		when(dice.roll()).thenReturn(96).thenReturn(4);
		game.moveToken();
		assertThat(game.moveToken(), is(97));
	}
}
