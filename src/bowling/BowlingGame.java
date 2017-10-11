package bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bowling.model.Player;
import bowling.view.BowlingFormView;
import bowling.view.BowlingResultView;

public class BowlingGame {
	public static void main(String[] args) {
		BowlingFormView.setupScnner();

		int number = BowlingFormView.inputPeopleNumbers();
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < number; i++) {
			players.add(new Player(BowlingFormView.inputName(i + 1)));
		}
		for (int i = 0; i < 10; i++) {
			for (Player player : players) {
				player.playRound();
				BowlingResultView.showResult(players);
			}
		}
		BowlingFormView.closeScnner();
	}
}
