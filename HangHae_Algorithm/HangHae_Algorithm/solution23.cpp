//자연수 뒤집어 배열로 만들기
#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;

vector<int>answer;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long n;
	cin >> n;

	string s = to_string(n);

	for (int i = 0; i < s.length(); i++)
		 answer.push_back(s[i] - 48);	//정수로 바꾸면서 넣기

	reverse(answer.begin(), answer.end());


	for (int s : answer)
		cout << s;

	return 0;
}
/*
#include <string>
#include <vector>
#include<algorithm>
using namespace std;

bool desc(int x, int y)
{
	return x > y;
}

vector<int> solution(long long n) {
	vector<int> answer;

	string s = to_string(n);

	for (int i = 0; i < s.length(); i++)
		 answer.push_back(s[i] - 48);	//정수로 바꾸면서 넣기

	reverse(answer.begin(), answer.end());

	return answer;
}
*/