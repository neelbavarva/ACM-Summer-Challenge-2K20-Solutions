import java.io.*;
import java.util.*;


class TestClass {
    public static void main(String[] args ) throws IOException {
    Scanner sc=new Scanner(System.in);
		
	   
		long n=sc.nextLong();
		long q=sc.nextLong();
		long arr[]=new long[(int) n];
		ArrayList<Integer>[] al = new ArrayList[(int) n];
		for (int i = 0; i < n; i++) { 
            al[i] = new ArrayList<Integer>(); 
        }
		for(int i=0;i<n;i++)
		{
			int adder=sc.nextInt();
			al[adder-1].add((int) i);
			arr[i]=adder;
		}
		
		Arrays.sort(arr);
		
		
		for(long o=0;o<q;o++)
		{
			long d=sc.nextLong();
			long k=sc.nextLong();
			long l=sc.nextLong();
			long r=sc.nextLong();
			long count=0;
			long index=0;
			long check=0;
			if(arr[(int) (n-1)]<d)
			{
				System.out.println("-1");
			}
			else
			{
		   
			for(long i=0;i<al[(int) (d-1)].size();i++)
			{
				long temp=al[(int) (d-1)].get((int) i);
				
				if(temp>r-1)
				{
					check=9;
					break;
				}
				if(temp>=l-1)
				{
					count++;
				}
				if(count==k)
				{
					index=temp;
					check=0;
					break;
				}
				if(i==al[(int) (d-1)].size()-1 && count!=k)
				{
					check=9;
				}
				
					 
			}
			if(check==0)
			{
				System.out.println(index+1);
			}
			else
			{
				System.out.println("-1");
			}
			}
			
		}
	 
    }
}
