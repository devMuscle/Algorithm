# 문제
최대 선 연결하기(LIS 응용)
## 풀이 방법

```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
{
	//숫자 n을 입력받는다
	int n;
	
	cin >> n;
	
	//오른쪽 숫자번호를 저장하는 배열도 생성
	int right[n+1];
	
	for(int i=1; i<=n; i++) {
		cin >> right[i];
	}
	
	//1부터 n까지의 숫자가 저장된 배열 생성
	int left[n+1];
	
	for(int i=1; i<=n; i++) {
		left[i]=i;
	}
	
	//결국 right에서 최대 부분 증가 수열 구하는것
	int LIS[n+1];
	LIS[1]=1;
	
	int result=0;
	
	for(int i=2; i<=n; i++) {
		int max_length=0;
		
		for(int j=1; j<i; j++) {
			if(right[i]>right[j] && LIS[j]>max_length) {
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
