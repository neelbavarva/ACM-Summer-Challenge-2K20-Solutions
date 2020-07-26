import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String[] Split1 = br.readLine().split(" ");
        String[]  Split2 = br.readLine().split(" ");
	    HashMap<Integer,Integer> map=new HashMap<>();
	    List<Integer> list=new LinkedList<>();
	    int arr[]=new int[n];
	    int exit[]=new int[n];
	    int entry[]=new int[n];
		for(int i=0;i<n;i++)
		{
			list.add(Integer.parseInt(Split1[i]));
			arr[i]= Integer.parseInt(Split2[i]);
			entry[i]=i+1;
			map.put(list.get(i), i+1);
			
		}
		
		for(int i=0;i<n;i++)
		{
			
			exit[i]=map.get(arr[i]);
		}
		
		int i=0;
		int j=0;
		int count=0;
		while(i<entry.length || j<exit.length)
		{
			if(entry[i]<0)
			{
				i++;
			}
			
			else if(entry[i]==exit[j])
			{
				i++;
				j++;
			}
			else
			{
				int index=exit[j];
				entry[index-1]=-1;
				j++;
				count++;
				
			}
			
		}
		System.out.println(count);
		
    }
}
