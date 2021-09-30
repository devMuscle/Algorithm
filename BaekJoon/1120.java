import java.util.*;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String A = sc.next();
		 String B = sc.next();
		 int result = A.length();
		 int cha = B.length() - A.length();
		 
		 for(int i=0; i<=cha; i++) {
			 int cnt =0;
			 for(int j=0; j<A.length(); j++) {
				 if(A.charAt(j) != B.charAt(j+i)) {
					 cnt++;
				 }
			 }
			 if(cnt<=result) {
				 result = cnt;
			 }
		
		 }
		 
		 System.out.println(result);
	}
}
