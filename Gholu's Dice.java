import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
         Scanner sc=new Scanner(System.in);
	   long t=sc.nextLong();
	   for(long o=0;o<t;o++)
	   {
		   long n=sc.nextLong();
		   long arr1[]=new long[6];
		 
		   arr1[0]=2;
		   arr1[1]=7;
		   arr1[2]=3;
		   arr1[3]=6;
		   arr1[4]=4;
		   arr1[5]=5;
		   if(n>25)
		   {
			   if(n%18>=2 && n%18<=7) {
			   System.out.println("YES");
			   }
			   else
			   {
				   System.out.println("NO");
			   }
		   }
		   else if(n<=25)
		   {
			   if(n>=20)
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
}
