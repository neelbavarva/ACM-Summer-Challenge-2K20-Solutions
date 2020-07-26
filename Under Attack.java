import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String[] args ) throws Exception {
          
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
   		
		int hank = Integer.parseInt(sc.readLine());
   		
   		while(hank-- != 0) {
   			String[] heisenberg = sc.readLine().split(" ");
   			int m = Integer.parseInt(heisenberg[0]);
   			int n = Integer.parseInt(heisenberg[1]);
   			
   			
   			
   			int jesse[][] = new int[m][n];
   			for(int i=0 ; i<m ; i++) {
   				String[] mi = sc.readLine().split(" ");
   				for(int j=0 ; j<n ; j++) {
   					jesse[i][j] = Integer.parseInt(mi[j]);
   					
   				} 
   			} 
   			
   			long saul=0;
   			for(int i=0 ; i<m ; i++) {
   				for(int j=0 ; j<n ; j++) {
   					
   					if(isIt(jesse, i, j)) {
   						saul += jesse[i][j];
   					}
   					
   				} 
   			} 
   			
   			System.out.println(saul);
   		} 
   		
       }

   	static boolean isIt(int arr[][], int x, int y) {
   		boolean isIt=true;
   		
   		int m=arr.length,n=arr[0].length;
   		int target = arr[x][y]; 
   		
   		if( ( (x>0)&&(x<(m-1)) ) && ( (y>0)&&(y<(n-1)) ) ) {
   			
   			for(int i=(x-1) ; i<=(x+1) ; i++) {
   				for(int j=(y-1) ; j<=(y+1) ; j++) {
   					
   					if(arr[i][j]>target) {
   						isIt = false;
   						break;
   					}
   					
   				} 
   				
   				if(!isIt) {
   					break;
   				}
   			} 
   			
   		} else if( ( (x>0)&&(x<(m-1)) ) && (y==0) ) {
   			
   			for(int i=(x-1) ; i<=(x+1) ; i++) {
   				for(int j=(y) ; j<=(y+1) ; j++) {
   					
   					if(arr[i][j]>target) {
   						isIt = false;
   						break;
   					}
   					
   				} 
   				
   				if(!isIt) {
   					break;
   				}
   			}
   			
   		} else if( ( (x>0)&&(x<(m-1)) ) && (y==(n-1)) ) {
   			
   			for(int i=(x-1) ; i<=(x+1) ; i++) {
   				for(int j=(y-1) ; j<(y+1) ; j++) {
   					
   					if(arr[i][j]>target) {
   						isIt = false;
   						break;
   					}
   					
   				} 
   				
   				if(!isIt) {
   					break;
   				}
   			}
   			
   		} else if( (x==0) && ( (y>0)&&(y<(n-1)) ) ) {
   			
   			for(int i=(x) ; i<=(x+1) ; i++) {
   				for(int j=(y-1) ; j<=(y+1) ; j++) {
   					
   					
   					
   					if(arr[i][j]>target) {
   						isIt = false;
   						break;
   					}
   					
   				} 
   				
   				if(!isIt) {
   					break;
   				}
   			}    			
   		} else if( (x==(m-1)) && ( (y>0)&&(y<(n-1)) ) ) {
   			
   			for(int i=(x-1) ; i<(x+1) ; i++) {
   				for(int j=(y-1) ; j<=(y+1) ; j++) {
   					
   					
   					
   					if(arr[i][j]>target) {
   						isIt = false;
   						break;
   					}
   					
   				} 
   				
   				if(!isIt) {
   					break;
   				}
   			} 
   			
   		} else if( (x==0) && (y==0) ) {
   			
   			for(int i=(x) ; i<=(x+1) ; i++) {
   				for(int j=(y) ; j<=(y+1) ; j++) {
   					
   					if(arr[i][j]>target) {
   						isIt = false;
   						break;
   					}
   					
   				} 
   				
   				if(!isIt) {
   					break;
   				}
   			} 
   			
   		} else if( (x==(m-1)) && (y==0) ) {
   			
   			for(int i=(x-1) ; i<(x+1) ; i++) {
   				for(int j=(y) ; j<=(y+1) ; j++) {
   					
   					if(arr[i][j]>target) {
   						isIt = false;
   						break;
   					}
   					
   				} 
   				
   				if(!isIt) {
   					break;
   				}
   			} 
   			
   		} else if( (x==0) && (y==(n-1)) ) {
   			
   			for(int i=(x) ; i<=(x+1) ; i++) {
   				for(int j=(y-1) ; j<(y+1) ; j++) {
   					
   					if(arr[i][j]>target) {
   						isIt = false;
   						break;
   					}
   					
   				} 
   				
   				if(!isIt) {
   					break;
   				}
   			} 
   			
   		} else if( (x==(m-1)) && (y==(n-1)) ) {
   			
   			for(int i=(x-1) ; i<(x+1) ; i++) {
   				for(int j=(y-1) ; j<(y+1) ; j++) {
   					
   					if(arr[i][j]>target) {
   						isIt = false;
   						break;
   					}
   					
   				}
   				
   				if(!isIt) {
   					break;
   				}
   			} 
   			
   		} 
   		
   		return isIt;
    	   

    }
}
