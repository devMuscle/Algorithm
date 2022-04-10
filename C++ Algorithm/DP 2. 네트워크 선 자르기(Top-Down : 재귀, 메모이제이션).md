# 제목
네트워크 선 자르기(Top-Down : 재귀, 메모이제이션)
## 풀이 방법
- 재귀함수를 호출해서 얻은 값을 배열에 저장해서 중복되는 연산을 피한다

```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int net_line[50];

int net_cut(int length) {
	
	if(length==1 || length==2) {
		return length;
	}
	
	if(net_line[length]>0) {
		return net_line[length];
	}
	
	net_line[length] = net_cut(length-1) + net_cut(length-2);
	
	return net_line[length];
}

int main()
{
	
	int n;
	
	cin >> n;
	
	int result = net_cut(n);
	
	cout << result;
		
	return 0;	
}
```
