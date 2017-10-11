package bowling.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void 플레이어_생성_테스트() {
		Player player = new Player("lhs");
		assertEquals("lhs", player.getName());
	}

}
