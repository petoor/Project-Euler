
public class Summationofprimes {

	public static void main(String[] args) {
		long n = 2000000;
		// int p = n;
		int i;
		long counter = 2;
		/*
		 * while (p > 1) { if (p % i == 0 && isPrime(i) == true) { p = p / i;
		 * counter += i; System.out.println(i + " " + p); i = 2; } else { i++; }
		 * } System.out.println(counter);
		 */
		for (i = 3; i <= n; i++) {
			if (isPrime(i) == true) {
				counter += i;
				System.out.println(counter);
			}
		}
		System.out.println(counter);
	}

	// checks whether an int is prime or not.
	public static boolean isPrime(int n) {
		// check if n is a multiple of 2
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
