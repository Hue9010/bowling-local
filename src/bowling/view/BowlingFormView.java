package bowling.view;

import java.util.Scanner;

public class BowlingFormView {
	public static int inputPeopleNumbers(Scanner scanner) {
		System.out.println("How many people?");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public static String inputName(Scanner scanner, int number) {
		System.out.printf("플레이어 %d의 이름은?(3 english letters):", number);
		String name = scanner.nextLine();
		return name;
	}
}
