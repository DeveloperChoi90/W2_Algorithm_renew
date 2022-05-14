//Â¦¼ö¿Í È¦¼ö
#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int num;
	cin >> num;

	if (num % 2 == 0)
		cout << "Even";
	else
		cout << "Odd";
	return 0;
}