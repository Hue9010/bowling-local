package bowling.view;

import java.util.Scanner;

public class BowlingFormView {
	private static Scanner scanner;
	
	public static void setupScnner() {
		scanner = new Scanner(System.in);
	}
	
	public static void closeScnner() {
		scanner.close();
	}
	
	public static int inputPeopleNumbers() {
		System.out.println("How many people?");
		return Integer.parseInt(scanner.nextLine());
	}

	public static String inputName(int number) {
		System.out.printf("플레이어 %d의 이름은?(3 english letters):", number);
		String name = scanner.nextLine();
		return name;
	}

	public static int inputKnockedPins(String name) {
		System.out.print(name + "'s turn : ");
		int number = Integer.parseInt(scanner.nextLine());
		return number;
	}
}
