//이상한 문자 만들기
#include<iostream>
#include<string>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string s, answer;
	getline(cin, s);
	int idx = 0;
	for (int i = 0; i < s.length(); i++)
	{
		if (s[i] == ' ')
		{
			answer += " ";
			idx = 0;
			continue;
		}

		if (i % 2 == 0)
			answer += toupper(s[i]);
		else
			answer += tolower(s[i]);
		idx++;
	}
	cout << answer;

	return 0;
}
/*
#include <string>
#include <vector>

using namespace std;

string solution(string s) {
	string answer = "";
	int idx = 0;

	for(int i=0; i<s.size(); i++)
	{
		if(s[i] == ' ')
		{
			answer += " ";
			idx=0;
			continue;
		}

		if (idx % 2 == 0)
				answer += toupper(s[i]);
			else
				answer += tolower(s[i]);
		idx++;
	 }
	return answer;
}
*/

