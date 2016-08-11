
public class Sumsquaredifference {

	public static void main(String[] args) {
		int n = 100, sum1 = 0, sum2;
		for (int i = 1; i <= n; i++) {
			sum1 += i * i;
		}
		sum2 = (n * (n + 1) / 2) * (n * (n + 1) / 2);
		int total = sum2 - sum1;
		System.out.print(total);
	}

}
