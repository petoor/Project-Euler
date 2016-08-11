
public class SpecialPythagoreantriplet {

	public static void main(String[] args) {
		int a, b, c;
		for (a = 1; a < 1000; a++) {
			for (b = 1; b < 1000; b++) {
				for (c = 1; c < 1000; c++) {
					if (a + b + c == 1000 && (a * a) + (b * b) == c * c) {
						System.out.println(a + " " + b + " " + c);
						// a=200, b=375, c=425.
						System.out.println(a * b * c);
					}
				}
			}
		}

	}

}
