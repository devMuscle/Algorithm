import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    	int count = 0;
	
		if(N<100){
		    count = N;
		}
		else{
		    for(int i=100; i<=N; i++){
		        int num_100 = i/100;
	           	int num_10 = (i%100)/10;
	        	int num_1 = i%10;
	        	
	        	if(2*num_10==num_100+num_1){
	        	    count++;
	        	}
		    }
		    count+=99;
		}
		System.out.println(count);
	}
}
