package Package1;

public class addoffNum {

	public static void main(String[] args) {
		
    int num=56789;
    int sum=0;                                                              //5/10---remaining is 5
    
    while(num>0)    
    {
    	int temp=num%10;    //56789%10=9     5678%10=8  567%10=7  56%10=6   5%10=5
    	num=num/10;         //56789/10=5678  567        56        5         0
    	sum=sum+temp;       //0+9=9          9+8=17     17+7=24   24+6=30   30+5=35
    	
     }
		System.out.println("Add of num="+sum);
		
			
	}

}
