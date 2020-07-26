mport java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t = Integer.parseInt(br.readLine());
		 
		 int Ans=-1,C=1000000007;
		 
		 BigInteger c = BigInteger.valueOf(C);
		 
		 while(t--!=0) {
			 int N = Integer.parseInt(br.readLine());
			 
			 Ans =-1;
			 
			 BigInteger n = BigInteger.valueOf(N),ans = BigInteger.valueOf(-1);
			 long aj=0, ai=0;
			 
			 long p = 0;
			 
			 for(int i=1 ; i<N ; i++) {
				 
				
				 for(int j=i+1 ; j<N && p>=0 ; j++) {
					 p = N - 10*i;
					 
					 BigInteger temp1 = BigInteger.ZERO;
					 BigInteger temp2 = BigInteger.ZERO;
					 
					 BigInteger temp = BigInteger.ZERO;
					 
					 if(p%(j-i)==0) {
						 aj = p/(j-i);
						 ai = 10 - aj;
						 
						 
						 if( (ai>=0) && (aj>=0) && ((ai+aj)==10) ) {
							 Ans = 2;
							 
							 temp1 = BigInteger.valueOf(i);
							 temp2 = BigInteger.valueOf(j);
							 
							 temp = (temp1.pow( (int) ai)).multiply( temp2.pow( (int) aj) );
							 
							 ans = ans.max(temp);
							 
							
							 
						 } 
						 
					 } 
					 
				 }
			 }
			 
			 if(Ans>0) {
				 ans = ans.mod(c);
			 }
			 
			 System.out.println(ans);
		 }
		 
    }
}
