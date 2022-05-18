//나머지가 1이 되는 수 찾기
#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, tmp = 0;
	cin >> n;

	for (int i = 1; i < n; i++)
	{
		if (n % i == 1)
		{
			tmp = i;
			break;
		}
	}
	cout << tmp;
	return 0;
}