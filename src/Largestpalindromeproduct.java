
public class Largestpalindromeproduct {

	public static void main(String[] args) {
		int n = 100, k = 100;
		int j = 0, i = 0, m = 0;
		for (n = 1; n < 1000; n++) {
			for (k = 1; k < 1000; k++) {
				j = k * n;
				if (j / 100000 % 10 == j % 10 && j / 10000 % 10 == j / 10 % 10 && j / 1000 % 10 == j / 100 % 10) {
					i = j;
					if (i > m) {
						m = i;
					}
				}

			}
		}
		System.out.println(m);
	}

}
