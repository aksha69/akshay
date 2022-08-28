package Package1;

public class RevNum {

	public static void main(String[] args) {
		
		int num=12345;
		String revNum=Integer.toString(num);
	//String str ="HarryPotter";
	String strRev ="";
	char ch;
	
	for(int i=revNum.length()-1;i>=0;i--)
	{
		ch =revNum.charAt(i);
	  strRev=  strRev+ch;
	}
	System.out.println("StringReverse="+strRev);
	
	
	

	}

}
