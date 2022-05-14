//두 정수 사이의 합
#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long a, b, sum = 0;
	cin >> a >> b;

	while (a != b)
	{
		if (a < b)
		{
			sum += a;
			a++;
		}
		else
		{
			sum += b;
			b++;
		}
	}
	cout << sum + b;
	return 0;
}