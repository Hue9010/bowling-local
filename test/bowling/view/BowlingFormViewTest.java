package bowling.view;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class BowlingFormViewTest {

	@Before
	public void setup() {
		BowlingFormView.setupScnner();
	}

	@Test
	public void 몇사람_칠건지_입력받자() {
		int numbers = BowlingFormView.inputPeopleNumbers();
		assertEquals(3, numbers);
	}

	@Test
	public void 이름을_입력받자() {
		String name = BowlingFormView.inputName(3);
		assertEquals("lhs", name);
	}

	@Test
	public void 쓰러트린_핀_갯수를_입력받자() {
		int number = BowlingFormView.inputKnockedPins("lhs");
		assertEquals(5, number);
	}
}
