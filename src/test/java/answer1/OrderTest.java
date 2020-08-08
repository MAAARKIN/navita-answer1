package answer1;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class OrderTest {
	
	private Order order;
	
	public OrderTest() {
		this.order = new Order();
	}

	@Test
	public void checkOrderNumbers() {

		Map<Integer, Integer> expectedResults = new HashMap<>();
		expectedResults.put(335, 533);
		expectedResults.put(123, 321);
		expectedResults.put(321, 321);
		expectedResults.put(384, 843);
		expectedResults.put(100000001, -1);
		expectedResults.put(100000000, 100000000);

		boolean result = expectedResults.entrySet().stream()
				.allMatch(item -> order.numberByHighest(item.getKey()) == item.getValue());

		assertTrue(result);
	}

	@Test
	public void catchInvalidArgumentOnNumbers() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			order.numberByHighest(-1);
		});

		String expectedMessage = "can't be negative number";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
}
