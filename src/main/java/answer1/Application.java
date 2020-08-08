package answer1;

public class Application {

	public static void main(String[] args) {
		
		if (args.length == 0) {
			throw new IllegalArgumentException("you need an integer value as argument");
		}
		
		Order order = new Order();
		
		if (args.length == 1) {
			int value = Integer.parseInt(args[0]);
			System.out.println(order.numberByHighest(value));
		} else {
			for (String arg : args) {
				int value = Integer.parseInt(arg);
				System.out.print(order.numberByHighest(value));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
