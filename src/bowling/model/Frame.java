package bowling.model;

public class Frame {
	private StringBuilder point;
	private int knockedPins;
	private boolean chance;
	private int times;

	public Frame() {
		point = new StringBuilder();
		knockedPins = 0;
		chance = true;
		times = 0;
	}

	public String getPoint() {
		return point.toString();
	}

	public void inputKnockedPins(int number) {
		times++;
		knockedPins += number;
		calculatePoint(number);
	}

	public void calculatePoint(int number) {
		if (knockedPins == 10) {
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

	private String strikeOrSpare() {
		endThisFrame();
		if (times == 2) {
			return "/";
		}
		return "X  ";
	}

	public boolean haveChance() {
		return chance;
	}

	private void endThisFrame() {
		chance = !chance;
	}
}
