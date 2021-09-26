import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String line = sc.next();
	    int[] arr = new int[line.length()];
	    int count =0;
	    int count_0 = 0;
	    int count_1 = 0;
	    int change = 0;
	    int change_0 = 0;
	    int change_1 = 0;
	    int answer_0 = 0;
	    int answer_1 = 0;
	    
	    for(int i=0;i<line.length();i++) {
             arr[i] = line.charAt(i) - '0'; 
        }
    
	    for(int i=0; i<arr.length; i++){
	        if(arr[i]==0){
	            count_0++;
	        }
	        else if(arr[i]==1){
	            count_1++;
	        }
	    }
	    
	    for(int i=0; i<arr.length-1; i++){
	        if(arr[i]==0 && arr[i+1]==0){
	            change_0++;
	        }
	        else if(arr[i]==1 && arr[i+1]==1){
	            change_1++;
	        }
	    }
	    
	    answer_1 = count_1 - change_1;
	    answer_0 = count_0 - change_0;
	    
    	if(answer_0 > answer_1){
    	    System.out.println(answer_1);
    	}
    	else{
    	    System.out.println(answer_0);
    	}
    }
}
