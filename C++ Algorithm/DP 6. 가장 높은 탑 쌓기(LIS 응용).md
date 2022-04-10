# 문제
가장 높은 탑 쌓기
## 풀이 방법
- 구조체를 이용해서 먼저 넓이를 기준으로 내림차순 정렬을 해준다
- 정렬된 배열에서 무게를 고려하여 최대 높이가 되는 경우를 구한다(LIS와 같다)

```c++
#include <iostream>
#include <bits/stdc++.h>

using namespace std; 

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

struct Block {
	int width;
	int height;
	int weight;
	
	Block(int wi, int he, int we) {
		width=wi;
		height=he;
		weight=we;
	}
	
	bool operator<(Block &b)const {
		return width>b.width;
	}
};

int main()
{
	//1. 블럭 입력받기
	int n;
	
	cin >> n;
	
	vector<Block> block_list;
	
	int width;
	int height;
	int weight;
		
	for(int i=0; i<n; i++) {
		cin >> width >> height >> weight;
		
		block_list.push_back(Block(width, height, weight));
	} 
	
	//정렬 하기 (width 내림차순) 
	sort(block_list.begin(), block_list.end());
	
	int dy[n]={0};
	dy[0]=block_list[0].height;
	
	int result=dy[0];
	
	for(int i=1; i<n; i++) {
		int max_height=0;
		
		for(int j=0; j<i; j++) {
			if(block_list[i].weight<block_list[j].weight && max_height<dy[j]) {
				max_height=dy[j];				
			}
		}
		
		dy[i]=max_height+block_list[i].height;
		
		if(result<dy[i]) {
			result=dy[i];
		}
	}
	
	cout << result;
	
	return 0;	
}
```
