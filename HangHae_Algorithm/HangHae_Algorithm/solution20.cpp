//완주하지 못한 선수
#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;

vector<string>vec1;
vector<string>vec2;
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	vec1.push_back("mislav");
	vec1.push_back("stanko");
	vec1.push_back("mislav");
	vec1.push_back("ana");

	vec2.push_back("stanko");
	vec2.push_back("mislav");
	vec2.push_back("ana");
	sort(vec1.begin(), vec1.end());
	sort(vec2.begin(), vec2.end());

	string a;
	for (int i = 0; i < vec1.size(); i++)
	{
		if (vec1[i] != vec2[i])
		{
			a = vec1[i];
			break;
		}
	}
	cout << a;

	return 0;
}
/*
#include <string>
#include <vector>
#include<algorithm>
using namespace std;

string solution(vector<string> participant, vector<string> completion) {
	string answer = "";
	sort(participant.begin(), participant.end());
	sort(completion.begin(), completion.end());

	for(int i = 0; i < participant.size(); i++)
	{
		if (participant[i] != completion[i])
		{
			answer = participant[i];
			break;
		}

	}

	return answer;
}
*/
