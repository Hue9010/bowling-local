package bowling.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ResultTest {

	@Test
	public void initResult() {
		Result result = Result.initResult();
		List<String> scores = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			scores.add("   ");
		}
		for (int i = 0; i < 10; i++) {
			assertEquals(scores.get(i), result.getScore(i));
		}
		List<String> points = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			points.add("   ");
		}
		for (int i = 0; i < 10; i++) {
			assertEquals(points.get(i), result.getPoints(i));
		}
	}
	
	@Test
	public void 쓰러트린_핀에_값을_Result에_적용시키자() {
		Result result = Result.initResult();
		result.setPoint(1,"3|4");
		assertEquals("3|4",result.getPoints(1));
	}

}
