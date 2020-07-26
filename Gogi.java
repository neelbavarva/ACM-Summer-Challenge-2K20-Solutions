import java.util.*;
import java.io.*;

class TestClass {


public static int maxproduct(String[] strings) {
	      if (strings == null || strings.length == 0 || strings.length == 1) {
	          return 0;
	      }
	      
	      int max = 0;
	      int length = strings.length;

	      int[] bit = new int[length];

	      for (int i = 0; i < length; i++) {
	          for (char c : strings[i].toCharArray()) {
	              bit[i] = bit[i] | 1 << c - 'a';
	          }
	      }

	      for (int i = 0; i < length; i++) {
	          for (int j = i + 1; j < length; j++) {
	              if ((bit[i] & bit[j]) == 0 && strings[i].length() * strings[j].length() > max) 
	              {
	                  max = strings[j].length() * strings[i].length();
	              }
	          }
	      }

	      return max;
	  } 
   public static void main(String args[] ) throws IOException {
         
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
	   int q=Integer.parseInt(br.readLine());
	   for(int o=0;o<q;o++)
	   {
		   int n=Integer.parseInt(br.readLine());
		   String arr[]=new String[n];
		   for(int k=0;k<n;k++)
		   {
			  arr[k]=br.readLine();
		   }
		   System.out.println(maxproduct(arr));
	   }

   }
}