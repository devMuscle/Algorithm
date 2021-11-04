import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
 
	    int temp = (N/100)*100;
	    
	    while(true) {
	        if(temp%F == 0) {
	            break;
	        }
	        temp++;
	    }
	    
	    String temp2= Integer.toString(temp);
	    String result = temp2.substring(temp2.length()-2); 
		
		System.out.println(result);
	}
}
