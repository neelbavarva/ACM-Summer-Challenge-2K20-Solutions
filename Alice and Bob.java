import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
		  int N=sc.nextInt();
		  
		  List<Integer> list1=new LinkedList<>();
		  List<Integer> list2=new LinkedList<>();
		  List<Integer> list3=new LinkedList<>();
		  Set<Integer> set=new HashSet<Integer>();
		  for(int i=0;i<N;i++)
		  {  
			  set.add(sc.nextInt());
			 
		  }
		  
		  int arr[]=new int[set.size()];
		  int bob[]=new int[set.size()];
		  int l=0;
		  for(int x : set)
		  {
			  arr[l++]=x;
		  }
		  Arrays.sort(arr);
		  for(int i=0;i<set.size();i++)
		  {
			  bob[i]=arr[i];
			  if(arr[i]%3==0)
			  {
				  list3.add(arr[i]);
			  }
			  else if(arr[i]%2==0)
			  {
				  list2.add(arr[i]);
			  }
			  else
			  {
				  list1.add(arr[i]);
			  }
		  }
		 
		  int bobwin=0;
		  int alicewin=0;
		  int tie=0;
		 
		  for(int i=0;i<list3.size();i++)
		  {
			  
			  if(list3.get(i)>bob[i])
			  {
				  alicewin=alicewin + list3.size()-i;
				  break;
				  
			  }
			  else if(list3.get(i)<bob[i])
			  {
				  bobwin++;
			  }
			  else
			  {
				  tie++;
			  }
			  
			  
		  }
		  
		  for(int i=0;i<list2.size();i++)
		  {
			  if(list2.get(i)>bob[i+list3.size()])
			  {
				  alicewin=alicewin+list2.size()-i;
				  break;
			  }
			  else if(list2.get(i)<bob[i+list3.size()])
			  {
				  bobwin++;
			  }
			  else
			  {
				  tie++;
			  }
			  
		  }
		  
		  for(int i=list1.size()-1;i>=0;i--)
		  {
			  if(list1.get(i)>bob[i+list3.size()+list2.size()])
			  {
				  alicewin++;
				  
			  }
			  else if(list1.get(i)<bob[i+list3.size()+list2.size()])
			  {
				  bobwin=bobwin+i+1;
				  break;
			  }
			  else
			  {
				  tie++;
			  }
		  }
		  
		 
		System.out.println(alicewin+" "+bobwin+" "+tie);
		
		
    }
}
