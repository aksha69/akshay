package Package1;

public class Factorial {

	public static void main(String[] args) {
		//5!
		int num=5,fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial="+fact);
		
	}

}
