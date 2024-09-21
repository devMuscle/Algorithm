# 제목
네트워크 선 자르기(Bottom-Up)
## 풀이 방법
- 1m를 자르는 방법은 1가지, 2m를 자르는 방법은 2가지(1,1 과 2)이다
- 3m를 자르는 방법의 가지수는 1m를 자르는 방법의 가지수 + 2m를 자르는 방법의 가지수이다\
(1m를 자르는 가지수에서 뒤에 2m를 놓기, 2m를 자르는 가지수에서 뒤에 1m를 놓기)
- 이걸로 점화식을 세워서 푼다

**C++ 코드**
```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
{
	int net_line[50]={0};
	
	net_line[1]=1;
	net_line[2]=2;
	
	int n;
	
	cin >> n;
	
	for(int i=3; i<=n; i++) {
		net_line[i]=net_line[i-1]+net_line[i-2];
	}
	
	cout << net_line[n];
	
	return 0;	
}
```
**Java코드**

```java
import java.util.Scanner;

public class Algorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }
}
```
