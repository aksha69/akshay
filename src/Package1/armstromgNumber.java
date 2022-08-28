package Package1;

public class armstromgNumber {

	public static void main(String[] args) {
		
		int num=371,rem,sum=0;
		
		int num1=num;
		while(num>0)                       //num>0 is not satisfied so its stop executing
		{
			rem=num%10;            //371%10=1      37%10=7       3%10=3
			sum=sum+rem*rem*rem;   //0+1*1*1=1     1+7*7*7=344   344+3*3*3*=344+27=371
			num=num/10;            //371/10=37     37/10=3       3/10=0
		}
		if(num1==sum)
		{
		  System.out.println("given no. is armstromg number");
		}
		else
		{
			System.out.println("given no. is not armstromg number");
		}
		
		
		
		

	}

}
