package bowling.model;

public class Frame {
	protected StringBuilder point;
	protected int knockedPin;
	protected boolean chance;
	protected int times;

	public Frame() {
		point = new StringBuilder();
		knockedPin = 0;
		chance = true;
		times = 0;
	}

	public String getPoint() {
		return point.toString();
	}

	public void inputKnockedPins(int number) {
		times++;
		knockedPin += number;
		calculatePoint(number);
	}

	public void calculatePoint(int number) {
		if (knockedPin == 10) {
			point.append(strikeOrSpare());
			return;
		}
		point.append(Integer.toString(number));
		if (times == 2) {
			endThisFrame();
			return;
		}
		point.append("|");
	}

	protected String strikeOrSpare() {
		endThisFrame();
		if (times == 2) {
			return "/";
		}
		return "X  ";
	}

	public boolean haveChance() {
		return chance;
	}

	protected void endThisFrame() {
		chance = !chance;
	}
}
