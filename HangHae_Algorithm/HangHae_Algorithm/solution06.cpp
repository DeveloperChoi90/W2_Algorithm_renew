//없는 숫자 더하기
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

vector<int>vec(9);

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int sum = 0, tmp = 45;

	for (int i = 0; i < vec.size(); i++)	//대신 입력을 다 해줘야한다. 0으로라도
	{
		cin >> vec[i];
		sum += vec[i];
	}

	cout << tmp - sum;
	return 0;
}
/*
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
	int answer = 45;
	for (int i=0; i < numbers.size(); i++)
		answer-= numbers[i];
	return answer;
}
*/