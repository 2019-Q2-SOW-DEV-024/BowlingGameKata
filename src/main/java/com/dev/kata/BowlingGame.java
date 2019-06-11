package com.dev.kata;

public class BowlingGame {
	private int rolls[]= new int[21];
	private int currentRoll=0;
	private static final int ZERO= 0;
	private static final int NO_OF_FRAMES= 10;
	private static final int MAX_PINS_DOWN= 10;
	
	
	public void roll(int pins) {
		rolls[currentRoll++]=pins;
	}

	public int calculateScore() {
		int score = ZERO;
		int rollIndex = ZERO;
		
	    for (int frame = ZERO; frame < NO_OF_FRAMES; frame++) {
	    	if (isStrike(rollIndex))
	        {
	    		score += MAX_PINS_DOWN +rolls[rollIndex+1] +rolls[rollIndex+2];
	          	rollIndex++;
	        }else if (isSpare(rollIndex)){
	        	score += MAX_PINS_DOWN + rolls[rollIndex + 2];
	        	rollIndex += 2;
	        } else {
	        	score += rolls[rollIndex] + rolls[rollIndex + 1];
	        	rollIndex += 2;
	        }
	    }
	    return score;
	}
	
	private boolean isSpare(int rollIndex) {
	    return rolls[rollIndex] + rolls[rollIndex + 1] == MAX_PINS_DOWN;
	}

	private boolean isStrike(int rollIndex) {
	    return rolls[rollIndex] == 10;
	}

}
