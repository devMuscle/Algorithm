# 문제
가방문제(냅색 알고리즘)
## 풀이 방법
- 다이나믹 테이블 bag을 만드는데 w무게의 보석에 대해서 bag[j]=max(bag[j], bag[j-weight]+price)이다\
(기존의 bag에 있던 값과, bag[j-weight]에 보석의 값을 더한값을 비교해서 더 큰값으로 변경한다)\
- bag[j-weight]인 이유는 보석의 값을 더하기 위해서 weight만큼의 공간이 필요하고\
  그 공간을 뺏을때 bag에 저장된 최대값을 사용하는것이다)

```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main()
{
	int n, m;
	
	cin >> n >> m;
	
	vector<int> bag(m+1, 0);
	int weight, price;
	
	for(int i=0; i<n; i++) {
		cin >> weight >> price;
		
		for(int j=weight; j<=m; j++) {
			bag[j]=max(bag[j], bag[j-weight]+price);
		}
	}
	
	cout << bag[m];
	
	return 0;	
}
```
