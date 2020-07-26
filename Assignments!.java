import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

class TestClass {

    public static void main(String args[] ) throws IOException {
        
	    	Scanner sc=new Scanner(System.in);
	    	long n=sc.nextLong();
	    	long m=sc.nextLong();
	    	int arr[]=new int[(int) n];
	    	int arr2[]=new int[(int) n];
	    	for(long i=0;i<n;i++)
	    	{
	    		arr[(int) i]=sc.nextInt();
	    	}
			Arrays.sort(arr);
	    	for(int i=0;i<n;i++)
	    	{
	    		arr2[i]=arr[i];
	    	}
	    	
	    	long time=0;
	    	long count=0;
	    	if(arr[0]!=0)
	    	{
	    	for(long i=0;i<n;i++)
	    	{
	    		arr[(int) i]=arr[(int) i]-arr[0]+1;
	    	}
	    	time=arr[0]-1;
	    	
	    	}
	    	while(count<m)
	    	{
	    		
	    		for(long i=0;i<n;i++)
	    		{
	    			arr[(int) i]--;
	    		}
	    		for(long i=0;i<n;i++)
	    		{
	    			if(arr[(int) i]==0)
	    			{
	    				count=(long)count+1;
	    				arr[(int) i]=arr2[(int) i];
	    			}
	    		}
	    	   time=(long)time+1;
	    		
	    	}
	    	String res=Long.toUnsignedString((long)time);
	    	System.out.println(res);
		 	 
    	
    }
}
