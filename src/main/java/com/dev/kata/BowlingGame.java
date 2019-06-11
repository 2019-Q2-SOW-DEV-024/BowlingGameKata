package com.dev.kata;

public class BowlingGame {
	private int rolls[]= new int[20];
	private int currentRoll=0;

	public void roll(int pins) {
		rolls[currentRoll++]=pins;
	}

	public int calculateScore() {
		int score = 0;
		int rollIndex = 0;
	    for (int frame = 0; frame < 10; frame++) {
	      if (rolls[rollIndex] + rolls[rollIndex + 1] == 10)
	      {
	        score += 10 + rolls[rollIndex + 2];
	      } else {
	        score += rolls[rollIndex] + rolls[rollIndex + 1];

	      }
	      rollIndex += 2;
	    }
	    return score;
	}

}
