
public class LongestCollatzsequence {

	public static void main(String[] args) {
		long ccounter = 1;
		long kk = 0;
		for (long k = 2; k < 1000000; k++) {
			long n = k;
			long counter = 1;
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
				} else {
					n = 3 * n + 1;
				}
				counter++;
			}
			if (ccounter < counter) {
				ccounter = counter;
				kk = k;
			}
			System.out.println(k + " " + counter + " " + kk + " " + ccounter);
		}
	}

}
