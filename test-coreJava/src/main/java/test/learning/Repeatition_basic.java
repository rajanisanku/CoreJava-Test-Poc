package test.learning;
import java.lang.String;
class Repeatition_basic
{
	private static final char NULL = 0;
	public static void main (String[] args) 
	{
		String str = "java Java bhoomika Joshi hello";
		String strWithoutSpace = str.replaceAll(" ","");
		char[] ch = strWithoutSpace.toCharArray(); 
		System.out.println("Printing the repeated Characters : ");
		for(int i=0;i<ch.length;i++)
        {
            int count = 0 ;
            for( int j=i+1;j<ch.length;j++)
            {
              if(ch[i] == ch[j] && ch[i] != NULL)                                           
              {
                 count++;  
                 ch[j] = NULL;
              }
            }
            
            
            if(count >= 1)           
            {
                System.out.print(strWithoutSpace.charAt(i)+" ");
            }

        }
	}
}
