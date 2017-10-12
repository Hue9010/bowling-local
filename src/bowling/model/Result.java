package bowling.model;

import java.util.ArrayList;
import java.util.List;

public class Result {
	private List<String> knockedPins;
	private int kncokPosition;
	private List<String> scores;
	private int scorePosition;
	private int score;

	public static Result initResult() {
		Result result = new Result();
		result.score = 0;
		result.knockedPins = new ArrayList<String>();
		result.kncokPosition = 0;
		result.scorePosition = 0;
		result.scores = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			result.knockedPins.add("   ");
			result.scores.add("   ");
		}
		return result;
	}

	public String getScore(int index) {
		return scores.get(index);
	}

	public String getKnockedPins(int index) {
		return knockedPins.get(index);
	}

	public void update(String pins) {
		knockedPins.set(kncokPosition, pins);
		checkScores();
		kncokPosition++;
		calculateScore(pins);
	}

	private void checkScores() {
		if (kncokPosition != scorePosition) {
			adjustScore();
		}
	}

	private void adjustScore() {
		String pins = knockedPins.get(scorePosition).trim();
		String[] pointArr = pins.split("");
		if (isStrike(pins.charAt(0))) {
			adjustStrike();
			return;
		}
		if (isSpare(pins.charAt(2))) {
			String pin = knockedPins.get(scorePosition + 1);
			pointArr = pin.trim().split("");
			score += addScore(pointArr[0]);
			scores.set(scorePosition++, settingScore());
			return;
		}
	}

	private void adjustStrike() {
		String next = knockedPins.get(scorePosition + 1).trim();
		String[] nextFrame = next.split("");
		if ((kncokPosition - scorePosition) == 2) {
			String[] secondNextFrame = knockedPins.get(scorePosition + 2).split("");
			addScore(nextFrame[0], secondNextFrame[0]);
			checkScores();
			return;
		}
		score += 10;
		if (nextFrame.length > 2) {
			addScore(nextFrame[0], nextFrame[2]);
			return;
		}
	}

	private String settingScore() {
		StringBuilder sb = new StringBuilder(Integer.toString(score));
		for (int i = sb.length(); i < 3; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}

	private void calculateScore(String point) {
		if (scorePosition == 9) {
			lastScore();
			return;
		}
		String[] pointArr = point.split("");
		if (isStrike(point.charAt(0))) {
			return;
		}
		if (isSpare(point.charAt(2))) {
			score += 10;
			return;
		}
		addScore(pointArr[0], pointArr[2]);
	}

	private void lastScore() {
		String pins = knockedPins.get(kncokPosition - 1);
		String[] pinArray = pins.split("");
		if (pinArray.length > 4) {
			score += addScore(pinArray[4]);
		}
		addScore(pinArray[0], pinArray[2]);
	}

	private int addScore(String score) {
		if (score.equals("X")) {
			return 10;
		}
		if (score.equals("/")) {
			return 10;
		}
		return Integer.parseInt(score);
	}

	private void addScore(String firstScore, String secondScore) {
		score += addScore(firstScore) + addScore(secondScore);
		scores.set(scorePosition++, settingScore());
	}

	private boolean isStrike(char knockedPins) {
		return knockedPins == 'X';
	}

	private boolean isSpare(char knockedPins) {
		return knockedPins == '/';
	}
}
