import java.io.*;
import java.util.*;

class TestClass {


static int bubbleSort(int[] arr) {
	  int count=0;
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;
                                 count++;
                         }  
                          
                 }
         
         }
         
         return count;
         
   } 

    public static void main(String args[] ) throws IOException {
       
       Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int o=0;o<t;o++)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int x=bubbleSort(arr);
			if(x>k)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
			
		}
		
    }
}
