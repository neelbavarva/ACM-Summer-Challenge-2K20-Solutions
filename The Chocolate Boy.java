import java.io.*;
import java.util.*;

class TestClass {

         static int count(int a, int b) { 
	        return (a > b) ? a : b; 
	    } 
		
		static double count(double a, double b) { 
	        return (a > b) ? a : b; 
	    }
		
		static int total(double W, double swt[], ArrayList<Integer> val, int n) { 
	        int i, w; 
	        int K[][] = new int[n + 1][(int)(W + 1)]; 
	  
	       
	        for (i = 0; i <= n; i++) { 
	            for (w = 0; w <= W; w++) { 
	                if (i == 0 || w == 0) 
	                    K[i][w] = 0; 
	                else if (swt[i-1] <= w) 
	                    K[i][w] = count( 
	                        val.get(i-1) + K[i - 1][(int)( w - swt[i-1] )], 
	                        K[i - 1][w]); 
	                else
	                    K[i][w] = K[i - 1][w]; 
	            } 
	        } 
	  
	        return K[n][(int)W]; 
	    } 

    public static void main(String[] args ) throws IOException {


		 BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String n_m[] = br.readLine().split(" "); 
		
		int n = Integer.parseInt(n_m[0]), m = Integer.parseInt(n_m[1]);
		
		ArrayList<Double> sweetness = new ArrayList<Double>();
		ArrayList<Integer> price = new ArrayList<Integer>();
		
		for(int i=0 ; i<n ; i++) {
			String s[] = br.readLine().split(" ");
			
			if(s[1].equals("S")) {
				double swt = Double.parseDouble(s[2]);
				int cost = Integer.parseInt(s[3]);
				
				sweetness.add(swt); 
				price.add(cost);
				
			} 
		} 
		
		int size = sweetness.size();
		double swt[] = new double[size];
		int cost[] = new int[size];
		for(int i=0 ; i<sweetness.size() ; i++) {
			swt[i] = sweetness.get(i);
			cost[i] = price.get(i);
		}
		
		int TotalCost = 0;
		for(int i=0 ; i<size ; i++) {
			swt[i] /= 2;
			int sum = total(m, swt, price, size);
			swt[i] *= 2;
			
			TotalCost = count(TotalCost, sum);
		}
		
		System.out.println(TotalCost);
	} 
	
} 
	   
       