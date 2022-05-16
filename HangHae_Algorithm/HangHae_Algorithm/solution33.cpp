//로또의 최고 순위와 최저 순위
#include<iostream>
#include<vector>
using namespace std;

vector<int>lottos(6);
vector<int>win_nums(6);

int ranking(int count) {
	switch (count) {
	case 6:
		return 1;
	case 5:
		return 2;
	case 4:
		return 3;
	case 3:
		return 4;
	case 2:
		return 5;
	default:
		return 6;
	}
}

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	vector<int>answer;

	for (int i = 0; i < 6; i++)
		cin >> lottos[i] >> win_nums[i];

	int Zcnt = 0, cnt = 0;
	for (int i = 0; i < lottos.size(); i++)
	{
		if (lottos[i] == 0)
			Zcnt++;
		
		for (int j = 0; j < win_nums.size(); j++)
		{
			if (lottos[i] == win_nums[j])
			{
				cnt++;
				break;
			}
		}
	}
	answer.push_back(ranking(Zcnt + cnt));
	answer.push_back(ranking(cnt));

	for (int a : answer)
		cout << a;
	return 0;
}
/*
#include <string>
#include <vector>

using namespace std;

int ranking(int count)
{
	switch (count)
	{
	case 6:
		return 1;
	case 5:
		return 2;
	case 4:
		return 3;
	case 3:
		return 4;
	case 2:
		return 5;
	default:
		return 6;
	}
}

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
	vector<int> answer;
	int Zcnt = 0, cnt = 0;

	for (int i = 0; i < 6; i++)
	{
		if (lottos[i] == 0)
			Zcnt++;

		for (int j = 0; j < 6; j++)
		{
			if (lottos[i] == win_nums[j])
			{
				cnt++;
				break;
			}
		}
	}
	answer.push_back(ranking(Zcnt + cnt));
	answer.push_back(ranking(cnt));

	return answer;
}
*/