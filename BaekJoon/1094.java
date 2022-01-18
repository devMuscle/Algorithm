import java.util.*;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int X = sc.nextInt();
		 int cnt = 0;
		 int[] arr = new int[7];
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = 1;
		 }
		 for(int i=0; i<arr.length-1; i++) {
			 arr[i+1] = arr[i]*2;
		 }
		 
		 while(X>0) {
			 for(int i=arr.length-1; i>=0; i--) {
				 if(X>=arr[i]) {
					 X-=arr[i];
					 cnt++;
				 }
			 }
		 }
		 
		 System.out.println(cnt);
	}
}
