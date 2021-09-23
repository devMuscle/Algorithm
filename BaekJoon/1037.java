import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,max,min,answer;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int[] arr = new int[num];
		
		for (int i = 0 ; i < num ; i++) {
			arr[i] = sc.nextInt();		
		}
		
		max = arr[0]; 
        min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
            if(max<arr[i]) {
    	        max = arr[i];
            }
            if(min>arr[i]) {
	    	    min = arr[i];
            }
	    }
	    
	    answer=max*min;
	    System.out.println(answer);

	}    
}
