# 문제
알리바바와 40인의 도둑(Top-Down)
## 풀이 방법
- (n,n)까지의 도달할때 가중치는 (n, n-1) or (n-1, n) 까지의 가중치 + (n,n)의 비용이다
- 위의 식을 토대로 recursion을 사용하고 memoization을 사용하면 된다

```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int road[21][21];
int w_road[21][21];

int route(int row, int col) {
	if(w_road[row][col]>0) {
		return w_road[row][col];
	}
	
	if(row==1 && col==1) {
		return road[1][1];
	}
	
	if(row==1) {
		return w_road[row][col] = route(row, col-1) + road[row][col];
	}else if(col==1) {
		return	w_road[row][col] = route(row-1, col) + road[row][col];
	}else {
		return	w_road[row][col] = min(route(row-1, col), route(row, col-1)) + road[row][col];
	}
	
}

int main()
{
	int n;
	
	cin >> n;
	
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n; j++) {
			int temp;
			
			cin >> temp;
			
			road[i][j]=temp;
		}
	}

	cout << route(n, n);
	
	return 0;	
}
```
