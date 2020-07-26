import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
     Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int index = 0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]<0 && arr[i+1]<0) {
				arr[i] *= -1;
				arr[i+1] *= -1;
				i++;
			} else {
				index = i;
				break;
			}
		}

		if(arr[index]<0 && index<n-1) {
			int temp = (arr[index])*(-1);

			if(temp>arr[index+1]) {
				arr[index] *= -1;
				arr[index+1] *= -1;
			}
		}

		long sum=0;
		BigInteger Sum = BigInteger.ZERO;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			  
			Sum = Sum.add(BigInteger.valueOf(arr[i]));
		}
		System.out.println(Sum);
    }
}
