
public class Smallestmultiple {

	public static void main(String[] args) {
		int k = 0;
		int i;
		for (i = 1; i < 500000000; i++) {
			if (i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0
					&& i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
				k = i;
				break;
			}
		}
		System.out.println(k);
	}

}
