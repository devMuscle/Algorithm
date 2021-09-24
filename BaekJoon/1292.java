import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] arr = new int[1002];
		int val = 1;
		int sum =0;
		for(int i=0; i<=1000; i++){ 
		    for(int count=val; count>0; count--){
		        if(i>1001){
		            break;
		        }
		        arr[i] = val;
		        if(count>1){
		            i++;
		        }
		    } 
		val++;
		}
		for(int i=A-1; i<B; i++){
		    sum += arr[i];
		}
		System.out.println(sum);
	}
}
