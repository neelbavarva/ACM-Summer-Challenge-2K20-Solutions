import java.util.Scanner;

class TestClass {
    public static void main(String[] args ) throws Exception {
      try
	       {
	    	    Scanner sc=new Scanner(System.in);
		       
		       int n=sc.nextInt();
		       int k=sc.nextInt();
		       
		       int[] A=new int[n];
		       int[] S=new int[n];
		       
		       for(int i=0;i<n;i++)
		       {
		    	   A[i]=sc.nextInt();
		       }
		       
		       for(int i=0;i<n;i++)
		       {
		    	   S[i]=sc.nextInt();
		       }
		       int sum=0;
		       int max=0;
		       for(int i=0;i<=(n-k);i++)
		       {
		    	   if(S[i]==0)
		    	   { 
		    		   sum=0;
		    		   for(int j=i;j<=(i+k-1);j++)
		    		   {
		    			   if(S[j]==0)
		    			   {
		    				   sum=sum+A[j];
		    			   }
		    		   }
		    		   if(max<sum)
		    		   {
		    			   max=sum;
		    		   }
		    	   }
		       }
		       int answer=0;
		       for(int i=0;i<n;i++)
		       {
		    	   if(S[i]==1)
		    	   {
		    		   answer=answer+A[i];
		    	   }
		       }
		       System.out.println(answer+max);
		
	       }catch(Exception e)
	       {
	    	   return;
	       }
	

    }
}
