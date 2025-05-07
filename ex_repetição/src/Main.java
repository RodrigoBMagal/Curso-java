public class Main {
	private int x = 5;
	private int y = 0;

	public void process() {
		while (x > 2) {
			System.out.print(x);
			y = y + x;
			x = x - 1;
		}

		System.out.println("\nValor final de y: " + y);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.process();
	}
}