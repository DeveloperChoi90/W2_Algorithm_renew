//최소 직사각형
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

vector<vector<int>> sizes;
vector<int>vec1;
vector<int>vec2;
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int input;
	sizes.resize(4);
	for (int i = 0; i < sizes.size(); i++)
	{
		for (int j = 0; j < 2; j++)
		{
			cin >> input;
			sizes[i].push_back(input);

			sort(sizes[i].begin(), sizes[i].end());
		}
		vec1.push_back(sizes[i].front());
		vec2.push_back(sizes[i].back());
	}
	sort(vec1.begin(), vec1.end());
	sort(vec2.begin(), vec2.end());
	
	cout << vec1.back() * vec2.back();

	return 0;
}

/*
#include <string>
#include <vector>
#include<algorithm>
using namespace std;

vector<int>vec1;
vector<int>vec2;
int solution(vector<vector<int>> sizes) {
	int answer = 0;

	for (int i = 0; i < sizes.size(); i++)
	{
		for (int j = 0; j < 2; j++)
		{
			sort(sizes[i].begin(), sizes[i].end());
		}
		vec1.push_back(sizes[i].front());
		vec2.push_back(sizes[i].back());
	}
	sort(vec1.begin(), vec1.end());
	sort(vec2.begin(), vec2.end());

	answer = vec1.back() * vec2.back();

	return answer;
}
*/
/*
	int w = 0, h = 0;

	for (int i = 0; i < sizes.size(); i++)
	{
		w = max(w, max(sizes[i][0], sizes[i][1]));
		h = max(h, min(sizes[i][0], sizes[i][1]));
	}
*/