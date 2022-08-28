package PA2;

public class revNum {

	public static void main(String[] args) {
		
		int num = 123456;
		String revNum=Integer.toString(num);
        String strRev="";
        char ch;
        
        for(int i=revNum.length()-1;i>=0;i--)
        {
        	
        	ch=revNum.charAt(i);
        	strRev=strRev+ch;
        	
        	
        }
		System.out.println(strRev);
		
		
		
		
		
		
	}

}


