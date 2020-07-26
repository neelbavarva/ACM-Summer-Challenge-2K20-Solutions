import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

class TestClass {
    public static void main(String args[] ) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc=new Scanner(System.in);
     
   	String s[] = br.readLine().split(" ");
   	
   	int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
	
	int grid[][] = new int[n+1][m+1];
	int arr[][] = new int[n+1][m+1];
	int temp[][] = new int[n+1][m+1];   	

   	
   	for(int i=0 ; i<m ; i++) {
   		arr[0][i] = 0;
   		temp[0][i] = 0;
   		grid[0][i] = 1;
   	}
   	
   	for(int i=0 ; i<n ; i++) {
   		arr[i][0] = 0;
   		temp[i][0] = 0;
   		grid[i][0] = 1;
   	}
   	
     	for(int i=1 ; i<=n ; i++) {
   		String line[] = br.readLine().split(" ");
   		
   		for(int j=1 ; j<=m ; j++) {
   		grid[i][j] = Integer.parseInt(line[j-1]);
   			
   	    if(grid[i][j]==1) {
   		arr[i][j] = Math.max( arr[i-1][j] , arr[i][j-1] );
   		temp[i][j] = Math.max(temp[i-1][j], temp[i][j-1]);
   		} else {
   				
   		if(grid[i-1][j]==0 && grid[i][j-1]==0) {
   					temp[i][j] = Math.max(temp[i-1][j], temp[i][j-1])+1;
   		} else if(grid[i-1][j]==0 && grid[i][j-1]==1) {
   					temp[i][j] = temp[i-1][j]+1; 
   		} else if(grid[i-1][j]==1 && grid[i][j-1]==0) {
   					temp[i][j] = temp[i][j-1]+1; 
   		} else {
   					temp[i][j] = 1;
   		}
   				
   		arr[i][j] = Math.max( temp[i][j] , Math.max( arr[i-1][j] , arr[i][j-1] ) ); 	
   		}
   			
   		} 
   	} 
		
   	      System.out.println(arr[n][m]);

    }
}
