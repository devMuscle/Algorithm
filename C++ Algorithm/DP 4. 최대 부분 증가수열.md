# 문제
최대 부분 증가수열
## 풀이 방법
- 숫자를 배열에 입력받고, 1번부터 n번째 배열의 숫자까지의 최대부분 증가수열을 하나씩 구해서 배열에 저장한다
- 0번째 까지의 최대부분 증가수열은 1이다(본인)
- k번째 까지의 최대부분 증가수열의 값은 그 앞쪽 자릿수 중 k번째 수보다 작은 수들 중에, 가장 큰 최대부분 증가수열의 값+1을 한 값이다
- 최대부분 증가수열이 저장된 배열에서 가장 큰 값이 정답이다

**C++ 코드**
```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
{
	int n;
	
	cin >> n;
	
	vector<int> num;
	
	for(int i=0; i<n; i++) {
		int temp;
		
		cin >> temp;
		
		num.push_back(temp);
	}
	
	vector<int> LIS;
	LIS.resize(n, 0);
	LIS[0]=1; 
	
	int result=0;
	
	for(int i=1; i<n; i++) {
		
		int max_length=0;
		//num배열을 0부터 i-1까지 돌면서 자신보다 숫자가 작은데 LIS값이 가장 큰 것에 +1한 값을 저장
		for(int j=0; j<i; j++) {
			if(num[i]>num[j] && LIS[j]>max_length) {
				max_length=LIS[j];
			}
		} 
		
		LIS[i]=max_length+1;
		
		if(LIS[i]>result) {
			result=LIS[i];
		}
	}
	
	cout << result;
	
	return 0;	
}
```
**Java 코드**
```java
import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = 1;

        for(int i = 1; i < n; i++) {
            int val = 0;

            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i]) val = Math.max(val, dp[j]);
            }

            dp[i] = val + 1;
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
```
