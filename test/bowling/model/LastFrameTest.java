package bowling.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastFrameTest {

	@Test
	public void lastFrameTest() {
		LastFrame lasFrame1 = new LastFrame();
		while (lasFrame1.haveChance()) {
			lasFrame1.inputKnockedPins(10);
		}
		assertEquals("X|X|X", lasFrame1.getPoint());

		LastFrame lasFrame2 = new LastFrame();
		while (lasFrame2.haveChance()) {
			lasFrame2.inputKnockedPins(5);
		}
		assertEquals("5|/|5", lasFrame2.getPoint());

		LastFrame lasFrame3 = new LastFrame();
		while (lasFrame3.haveChance()) {
			lasFrame3.inputKnockedPins(3);
		}
		assertEquals("3|3", lasFrame3.getPoint());
	}
}
