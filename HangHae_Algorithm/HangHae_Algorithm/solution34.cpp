//모의고사
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	vector<int>vec1{ 1, 2, 3, 4, 5 };
	vector<int>vec2{ 2, 1, 2, 3, 2, 4, 2, 5 };
	vector<int>vec3{ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

	vector<int>answerjjap;
	vector<int>answer;
	vector<int>vec4{ 1, 3, 2, 4, 2 };

	int cnt1 = 0, cnt2 = 0, cnt3 = 0;
	for (int i = 0; i < vec4.size(); i++)		//1. else if로하면 왜 안될까? 2. i%5, i%8, i%10 한 이유 -> vec4 사이즈가 5 이상일 경우를 생각해서.
	{
		if (vec1[i%5] == vec4[i])
			cnt1++;
		if (vec2[i%8] == vec4[i])
			cnt2++;
		if (vec3[i%10] == vec4[i])
			cnt3++;
	}
	answerjjap.assign({ cnt1, cnt2, cnt3 });

	int boss = 0;
	boss = max(max(cnt1, cnt2), cnt3);
	
	for (int i = 0; i < answerjjap.size(); i++)
	{
		if (answerjjap[i] == boss)
			answer.push_back(i+1);
	}
	sort(answer.begin(), answer.end());

	for (int a : answer)
		cout << a;
	return 0;
}
/*
#include <string>
#include <vector>
#include<algorithm>
using namespace std;

vector<int> solution(vector<int> answers) {
	vector<int> answer;
	vector<int>vec1{ 1, 2, 3, 4, 5 };
	vector<int>vec2{ 2, 1, 2, 3, 2, 4, 2, 5 };
	vector<int>vec3{ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

	vector<int>answerjjap;

	int cnt1 = 0, cnt2 = 0, cnt3 = 0;
	for (int i = 0; i < answers.size(); i++)
	{
		if (vec1[i%5] == answers[i])
			cnt1++;
		if (vec2[i%8] == answers[i])
			cnt2++;
		if (vec3[i%10] == answers[i])
			cnt3++;
	}
	answerjjap.assign({ cnt1, cnt2, cnt3 });

	int boss = 0;
	boss = max(max(cnt1, cnt2), cnt3);

	for (int i = 0; i < answerjjap.size(); i++)
	{
		if (answerjjap[i] == boss)
			answer.push_back(i+1);
	}
	sort(answer.begin(), answer.end());
	return answer;
}
*/