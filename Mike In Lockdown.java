import java.util.Scanner;

class TestClass {
    public static void main(String[] args ) throws Exception {
      
           Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int N=sc.nextInt();
			int[] A=new int[N];
			int[] B=new int[N];
			int[] C=new int[N];
			
			for(int i=0;i<N;i++)
			{
				A[i]=sc.nextInt();
			}
			for(int i=0;i<N;i++)
			{
				B[i]=sc.nextInt();
			}
			for(int i=0;i<N;i++)
			{
				C[i]=sc.nextInt();
			}
			int total=0;
			for(int i=0;i<N;i++)
			{
			   int temp= A[i] + B[i] - C[i] ;
			   if(temp>0)
			   {
				   total=total+temp;
			   }
			}
			
			System.out.println(total);
			
		}

    }
}
