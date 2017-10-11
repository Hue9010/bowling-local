package bowling.view;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class BowlingFormViewTest {
	Scanner scanner;
	
	@Before
	public void setup() {
		scanner = new Scanner(System.in);
	}
	
	@Test
	public void 몇사람_칠건지_입력받자() {
		int numbers = BowlingFormView.inputPeopleNumbers(scanner);
		assertEquals(3,numbers);
	}
	
	@Test
	public void 이름을_입력받자() {
		String name = BowlingFormView.inputName(scanner, 3);
		assertEquals("lhs", name);
	}
}
