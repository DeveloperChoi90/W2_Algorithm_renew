//소수 찾기
#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, sum = 0;
	cin >> n;

	int Allcnt = 0;;
	for (int i = 2; i < n + 1; i++)
	{
		if (i > n)
			break;
		int cnt = 0;
		for (int j = 1; j <= sqrt(i); j++)
		{
			if (cnt > 1)
				break;
			if (i % j == 0)
				cnt++;
		}
		if(cnt == 1)
			Allcnt++;
	}
	cout << Allcnt;
	return 0;												
}
/*//시간초과@@@@@@@@@@@@@@@@@@@@@@
#include <string>
#include <vector>
#include<math.h>
using namespace std;

int solution(int n) {
	int answer = 0;
	for(int i = 2; i < n+1; i++)
	{
		int cnt = 0;
		for (int j = 1; j <= sqrt(i); j++)
		{
			if(cnt > 1)
				break;
			if (i % j == 0)
				cnt++;
		}
		if (cnt == 1)
			answer++;
	}
	return answer;
}
*/