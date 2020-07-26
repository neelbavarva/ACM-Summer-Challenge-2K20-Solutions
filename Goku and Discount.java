import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws IOException {
       
      Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		List<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int count=0;
		int check=0;
		for(int i=0;i<n;i++)
		{	
			if(check<=arr[i])
			{
				list.add(arr[i]);
			
			check=check+arr[i];
			}
		}
		System.out.println(list.size());
		
    }
}
