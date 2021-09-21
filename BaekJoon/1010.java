import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0 ; i<testCase ; i++) {
		    int N,M;
		    long result1,result2,answer;
		    
		    N = sc.nextInt();
		    M = sc.nextInt();
		    
            
            
            
            if(N==M)
                answer=1;
            else{
                if(N>(M/2))
                    N=M-N;
                
                result1 = fuck(new Long(M), new Long(M-N+1));
		        result2 = fact(new Long(N));
		        answer = result1/result2;
            }
            
		    System.out.println(answer);
		}
	}
	
	public static long fact(long n) {

		if (n <= 1)
			return 1;
		else 
			return fact(n-1) * n;
	}
	
	public static long fuck(long n, long nm1) {
		if (n <= nm1)
			return nm1;
		else 
			return fuck(n-1, nm1) * n;
	}
}
