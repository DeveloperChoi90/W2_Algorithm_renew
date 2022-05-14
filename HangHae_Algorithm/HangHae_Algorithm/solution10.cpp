//Çà·ÄÀÇ µ¡¼À
#include<iostream>
#include<vector>
using namespace std;

vector<vector<int>>arr1;
vector<vector<int>>arr2;
vector<int>vec1;
vector<int>vec2;

vector<vector<int>>answer;
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	vec1.push_back(1);
	vec1.push_back(2);
	vec2.push_back(2);
	vec2.push_back(3);
	arr1.push_back(vec1);
	arr1.push_back(vec2);

	vector<int>vec1;
	vector<int>vec2;

	vec1.push_back(3);
	vec1.push_back(4);
	vec2.push_back(5);
	vec2.push_back(6);
	arr2.push_back(vec1);
	arr2.push_back(vec2);

	for (int i = 0; i < arr1.size(); i++)
	{
		vector<int>vec3;
		for (int j = 0; j < arr2[i].size(); j++)
		{
			int sum = 0;
			sum += arr1[i][j] + arr2[i][j];
			vec3.push_back(sum);
		}
		answer.push_back(vec3);
	}
}
/*
* #include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr1, vector<vector<int>> arr2) {
    vector<vector<int>> answer;
    int sum = 0;
	for (int i = 0; i < arr1.size(); i++)
	{
		vector<int>vec3;
		for (int j = 0; j < arr1[i].size(); j++)
		{		
			sum = arr1[i][j] + arr2[i][j];
			vec3.push_back(sum);
		}
		answer.push_back(vec3);
	}
    return answer;
}
*/