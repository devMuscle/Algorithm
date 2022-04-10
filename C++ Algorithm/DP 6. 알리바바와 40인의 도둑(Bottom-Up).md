# 제목
알리바바와 40인의 도둑(Bottom-Up)
## 풀이 방법
- 이동하는데 드는 비용을 저장한 2차원 배열을 토대로 그것의 가중치를 저장하는 2차원 배열을 만든다\
(상, 좌 테두리는 이동하는데 1가지 방법밖에 없으므로 상, 좌 테두리 부터 가중치를 구하고 그것을 토대로 2차원 배열을 완성한다)
(상, 좌를 비교했을때 가중치가 낮은쪽을 선택해서 만들면 된다)

```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
{
	int n;
	
	cin >> n;
	
	int road[21][21];
	int w_road[21][21];
	
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n; j++) {
			int temp;
			
			cin >> temp;
			
			road[i][j]=temp;
			w_road[i][j]=temp;
		}
	}
	
	for(int i=2; i<=n; i++) {
		w_road[1][i]+=w_road[1][i-1];
		w_road[i][1]+=w_road[i-1][1];
	}
	
	for(int i=2; i<=n; i++) {
		for(int j=2; j<=n; j++) {
			w_road[i][j] += min(w_road[i-1][j], w_road[i][j-1]);
		}
	}
	
	cout << w_road[n][n];
	
	return 0;	
}
```
