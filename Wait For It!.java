import java.util.Scanner;

class TestClass {
    public static void main(String[] args ) throws Exception {
       try {
			Scanner sc=new Scanner(System.in);
			long t=sc.nextLong();
			for(long j=0;j<t;j++)
			{
				long A=sc.nextLong();
				long B=sc.nextLong();
				long C=sc.nextLong();
				long D=sc.nextLong();
				long total=0;
				
				if(A>B)
				{
					System.out.println(B);
				}
				if(A==B)
				{
					System.out.println(A);
				}
				
				if(A<B)
				{
					B=B-A;
					total=total+A;
					if(B<C && B<D)
					{
						total=total+B;
					}
					if(C<B && C<D)
					{
						total=total+C;
					}
					if(D<C && D<B)
					{
						total=total+D;
					}
					System.out.println(total);
				}
			}
		} catch(Exception e) {
			return;
		}

    }
}
