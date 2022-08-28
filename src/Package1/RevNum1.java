package Package1;

public class RevNum1 {

	public static void main(String[] args) {
	
		int num = 12345;
		int revNum=0;
		int multifactor=10000;
		
	     System.out.println("Original number = "+num);
		for(int i=0;i<5;i++)
{
	int temp = num%10;                //12345%10=5         1234%10=4            3       2      1%10=1
	num=num/10;                      //12345/10=1234      1234/10=123           12      2      1/10=0
	revNum=revNum+temp*multifactor;  //0+(5*10000)=50000  50000+(4*1000)=54000  54300   54320  54321
	multifactor=multifactor/10;	     //10000/10=1000      1000/10=100           10      1      1/10=0
}
		System.out.println("Reverse Number = "+revNum);
		
		
		
		
		

	}

}
