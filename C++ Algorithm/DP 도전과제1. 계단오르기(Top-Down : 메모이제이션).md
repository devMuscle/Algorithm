# 제목
계단오르기(Top-Down : 메모이제이션)
## 풀이 방법
- 계단 3개를 오르는방법은 계단1개를 오르는방법 + 계단 2개를 오르는 방법이다(점화식)
- 연산의 결과를 배열에 저장해서 불필요한 중복연산은 피한다(메모이제이션)

```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int stair[50];

int stair_up(int height) {
	if(height==1 || height==2) {
		return height;
	}
	
	if(stair[height]>0) {
		return stair[height];
	}
	
	stair[height]=stair_up(height-1)+stair_up(height-2);
	
	return stair[height];
	
}

int main()
{
	int n;
	
	cin >> n;
	
	int result=stair_up(n);
	
	cout << result;
	
	return 0;	
}
```
