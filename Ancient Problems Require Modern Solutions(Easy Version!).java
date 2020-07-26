import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
    
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long q=sc.nextLong();
		long arr[]=new long[(int) n];
		for(long i=0;i<n;i++)
		{
			arr[(int) i]=sc.nextInt();
		}
		for(long o=0;o<q;o++)
		{
			long d=sc.nextLong();
			long k=sc.nextLong();
			long l=sc.nextLong();
			long r=sc.nextLong();
			long count=0;
			long index=0;
			long check=0;
			for(long i=l-1;i<=r-1;i++)
			{
				if(arr[(int) i]==d)
				{
					count++;
				}
				if(count==k)
				{
					
					check=9;
					index=i;
					break;
				}
			}
			if(check!=0)
			{
				System.out.println(index+1);
			}
			else if(check==0)
			{
				System.out.println("-1");
			}
		}

    }
}
