import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   		
    	int t = Integer.parseInt(br.readLine());

    	for(int q=0 ; q<t ; q++) {
    	    String str = br.readLine();
    	    String[] s = str.split("/");
    	    int n=0;
    	          
    	         
    	          
    	for(int i=0 ; i<s.length ; i++) {
    	        	  
    	    if(i==0) {
    	    continue;
            } 
            else if( (i==1) && (!s[i].isEmpty()) && (!s[i+1].isEmpty()) ) 
            {
    	        n++;
    	        continue;
    	    }
    	        	  
            if( (i< s.length -1 ) && (!s[i].isEmpty()) && (!s[i-1].isEmpty()) && (!s[i+1].isEmpty()) ) 
            {
    	        n++;
    	    } 
    	        	  
            if( (i==(s.length-1)) && (!s[i].isEmpty()) && (!s[i-1].isEmpty()) ) 
            {
    	        		 
                if(str.charAt(str.length()-2) !='/') 
                {
    	        	n++;
    	        }
    	        		  
            }

    	    } 
    	          
    	    System.out.println(n);
    	          
    	    for(int i=0 ; i<s.length ; i++) {
    	        	  
                if(i==0) 
                {
    	        	continue;
                     
                } 
                else if( (i==1) && (!s[i].isEmpty()) && (!s[i+1].isEmpty()) ) 
                {
    	        	System.out.println(s[i]);
    	        	continue;
    	        }
    	        	  
    	        if( (i< s.length -1 ) && (!s[i].isEmpty()) && (!s[i-1].isEmpty()) && (!s[i+1].isEmpty())  ) {
    	        	 System.out.println(s[i]);
    	        } 
    	        	  
    	        if( (i==(s.length-1)) && (!s[i].isEmpty()) && (!s[i-1].isEmpty()) ) {
    	        		 
    	        	if(str.charAt(str.length()-2) !='/') {
    	        		System.out.println(s[i]);
    	        	}
    	        		  
    	        	}
                  
                }
    	          
    	          

    	    } 

    }
}
