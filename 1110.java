import java.util.*;

public class Main {
	public static int mk_num(int N) {
		int rest = N%10;
		int div = N/10;
		int num_10 = rest;
		int num_1 = (rest+div)%10;
		int n_num = num_10*10 + num_1;
		return n_num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = N;
		int cnt = 0;
		
		do {
			N = mk_num(N);
			cnt++;
		}while(N!=result);
		
		System.out.println(cnt);
	}
}
		

