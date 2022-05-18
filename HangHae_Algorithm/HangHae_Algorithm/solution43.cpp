//¿¹»ê
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<int> vec{ 1, 3, 2, 5, 4 };
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
    int budget = 9, answer = 0;

    sort(vec.begin(), vec.end());

    for (int i = 0; i < vec.size(); i++)
    {
        if (budget - vec[i] < 0)
            break;
        answer++;
        budget -= vec[i];
    }

    cout << answer;

	return 0;
}
/*
#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> d, int budget) {
    int answer = 0;

    sort(d.begin(), d.end());

    for (int i = 0; i < d.size(); i++)
    {
        if (budget - d[i] < 0)
            break;
        answer++;
        budget -= d[i];
    }
    return answer;
}
*/