import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

class TestClass {

public static long subStr(String s, int low, int high, long count)
	{
		
		while (low >= 0 && high < s.length()
				&& s.charAt(low) == s.charAt(high))
		{
			
			count++;
            low--;
			high++;
		}
		return count;
	}

	
	public static long allPalindromicSubStrings(String s,int n)
	{
		
		long count=0;
		for(int i=0;i<n;i++)
		{
			count+=subStr(s,i,i,0);
			count+=subStr(s,i,i+1,0);
		}

		
		return count;
	}
	 

    public static void main(String[] args ) throws Exception {
        

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		int t=Integer.parseInt(br.readLine());
    		for(int java=0;java<t;java++)
    		{
    			int n=Integer.parseInt(br.readLine());
    			
    		    String s=br.readLine();
    		    System.out.println(allPalindromicSubStrings(s, n));
    		    
    		  
    		}   
	  
    }
}
