package Package1;

  public class	RevSentenceSuper	{
   public	void	revSentence()
  {  
  String	sentence	=	"I	am	an	automation	engineer";
   String	splitArray[]	=	sentence.split("	");
  for(int	i=0;i<splitArray.length;i++)
   System.out.print(splitArray[i]	+	"	");
    System.out.println("\n----------------");
  for(int	i=splitArray.length-1;i>=0;i--)
  System.out.print(splitArray[i]	+	"	");
 }
  public	void	revEachWordofSentence()
 {
  String	sentence	=	"I	am	an	automation	engineer";
  String	splitArray[]	=	sentence.split("	");
  String	reverseWord	=	"";
  char	ch;
  String	revEachWord[]	=	new	String[5];
  for(int	i=0;i<splitArray.length;i++)		//i=2		2<5
 {
   reverseWord	=	""; //
   for(int	j=0;j<splitArray[i].length();j++)	//j=2			2<2
 { 
   ch	=	splitArray[i].charAt(j);				//ch=m								//am
   reverseWord	=	ch	+	reverseWord;		//reverseWord	=	ma
 }
  revEachWord[i]=reverseWord;			//revEachWord[]	=	{I,ma}
 }
  for(int	k=0;k<revEachWord.length;k++)
  System.out.print(revEachWord[k]	+	"	");
 }
  public	static	void	main(String[]	args)	{
  RevSentenceSuper	a	=	new	RevSentenceSuper();
  // a.revSentence();
  a.revEachWordofSentence();
  }
  }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


