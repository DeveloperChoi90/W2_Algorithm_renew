//제일 작은 수 제거하기
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<int>arr;
vector<int>answer;

bool desc(int x, int y)
{
	return x > y;
}

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, input;
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> input;
		arr.push_back(input);
	}


	if (arr.size() == 1)
	{
		cout << -1;
		return 0;
	}

	//sort(arr.begin(), arr.end());
	//arr.erase(arr.begin() + 0);

	//sort(arr.begin(), arr.end(), desc);

	arr.erase(min_element(arr.begin(), arr.end()));

	for (int a : arr)
		cout << a;

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

vector<int> solution(vector<int> arr) {
	vector<int> answer;

	if (arr.size() == 1)
	{
		answer.push_back(-1);
		return answer;
	}

	//arr.erase(min_element(arr.begin(), arr.end())); max_element도 있다.
	arr.erase(min_element(arr.begin(), arr.end()));

	answer = arr;
	return answer;
}
*/