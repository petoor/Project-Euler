
public class Multiplesof3and5 {

	public static void main(String[] args) {
int i;
int c =0;
		for(i=0;i<1000;i++){
			if(i % 3 ==0 || i % 5 == 0){
			c+=i;	
			}
		}
		System.out.println(c);
	}

}
