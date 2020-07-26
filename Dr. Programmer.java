import java.util.*;
import java.io.*;
 
 
public  class testclass {
 
	public static void main(String args[] ) throws Exception {
		
 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
	        String[] java = br.readLine().split(" ");
	        String[] n1 = br.readLine().split(" ");
	        String[] m1 = br.readLine().split(" ");
	        
	        int n = Integer.parseInt(java[0]), 
	        	m = Integer.parseInt(java[1]), 
	        	q = Integer.parseInt(java[2]);
	        
	        long x[] = new long[n];
	        for(int i=0 ; i<n ; i++) {
	        	x[i] = Long.parseLong(n1[i]);
	        }
	        Arrays.sort(x);
	        
	        long y[] = new long[m];
	        for(int i=0 ; i<m ; i++) {
	        	y[i] = Long.parseLong(m1[i]);
	        }
	        
	        Arrays.sort(y);
	        
	        while(q--!=0) {
	        	String[] qi = br.readLine().split(" ");
	        	long z = Long.parseLong(qi[0]);
	        	String ch = qi[1];
	        	
	        	int ans=0;
	        	
	        	if(ch.equals("A")) {
	        		
	        		long l = Long.parseLong(qi[2]);
	        		long r = Long.parseLong(qi[3]);
	        		
	        		int a=(int) countAns(x, n, l),
	        			b=(int) countAns(y, m, z);
	        		
	        		ans = (int) countAB(x, y, n, m, z, a, b, l, r);
	        		
	        	} else if(ch.equals("B")) {
	        		
	        	
	        		long l = Long.parseLong(qi[2]);
	        		long r = Long.parseLong(qi[3]);
	        		
	        		int a=(int) countAns(y, m, l),
	        			b=n-1;
	        		
	        		ans = (int) countAB(y, x, m, n, z, a, b, l, r);
	        	
	        	} else {
	        		
	        		
	        		
	        		long l1 = Long.parseLong(qi[2]);
	        		long r1 = Long.parseLong(qi[3]);
	        		
	        		long l2 = Long.parseLong(qi[4]);
	        		long r2 = Long.parseLong(qi[5]);
 
	        		long a=countAns(x, n, l1),
	        			b=n-1,
	        			c=0,
	        			d=m-1;
	        		
	        		ans =  (int) countC(x, y, n, m, z, a, b, c, d, l1, r1, l2, r2);
	        		
	        	} 
	        	
	        	
	        	System.out.println(ans);
	        } 
 
 
		}

		
	static long countAB(long ar1[], long ar2[], int m, int n, long x, int a, int b, long p, long q) { 
		int count = 0;
 
        int l = a, r = b; 
        
        if( (ar2[0] >= x)  ) {
        	
        } else { 
        	while (l<m && r>=0 ) {
 
        		if( ar1[l]<p ) {
        			l++;
        			continue;
        		}
        		
        		if( (ar1[l]>q) || (ar1[l]>=x) ) {
        			break;
        		}
 
        		if (ar1[l] + ar2[r] > x) {
        			r--; 
        		} else {
        			l++;
        			count += (r+1);
        		}	
 
        	} 
        }
        
        return count;
    } 
	
	static long countC(long ar1[], long ar2[], int m, int n, long x, long a, long b, long c, long d, long p, long q, long o, long s) { 
		long count = 0;
 
        long l = a, r = d; 
       
        
        long sml = countAns(ar2, n, o);
        
        	while (l<m && r>=0 ) {
 
        		if( ar1[(int) l]<p ) {
        			l++;
        			continue;
        		}
        		
        		if( ar2[(int) r]>s ) {
        			r--;
        			continue;
        		}
         		
        		if( (ar1[(int) l]>q) || (ar1[(int) l]>=x) || ( ar2[(int) r]<o ) ) {
        			break;
        		}
 
        		if (ar1[(int) l] + ar2[(int) r] > x) {
        			r--; 
        		} else {
        			l++;
        			count += (r+1)-sml;
        		}	
 
        	}
         
        
        return count;
    } 
	
	static long countAns(long arr[], int n, long x) {
		long ans=-1;
		long l=0,r=n-1;
		
		while(l<=r) {
			long mid = l + (r-l)/2;
			
			if(arr[(int) mid]<x) {
				l = mid+1;
			} else {
				ans = mid;
				r = mid-1;
			}
		} 
		
		if(ans==-1) {
			ans = l-1;
		}
		
		return ans;
	} 
 
	
} 