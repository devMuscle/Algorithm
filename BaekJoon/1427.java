import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int[] arr = new int[num.length()];

		for(int i=0;i<num.length();i++) {
            arr[i] = num.charAt(i) - '0'; 
        }
        for(int j=0; j<arr.length; j++){
            for(int i=arr.length-1; i>=1; i--){
                int count = 0;
                if(arr[i-1]<arr[i]){
                    count = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = count;
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
	}
}
