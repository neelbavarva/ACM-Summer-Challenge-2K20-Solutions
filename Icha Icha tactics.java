import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws IOException {
   
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t--!=0) {

        	String s = br.readLine();
        	
            Stack<Character> stack = new Stack<Character>();
			Stack<Character> ones = new Stack<Character>();
            Stack<Character> string= new Stack<Character>();
			
			boolean check = true;

			for(int i=0 ; i<s.length() ; i++) {
				char c = s.charAt(i);

				if( c!='1' && c!='{' && c!='}' ) {
					check = false;
					break;
				}
                
				if( c=='{' ) {
					stack.push(c);
					string.push(c);
					
				}
				
				if( c=='}' ) {
					
					if(stack.empty()) {
						check = false;
						break;
					}
					
					if(ones.isEmpty()) {
						check = false;
						break;
					}
					
					if( ( stack.peek()=='{' ) && (ones.peek()=='1') ) {
						stack.pop();
						ones.pop();
						
						string.pop();
						string.pop();
					} else {
						check=false;
						break;
					}
					
				 } 
				
				if( c=='1' ) {
					
					if( stack.isEmpty() ) {
						check = false;
						break;               
					}
					
					if( (stack.peek()=='{') && (string.peek()!='1') ) {
						ones.push(c);
						string.push(c);
						
					} else {
						check = false;
						break;
					}
					
				}
				
			}
			
			if( !stack.isEmpty() ) {
				check=false;
			}
			
			if( !ones.isEmpty() ) {
				check=false;
			}
			
			if(s.isEmpty()) {
				check = false;
			}

			if(check) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
            
        } 
       
    }
}
