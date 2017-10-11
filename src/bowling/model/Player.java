package bowling.model;

import java.util.List;

public class Player {
	String name;
	List<Frame> frames;
	Result result;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
