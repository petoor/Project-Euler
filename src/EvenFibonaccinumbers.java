
public class EvenFibonaccinumbers {

	public static void main(String[] args) {
		int sum=0;
		int i =1;
		while(fibonacciLoop(i)<4000000){
			if(fibonacciLoop(i) % 2 ==0){
				sum+=fibonacciLoop(i);
			}
			i++;
		}
		
		System.out.print(sum);
	}

	   public static int fibonacciLoop(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	        int fibo1=1, fibo2=1, fibonacci=1;
	        for(int i= 3; i<= number; i++){
	            fibonacci = fibo1 + fibo2;
	            fibo1 = fibo2;
	            fibo2 = fibonacci;
	 
	        }
	        return fibonacci;
	    } 
}
