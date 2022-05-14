//수박수박수박수박수박수 ?
#include<iostream>
#include<string>
using namespace std;

string arr[] = { "수", "박" };
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, idx = 0;
	cin >> n;

	string answer = "";
	for (int i = 0; i < n; i++)
	{
		answer += arr[idx];
		idx++;

		if (idx == 2)
			idx = 0;		
	}
	cout << answer;

	return 0;
}
/*
#include <string>
#include <vector>

using namespace std;
string arr[] = { "수", "박" };
string solution(int n) {
	string answer = "";
	int idx = 0;
	for (int i = 0; i < n; i++)
	{
		answer += arr[idx];
		idx++;

		if (idx == 2)
			idx = 0;
	}
	return answer;
}
*/
