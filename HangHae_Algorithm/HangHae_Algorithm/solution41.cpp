//¾à¼öÀÇ °³¼ö¿Í µ¡¼À
#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int left, right;
	cin >> left >> right;

	int cnt = right - left + 1;

	int ans = 0, sum = 0;

	while (1)
	{
		if (left > right)
			break;

		for (int i = 1; i < left + 1; i++)
		{
			if (left % i == 0)
				ans++;
		}
		if (ans % 2 == 0)
			sum += left;
		else
			sum -= left;

		left++;
		ans = 0;
	}

	cout << sum;
	return 0;
}
/*
#include <string>
#include <vector>

using namespace std;

int solution(int left, int right) {
	int answer = 0;
	int cnt = right - left + 1;
	int ans = 0;

	while (1)
	{
		if (left > right)
			break;

		for (int i = 1; i < left + 1; i++)
		{
			if (left % i == 0)
				ans++;
		}
		if (ans % 2 == 0)
			answer += left;
		else
			answer -= left;

		left++;
		ans = 0;
	}
	return answer;
}
*/