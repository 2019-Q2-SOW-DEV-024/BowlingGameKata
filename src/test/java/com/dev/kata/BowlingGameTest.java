package com.dev.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class BowlingGameTest {

	private BowlingGame game;

	@Test
	public void validateSetUp() {
		assertTrue(true);
	}
	
	@Before
	public void setUp() {
		 game = new BowlingGame();
	}
	
	@Test
	public void testGameScoreForGutterBalls() {
		rollPins(20,0);

		assertEquals(0, game.getScore());
	}
	
	@Test
	public void testGameScoreWhenTwoPinsDownPerRoll() {
		rollPins(20,2);

		assertEquals(40, game.getScore());
	}
	
	private void rollPins(int roll,int pins) {
		
		for(int index=0;index<roll;index++) {
			game.roll(pins);
		}
	}
}
