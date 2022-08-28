package PA2;

public class RevString {

	public static void main(String[] args) {
		String str="akshay";
        String revString = "";
		
		char ch;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			ch=str.charAt(i);
			revString=revString+ch;
			
		}
		System.out.println(revString);
		
		
		
		
		
		
	}

}
