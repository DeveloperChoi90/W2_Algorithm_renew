//부족한 금액 계산하기
#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int price, money, count, ans = 0;
	long long tmp = 0;
	int result = 10;

	cin >> price >> money >> count;
	ans = price;
	for (int i = 0; i < count; i++)
	{
		tmp += price;
		price += ans;
	}

	if (tmp <= money)
		tmp = 0;
	else
		tmp = tmp - money;
	cout << tmp;
	return 0;
}
