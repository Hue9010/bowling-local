package bowling.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrameTest {

	@Test
	public void inputPoint() {
		Frame frame1 = new Frame();
		while (frame1.haveChance()) {
			frame1.inputKnockedPins(10);
		}
		assertEquals("X  ", frame1.getPoint());

		Frame frame2 = new Frame();
		while (frame2.haveChance()) {
			frame2.inputKnockedPins(5);
		}
		assertEquals("5|/", frame2.getPoint());

		Frame frame3 = new Frame();
		while (frame3.haveChance()) {
			frame3.inputKnockedPins(3);
		}
		assertEquals("3|3", frame3.getPoint());
	}
}
