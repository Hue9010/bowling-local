package bowling.view;

import java.util.List;

import bowling.model.Player;

public class BowlingResultView {
	private static final String top = "| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |";

	public static void showResult(Player player) {
		System.out.println(top);
		StringBuilder sb = makeNameSpace(player.getName());
		sb.append(makePointSpace(player)).append(makeScoreSpace(player));
		System.out.print(sb);
	}

	public static void showResult(List<Player> players) {
		System.out.println(top);
		for (Player player : players) {
			StringBuilder sb = makeNameSpace(player.getName());
			sb.append(makePointSpace(player)).append(makeScoreSpace(player));
			System.out.print(sb);
		}
	}

	public static StringBuilder makeNameSpace(String name) {
		StringBuilder sb = new StringBuilder();
		return sb.append("|  ").append(name).append(" |");
	}

	public static String makePointSpace(Player player) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append("  ").append(player.getResultPoint(i)).append(" |");
		}
		return sb.append("\n").toString();
	}

	public static String makeScoreSpace(Player player) {
		StringBuilder sb = new StringBuilder();
		sb.append("|       |");
		for (int i = 0; i < 10; i++) {
			sb.append("  ").append(player.getResultScore(i)).append("  |");
		}
		return sb.append("\n").toString();
	}
}
