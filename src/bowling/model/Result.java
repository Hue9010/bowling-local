package bowling.model;

import java.util.ArrayList;
import java.util.List;

public class Result {
	private List<String> points;
	private List<String> scores;
	private int score;

	private Result() {
	}

	public static Result initResult() {
		Result result = new Result();
		result.score = 0;
		result.points = new ArrayList<String>();
		result.scores = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			result.points.add("   ");
			result.scores.add("   ");
		}
		return result;
	}

	public String getScore(int index) {
		return scores.get(index);
	}

	public String getPoints(int index) {
		return points.get(index);
	}

	public void update(int position, String point) {
		points.set(position - 1, point);
		score += calScore(point);
		scores.set(position - 1, settingScore());
	}

	private String settingScore() {
		StringBuilder sb = new StringBuilder(Integer.toString(score));
		for (int i = sb.length(); i < 3; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}

	private int calScore(String point) {
		String[] pointArr = point.split("");
		if (pointArr[0].equals("X")) {
			return 10;
		}
		if (pointArr[2].equals("/")) {
			return 10;
		}
		return Integer.parseInt(pointArr[0]) + Integer.parseInt(pointArr[2]);
	}
}
