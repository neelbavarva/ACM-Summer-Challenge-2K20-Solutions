import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestClass {

static long noOfPairs(int a[], int n) 
	    { 
	        long count = 0; 
	  
	        
	        for (int i = 0; i < n-1; i++) { 
	            for (int j = i + 1; j < n; j++) 
	                if (a[i] > a[j]%1000000007) 
	  
	                     
	                    count ++; 
	        }

	        return count; 
	    }

    public static void main(String[] args ) throws IOException {
      
	try{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 		
	 		String[] n1_k = br.readLine().split(" "); 
	 		
	 		int n1=Integer.parseInt(n1_k[0]);
	 		int k=Integer.parseInt(n1_k[1]);
	 					int c = 1000000007;
	 			    	int[] arr1=new int[n1];
	 			    	int[] arr2=new int[n1*2];
	 			    	
	 			    	String[] Arr = br.readLine().split(" ");
	 			    	for(int i=0;i<n1;i++)
	 			    	{
	 			    		arr1[i] = Integer.parseInt(Arr[i]);
	 			    	}
	 			    	for(int i=0;i<2;i++)
	 			    	{
	 			    		for(int j=0;j<n1;j++)
	 			    		{
	 			    			arr2[j + i*n1 ]=arr1[j];
	 			    		}
	 			    	}

	 			    long count1 =noOfPairs(arr1,n1);
	 			    long count2 =noOfPairs(arr2,n1*2);
	 			    	
	 			    long ans =(k*((2*count1) + (k-1)*(count2-count1*2)))/2;
	 			    	
	 				ans = ans%c;
	 					
	 			    System.out.println(ans);
	    	
	  }
	  catch(Exception e)
	  {
		  return;
	  }

    }
}