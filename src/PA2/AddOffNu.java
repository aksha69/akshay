package PA2;

public class AddOffNu {
	
		

	public static void main(String[] args) {

		int num=5687;
		int sum=0;
		
		
	   while(num>0) {
		 
		   
		   int	temp =num%10;
		    num=num/10;
		    sum=sum+temp;
		   
		   
	   }
		
	System.out.println(sum);
		
		
	
		
		
		
		
		
		
	}

}
