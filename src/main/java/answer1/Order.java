package answer1;

import java.util.Arrays;
import java.util.Collections;

public class Order {
	
	private static final int EXCEED_LIMIT = -1;
	private static final int LIMIT = 100000000;

	public int numberByHighest(int myNumber) {

		if (myNumber < 0) {
			throw new IllegalArgumentException("can't be negative number");
		}

		if (myNumber > LIMIT) {
			return EXCEED_LIMIT;
		}

		String[] numbers = Integer.toString(myNumber).split("");

		// ordering the numbers from the highest to the lowest
		Arrays.sort(numbers, Collections.reverseOrder());

		// join the result into a String
		String result = String.join("", numbers);

		return Integer.parseInt(result);
	}
}
