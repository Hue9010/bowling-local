package bowling.model;

import java.util.ArrayList;
import java.util.List;

import bowling.view.BowlingFormView;
import bowling.view.BowlingResultView;

public class Player {
	private String name;
	private List<Frame> frames;
	private Result result;

	private Player() {
	}

	public Player(String name) {
		this.name = name;
		this.frames = new ArrayList<Frame>();
		this.result = Result.initResult();
	}
	
//	public Player initPlayer(String name) {
//		Player player = new Player();
//		player.name = name;
//		this.result = Result.initResult();
//		this.frames = new ArrayList<Frame>();
//		return null;
//	}

	public void playRound() {
		Frame frame = new Frame();
		while (frame.haveChance()) {
			frame.inputKnockedPins(BowlingFormView.inputKnockedPins(name));
		}
		frames.add(frame);
		result.update(frame.getPoint());
	}

	public String getResultScore(int index) {
		return result.getScore(index);
	}

	public String getResultPoint(int index) {
		return result.getKnockedPins(index);
	}

	public String getName() {
		return name;
	}
}
