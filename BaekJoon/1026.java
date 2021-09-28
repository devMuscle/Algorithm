import java.util.*;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 int[] arr_1 = new int[N];
		 int[] arr_2 = new int[N];
		 int min = 0;
		 
		 for(int i=0; i<N; i++) {
			 arr_1[i] = sc.nextInt();
		 }
		 for(int i=0; i<N; i++) {
			 arr_2[i] = sc.nextInt();
		 }

		 Arrays.sort(arr_1);
		 Arrays.sort(arr_2);
		 
		 for(int i=0; i<N/2; i++) {
			 int temp = arr_2[N-1-i];
			 arr_2[N-1-i] = arr_2[i];
			 arr_2[i] = temp;
		 }
		 
		 for(int i=0; i<N; i++) {
			 min  += arr_1[i]*arr_2[i];
		 }
		 
		 System.out.println(min);
	}
}
