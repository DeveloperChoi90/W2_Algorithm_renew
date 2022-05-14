//문자열을 정수로 바꾸기
#include<iostream>
#include<string>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int tmp;
	string s;
	cin >> s;

	tmp = stoi(s);

	cout << tmp;
	return 0;
}