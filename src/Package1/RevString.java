package Package1;

public class RevString {

	public static void main(String[] args) {
		String str ="HarryPotter";
		String strRev ="";
		char ch;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			ch =str.charAt(i);
		  strRev=  strRev+ch;
		}
		System.out.println("StringReverse=  "+strRev);
		

	}

}
