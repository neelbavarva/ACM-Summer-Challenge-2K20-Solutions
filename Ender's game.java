import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());  
		
		while(t--!=0) {
			int n = Integer.parseInt(br.readLine());
			String Boxes[] = br.readLine().split(" "),
				 B[] = br.readLine().split(" ");
			
			ArrayList<Integer>[] al = new ArrayList[101];
			
			for(int i=0 ; i<101 ; i++) {
				al[i] = new ArrayList<Integer>();
			}
			 
			List<Integer> ll = new ArrayList<Integer>();
			
			int box[] = new int[n];
			int b[] = new int[n];
			for(int i=0 ; i<n ; i++) {
				box[i] = Integer.parseInt(Boxes[i]);
				ll.add(box[i]);
				b[i] = Integer.parseInt(B[i]);

				al[ box[i] ].add(i+1);

			} 
			
			int ans=0;
			boolean isit = true;
			
			for(int i=0 ; i<n ; i++) {
				if(ll.contains(b[i])==false) {
					isit = false;
					break;
				} 
            }
			
			if(isit) {
				
				int ind=0;
				
				while(ind<n) { 
					ans++;
					
					for(int i=0 ; i<n ; i++) {

						for(int j=0 ; j<al[b[ind]].size() ; j++) {
							
							if( ( al[b[ind]].get(j)-1 ) >= i ) {
								i = al[b[ind]].get(j)-1;
								ind++;
								break;
							} 
							
						} 
						
						if(ind>=n) {
							break;
						}
					} 
				} 
				
			} else {
				ans = -10099;
			}
			
			System.out.println(ans);
		} 
        
    }
}
