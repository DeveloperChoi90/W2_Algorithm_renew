//문자열 내림차순으로 배치하기
#include<iostream>
#include<string>
#include<vector>
#include<functional>
#include<algorithm>
using namespace std;

vector<char>vec;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string s;
	cin >> s;

	for (int i = 0; i < s.length(); i++)
		vec.push_back(s[i]);

	sort(vec.begin(), vec.end(), greater<>());		//#include<functional>	-> greater<>()
													//https://sosohanbox.tistory.com/9
	for (int i = 0; i < vec.size(); i++)
		cout << vec[i];

	return 0;
}
/*
#include <string>
#include <vector>
#include<algorithm>
using namespace std;

bool desc(char x, char y)
{
	if (x >= 65 && x <= 90)
		return x > y;
	else
		return x > y;
}

vector<char>vec;

string solution(string s) {
	string answer = "";

	for (int i = 0; i < s.length(); i++)
		vec.push_back(s[i]);

	sort(vec.begin(), vec.end(), desc);

	for(int i = 0; i < vec.size(); i++)
		answer += vec[i];

	return answer;
}
*/