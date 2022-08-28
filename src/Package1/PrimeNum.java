package Package1;

import java.io.NotActiveException;
import java.lang.reflect.Method;

public class PrimeNum {

	public static void main(String[] args) {
		int num=23;                          // this Method is not applicable for num=2, and 2 is not a prime number
		int count=0;
        for(int i=2;i<num;i++)             
        {
        	if(num%i==0)
        	{
        		count++;
        		break;
        	}
        	if(count==1)
        	{
        		System.out.println("Not Prime");
        	}
        	else {
        		{
        			System.out.println("Prime");
        		}
			}
        	
        }
	}

}
