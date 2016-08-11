
public class one_0001st_prime {

	public static void main(String[] args) {
		int k=0;
		int i=0;
		while(i<10001){
			k++;
			if(prime(k)==true){
				i++;
			};
		}
		System.out.println(k);

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
