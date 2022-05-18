//문자열 내 마음대로 정렬하기
#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;

vector<string>strings{ "sun", "bed", "car" };
vector<string>answer;

int a;

bool desc(string x, string y)
{
	if (x[a] != y[a])
		return x[a] < y[a];
	return x < y;
}
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n;
	cin >> n;

	a = n;
	sort(strings.begin(), strings.end(), desc);

	for (int i = 0; i < strings.size(); i++)
	{
		cout << strings[i];
	}

	return 0;
}
/*
#include <string>
#include <vector>
#include<algorithm>
using namespace std;

int a;
bool desc(string x, string y)
{
	if (x[a] != y[a])
		return x[a] < y[a];
	return x < y;
}
vector<string> solution(vector<string> strings, int n) {
	vector<string> answer;

	a = n;
	sort(strings.begin(), strings.end(), desc);

	answer = strings;

	return answer;
}
*/