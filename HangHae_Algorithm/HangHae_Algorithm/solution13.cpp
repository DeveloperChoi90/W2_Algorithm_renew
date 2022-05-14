//2016³â
#include<iostream>
#include<string>
#include<vector>
using namespace std;

string day[7] = { "FRI","SAT","SUN","MON","TUE","WEN","THU" };
int month[12] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	string answer = "";

	int a, b;		//5, 24  --- tus
	cin >> a >> b;

	int sum = 0;
	for (int i = 0; i < a-1; i++)
		sum += month[i];

	sum += b - 1;	//-1

	cout << day[sum % 7];
	return 0;
}
/*
#include <string>
#include <vector>

using namespace std;

string day[7] = { "FRI","SAT","SUN","MON","TUE","WED","THU" };
int month[12] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

string solution(int a, int b) {
	string answer = "";

	int sum = 0;
	for (int i = 0; i < a-1; i++)
		sum += month[i];

	sum += b - 1;
	answer = day[sum % 7];
	return answer;
}
*/
