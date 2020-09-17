public class Runtime {
	public static void main(String[]argc) {
		long start, end, duration;
		int n = -250, q, foo;
		for(int i = 0; i < 8; i++){
			start = System.nanoTime();
			n = n + 250;
			for(q = 1; q < n; q++)
				for(int k = 1; k < n; k++)
					foo = 7;
			end = System.nanoTime();
			duration = end - start;
			
			System.out.println("Runtime: " + duration + " ns");
			System.out.println("Number of Elements: " + i);
			System.out.println();
		}
	}
}
