# Bowling Game
This program is created for Kata using Test Driven Development(TDD).
This description is based on that at Adventures in C#: The Bowling Game.

## Problem Description
Create a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game. Here are some things that the program will not do:

* We will not check for valid rolls.
* We will not check for correct number of rolls and frames.
* We will not provide scores for intermediate frames.

We can briefly summarize the scoring for this form of bowling:

* Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
* In each frame, the bowler gets up to two tries to knock down all the pins.
* If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
* If in two tries he knocks them all down, this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
* If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
* If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
* The game score is the total of all frame scores.

What makes this game interesting to score is the lookahead in the scoring for strike and spare. At the time we throw a strike or spare, we cannot calculate the frame score: we have to wait one or two frames to find out what the bonus is.

## Test Cases
When scoring “X” indicates a strike, “/” indicates a spare, “-” indicates a miss

* X X X X X X X X X X X X (12 rolls: 12 strikes) = 10 frames * 30 points = 300
* 9- 9- 9- 9- 9- 9- 9- 9- 9- 9- (20 rolls: 10 pairs of 9 and miss) = 10 frames * 9 points = 90
* 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames * 15 points = 150

## Assumptions
Below are some of the assumptions used for developing the program
* We will not check for valid rolls.
* We will not check for correct number of rolls and frames.
* We will not provide scores for intermediate frames.
* Each roll /throw gets a score .
* We will not inform user on roll and frame count.
* We will not give score if the 20 rolls are not completed(game is left without playing)
* In Tenth frame , spare will fetch only one bonus ball/roll.Strike will fetch two bonus balls/rolls .
* Bonus of Tenth frame will be used only to calculate score of tenth frame .Bonus rolls are not counted individually.

## Input
10 for Strike
0 for miss

### Sample Input

|          | Roll 1 | Roll2 |
|----------|--------|-------|
| Frame 1  | 4      | 5     |
| Frame 2  | 3      | 6     |
| Frame 3  | 2      | 2     |
| Frame 4  | 5      | 3     |
| Frame 5  | 10     | 0     |
| Frame 6  | 6      | 1     |
| Frame 7  | 4      | 6     |
| Frame 8  | 5      | 5     |
| Frame 9  | 2      | 0     |
| Frame 10 | 10     | 0     |
| Bonus    | 5      | 4     |
