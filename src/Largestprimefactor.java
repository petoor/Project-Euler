
public class Largestprimefactor {

	public static void main(String[] args) {
		int i = 0, h = 0;
		long k = 600851475143L;
		for (i = 2; i <= k; i++)
			if (prime(i) == true &&  k %i ==0) {
				h = i;
				System.out.println(h);
			}
		System.out.println(h);
	}

	public static boolean prime(int n) {
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
