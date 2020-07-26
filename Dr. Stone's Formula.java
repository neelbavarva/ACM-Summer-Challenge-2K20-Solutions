import java.io.*;
import java.util.*;
 
class TestClass {
 
       public static void fiboterms(ArrayList<Integer> fibo,int k)
	{
		    int i = 3, nextTerm = 0; 
            fibo.add(0); 
	        fibo.add(1); 
	        fibo.add(1);
	        while(true)
	        {
	        	nextTerm=fibo.get(i - 1) + fibo.get(i - 2); 
	        	if(nextTerm>k)
	        	{
	        		return;
	        	}
	        	fibo.add(nextTerm);
	        	i++;
	        }
	}
 
	public static int find (int a)
	{
		ArrayList<Integer> fibo=new ArrayList<>();
		fiboterms(fibo,a);
		int ans=0,j=fibo.size()-1;
		
		while(a>0)
		{
			ans=ans+a/fibo.get(j);
			a=a%fibo.get(j);
			j--;
		}
		return ans;
	}
 
    public static void main(String args[] ) throws IOException {
 
    //FAST IO
 
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   	 int t=Integer.parseInt(br.readLine());
   	 
   	 for(int o=0;o<t;o++)
   	 {
   		 int n=Integer.parseInt(br.readLine());
   		 
   		System.out.println(find(n));
   	 }
   	 
      
 
    }
}