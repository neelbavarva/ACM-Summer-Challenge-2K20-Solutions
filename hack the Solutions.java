import java.io.*;
import java.util.*;

class TestClass {

      static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 

static long mergeSort(long arr[], long array_size) 
	{ 
		long temp[] = new long[(int) array_size]; 
		return tmergeSort(arr, temp, 0, array_size - 1); 
	} 

	static long tmergeSort(long arr[], long temp[], long left, long right) 
	{ 
		long mid, inv_count = 0; 
		if (right > left) { 
			
			mid = (right + left) / 2; 

			
			inv_count = tmergeSort(arr, temp, left, mid); 
			
			inv_count += tmergeSort(arr, temp, mid + 1, right); 

			
			inv_count += merge(arr, temp, left, mid + 1, right); 
		} 
		return inv_count; 
	} 

    
	static long merge(long arr[], long temp[], long left, long mid, long right) 
	{ 
		long i, j, k; 
		long inv_count = 0; 

		i = left; 
		j = mid; 
		k = left; 
		while ((i <= mid - 1) && (j <= right)) { 
			
			if (arr[(int) i] <= arr[(int) j]) { 
				temp[(int) k++] = arr[(int) i++]; 
			} 
			else { 
				
				temp[(int) k++] = arr[(int) j++]; 
				inv_count = inv_count + (mid - i); 
			} 
		} 

        
		while (i <= mid - 1) 
			temp[(int) k++] = arr[(int) i++]; 

	    
		while (j <= right) 
			temp[(int) k++] = arr[(int) j++]; 

		for (i = left; i <= right; i++) 
			arr[(int) i] = temp[(int) i]; 

		return inv_count; 
	} 
	
	public static void main(String[] args) throws IOException {
		
	 	Reader s=new Reader(); 
        long t = s.nextLong(); 
		
		String ans="";
		for(long o=0;o<t;o++)
		{
			long n=s.nextLong();
			long arr[]=new long[(int) n];
			for(long i=0;i<n;i++)
			{
				arr[(int) i]=s.nextInt();
			}
			ans =ans + mergeSort(arr, n) + "\n";
		}
		System.out.println(ans);
    
    }
}
