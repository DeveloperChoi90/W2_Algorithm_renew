//약수의 합
#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n;
	cin >> n;
	int sum = 0;
	for (int i = 1; i < n + 1; i++)
	{
		if (n % i == 0)
			sum += i;
	}

	cout << sum;
	return 0;
}
/*
#include <string>
#include <vector>

using namespace std;

int solution(int n) {
	int answer = 0;
	for (int i = 1; i < n + 1; i++)
	{
		if (n % i == 0)
			answer += i;
	}
	return answer;
}
*/