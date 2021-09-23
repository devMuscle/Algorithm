
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
        int K=sc.nextInt();
        int[] arr = new int[N];
        Queue<Integer> queue = new LinkedList<>();
        int count=1;
        int a = 0;

        for(int i=1; i<=N; i++){
            queue.offer(i);
        }
        
        while(queue.peek()!=null){
            int num = queue.poll();
            
            if(count%K==0){
                arr[a] = num;
                a++;
            }
            else
                queue.offer(num);
            
            count++;
        }
        
        String result = "<";
        
        for(int i=0; i<arr.length; i++){
            if(i==0)
                result += arr[i];
            else
                result += (", "+arr[i]);
        }
        
        result += ">";
        
        System.out.println(result);
     
	}
}
