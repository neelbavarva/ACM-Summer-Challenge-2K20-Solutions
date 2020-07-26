import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

class TestClass{

public static long calc(int pos, int n){
        long ans = (long)(n-pos)*(pos+1);
        return ans;
    }


public static void main(String[] args ) throws IOException {
    
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
     	int t = Integer.parseInt(br.readLine());

           for(int q=0 ; q<t ; q++) {
        	   int n = Integer.parseInt(br.readLine());
        	   String s = br.readLine();
        	   long total=0;
        	  for(int i=0;i<n;i++)
        	  {
        		  char c=s.charAt(i);
        	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
        		  {
        			  long temp=(long)(n-i)*(i+1);
        			  total=(long)total+(long)temp;
        		  }
        	  
           }

		   String res=Long.toUnsignedString(total);
    		  System.out.println(res);
    	
       }		
       
    }
}
