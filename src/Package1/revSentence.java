package Package1;

public class revSentence {

	public static void main(String[] args) {
	String sentence ="I am an automation engineer";
    String splitArray[]=sentence.split("");
	
    for(int i=0;i<splitArray.length;i++)
    {
    	System.out.print(splitArray[i]+ "");
    }
	

      System.out.println("\n----------------");
      
      for(int i=splitArray.length-1;i>=0;i--)
      {
    	  System.out.print(splitArray[i]+"");
      }
	
	
	
	
	
	
	
	
	
	
	}

}
