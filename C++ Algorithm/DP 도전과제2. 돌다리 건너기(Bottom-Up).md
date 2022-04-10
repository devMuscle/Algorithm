# 문제
돌다리 건너기(Bottom-Up)
## 풀이 방법
- 돌다리 3개를 건너는 방법은 돌다리 1개를 건너는 방법 + 돌다리 2개를 건너는 방법이다
- Bottom-Up이니 돌다리 3개를 건너는 방법부터 점화식을 이용해서 숫자를 점점 올라가며 구한다
- 돌다리가 n개이면 개울을 다 건너려면 n+1번을 움직여야 함으로 답은 n+1개의 돌다리를 건너는 방법과 같다

```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int brook[50];

int main()
{
	int n;
	
	cin >> n;
	
	brook[1]=1;
	brook[2]=2;
	
	for(int i=3; i<=n+1; i++) {
		brook[i]=brook[i-1]+brook[i-2];
	}
	
	cout << brook[n+1];
	
	return 0;	
}
```
