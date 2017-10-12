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
//		this.frames = new ArrayList<Frame>();
		this.frames = initFrames();
		this.result = Result.initResult();
	}
	
	public List<Frame> initFrames() {
		List<Frame> frames = new ArrayList<>();
		for(int i = 0; i < 9; i++) {
			frames.add(new Frame());
		}
		frames.add(new LastFrame());
		return frames;
	}
	private int temp = 0;
	public void playRound() {
		Frame frame = frames.get(temp++);
		while (frame.haveChance()) {
			frame.inputKnockedPins(BowlingFormView.inputKnockedPins(name));
		}
//		frames.add(frame);
		result.update(frame.getPoint());
	}
//	public void playRound() {
//		Frame frame = new Frame();
//		while (frame.haveChance()) {
//			frame.inputKnockedPins(BowlingFormView.inputKnockedPins(name));
//		}
//		frames.add(frame);
//		result.update(frame.getPoint());
//	}

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
