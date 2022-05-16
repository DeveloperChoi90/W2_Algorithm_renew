//정수 내림차순으로 배치하기
#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;

vector<int>answer;

bool desc(int x, int y)
{
	return x > y;
}

//정수로 바꾸면서 넣을 필요 없이 string상에서 넣고 stoi()나 stoll()로 감싸면서 내보내주면 됌

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long n;
	cin >> n;

	string s = to_string(n);
	int size = s.length();

	for (int i = 0; i < size; i++)
		answer.push_back(s[i] - 48);	//정수로 바꾸면서 넣기

	sort(answer.begin(), answer.end(), desc);

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
long long solution(long long n) {
	long long answer = 0;

	string s = to_string(n);

	sort(s.begin(), s.end(), desc);
	answer = stoll(s);
	return answer;
}
*/