package bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bowling.model.Player;
import bowling.view.BowlingFormView;
import bowling.view.BowlingResultView;

public class BowlingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = BowlingFormView.inputPeopleNumbers(scanner);
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < number; i++) {
			players.add(new Player(BowlingFormView.inputName(scanner, i + 1)));
		}
		BowlingResultView.showResult(players);
	}
}
