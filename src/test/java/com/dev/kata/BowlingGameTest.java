package com.dev.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BowlingGameTest {

	@Test
	public void validateSetUp() {
		assertTrue(true);
	}
	
	@Test
	public void testGameScoreForGutterBalls() {
		BowlingGame game= new BowlingGame();

		for(int i=0;i<20;i++) {
			game.roll(0);
		}

		assertEquals(0, game.getScore());
	}
	
	@Test
	public void testGameScoreWhenTwoPinsDownPerRoll() {
		BowlingGame game= new BowlingGame();

		for(int i=0;i<20;i++) {
			game.roll(2);
		}

		assertEquals(40, game.getScore());
	}
}
