import java.math.BigInteger;

public class powerdigitsum {

	public static void main(String[] args) {
		BigInteger to = BigInteger.valueOf(2);
		BigInteger summ;
		BigInteger summm = BigInteger.valueOf(0);
		BigInteger total = BigInteger.valueOf(0);
		summ = to.pow(1000);
		System.out.println(summ);
		int length = summ.toString().length();
		int i;
		long p = 1;
		for (i = 0; i < length; i++) {
			p = 10;
			summm = summ.mod(BigInteger.valueOf(10));
			summ = summ.divide(BigInteger.valueOf(p));
			total = total.add(summm);

		}
		System.out.println(total);
	}
}
