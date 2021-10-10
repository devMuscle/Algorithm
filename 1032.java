import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] name = new String[N];
		for(int i=0; i<N; i++) {
			name[i] = sc.next();
		}
		
		int cnt=0;
		int senLng = N;
		String sen = "";
		
		for(int i=0; i<name[0].length(); i++) {
			boolean ch = true;
			for(int j=1; j<N; j++) {
				if(name[0].charAt(i)!=name[j].charAt(i)) {
					ch = false;
					break;
				}
			}
			if(ch==true) {
				sen += name[0].charAt(i);
			}
			else {
				sen += "?";
			}
		}
		
		System.out.println(sen);
	}
}
