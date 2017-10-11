package bowling.model;

import java.util.List;

public class Player {
	private String name;
	private List<Frame> frames;
	private Result result;
	
	public Player(String name) {
		this.name = name;
		this.result = Result.initResult();
	}
	
	public String getName() {
		return name;
	}
	
	public String getScore(int index) {
		return result.getScore(index);
	}
	
	public String getPoint(int index) {
		return result.getPoints(index);
	}
}
