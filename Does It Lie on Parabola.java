import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String[] args ) throws Exception {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		for(int j=0;j<T;j++)
		{
			String[] input = new String[3]; 
			input = br.readLine().split(" "); 
			
			double X=Double.parseDouble(input[0]); 
			double Y=Double.parseDouble(input[1]);
			double a=Double.parseDouble(input[2]); 
			
			double LHS = X*X;
			double RHS= 4*a*Y;
			if(LHS==RHS)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
		}
	
    }
}
