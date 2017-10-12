package bowling.model;

public class LastFrame extends Frame {
	private int count;

	public LastFrame() {
		point = new StringBuilder();
		knockedPin = 0;
		chance = true;
		times = 0;
		count = 0;
	}

	@Override
	public void calculatePoint(int number) {
		count++;
		countDown();
		if (knockedPin == 10 || number == 10) {
			point.append(strikeOrSpare());
			drawStick();
			times--;
			return;
		}
		countDown();
		point.append(Integer.toString(number));
		if (times == 2) {
			endThisFrame();
			return;
		}
		drawStick();
	}

	@Override
	protected String strikeOrSpare() {
		if (times == 1) {
			return "X";
		}
		return "/";
	}

	private void drawStick() {
		if ((count == 1) || (count == 2)) {
			point.append("|");
		}
	}

	private void countDown() {
		if (count > 2) {
			endThisFrame();
		}
	}

}
