import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] chess = new char[8][8];
		int cnt =0;
		
		for(int i=0; i<8; i++) {
			String str = sc.next();
			for(int j=0; j<8; j++) {
				chess[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<8; i++) {
			if(i%2==0) {
				for(int j=0; j<8; j=j+2) {
					if(chess[i][j]=='F') {
						cnt++;
					}
				}
			}
			else {
				for(int j=1; j<8; j=j+2) {
					if(chess[i][j]=='F') {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}	
}
		

