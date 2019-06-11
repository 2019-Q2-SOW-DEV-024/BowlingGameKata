package com.dev.kata;

public class BowlingGame {
	private int score=0;

	public void roll(int pins) {
		score+=pins;
	}

	public int getScore() {
		return score;
	}

}
