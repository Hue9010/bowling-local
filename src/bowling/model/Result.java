package bowling.model;

import java.util.ArrayList;
import java.util.List;

public class Result {
	private List<String> points;
	private List<String> scores;

	private Result() {
	}

	public static Result initResult() {
		Result result = new Result();
		result.points = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			result.points.add("   ");
		}
		result.scores = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
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

}
