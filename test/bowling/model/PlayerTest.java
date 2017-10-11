package bowling.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import bowling.view.BowlingFormView;
import bowling.view.BowlingResultView;

public class PlayerTest {
	Player player;

	@Before
	public void setup() {
		BowlingFormView.setupScnner();
		player = new Player("lhs");
	}

	@Test
	public void 플레이어_생성_테스트() {
		player = new Player("lhs");
		assertEquals("lhs", player.getName());
	}

	@Test
	public void 한라운드_플레이해보자() {
		player.playRound();
		BowlingResultView.showResult(player);
	}

	@Test
	public void 여러_라운드_플레이해보자() {
		for (int i = 0; i < 10; i++) {
			player.playRound();
			BowlingResultView.showResult(player);
		}
	}

}
