//음양 더하기
#include<iostream>
#include<vector>
using namespace std;

int arr[] = { 4, 7, 12 };
bool sign[] = { true, false, true };

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int sum = 0;

	for (int i = 0; i < 3; i++) //vector 크기만큼
	{
		if (sign[i] == true)
			sum += arr[i];
		else
			sum -= arr[i];
	}
	cout << sum;
	return 0;
}

/*
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> absolutes, vector<bool> signs) {
	int sum = 0;

	for (int i = 0; i < signs.size(); i++) //vector 크기만큼
	{
		if (signs[i] == true)
			sum += absolutes[i];
		else
			sum -= absolutes[i];
	}

	return sum;
}
*/