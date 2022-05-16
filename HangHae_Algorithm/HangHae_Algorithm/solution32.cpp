//두 개 뽑아서 더하기
#include<iostream>
#include<vector>
#include <algorithm>
using namespace std;
vector<int>vec;
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n;
	cin >> n;
	vector<int>vec(n);
	for (int i = 0; i < n; i++)
		vec.push_back(vec[i]);

	for (int i = 0; i < vec.size() - 1; i++) {
		for (int j = i + 1; j < vec.size(); j++) {
			vec.push_back(vec[i] + vec[j]);
		}
	}
	sort(vec.begin(), vec.end());
	vec.erase(unique(vec.begin(), vec.end()), vec.end());   //중복값을 뒤로 다 밀고 삭제

	for (int a : vec)
		cout << a;
	return 0;
}
/*
#include <string>
#include <vector>
#include<algorithm>

using namespace std;

vector<int> solution(vector<int> numbers) {
	vector<int> answer;

		for (int i = 0; i < numbers.size() - 1; i++)
		{
			for (int j = i + 1; j < numbers.size(); j++)
				answer.push_back(numbers[i] + numbers[j]);
		}
	sort(answer.begin(), answer.end());
	answer.erase(unique(answer.begin(), answer.end()), answer.end());
	//중복값을 뒤로 다 밀고 삭제(정렬이 되어있는 상태여야함.)

	return answer;
}
*/