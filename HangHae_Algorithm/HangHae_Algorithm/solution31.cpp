//같은 숫자는 싫어
#include<iostream>
#include<vector>
using namespace std;

vector<int>vec;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int input;
	for (int i = 0; i < 7; i++)
	{
		cin >> input;
		vec.push_back(input);
	}

	for (int i = 0; i < vec.size(); i++)
	{
		if (vec[i] == vec[i + 1])
		{
			vec.erase(vec.begin() + i);
		}

	}
	return 0;
}

/*
* #include <vector>
#include <iostream>

using namespace std;
vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    
	for (int i = 0; i < arr.size(); i++)
	{
		// if (arr[i] == arr[i+1])
    		// arr.erase(arr.begin() + i);
        if(answer.size() == 0 || answer[answer.size() - 1] != arr[i]) 
            answer.push_back(arr[i]);
	}
    return answer;
}
*/