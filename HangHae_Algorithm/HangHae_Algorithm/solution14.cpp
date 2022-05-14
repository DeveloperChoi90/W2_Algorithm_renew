//나누어 떨어지는 숫자배열
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<int>answer;
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	/*
	cout << 3 % 10 << '\n';		// 3
	cout << 3 % 12 << '\n';		// 3
	cout << 3 % 4 << '\n';		// 3
	cout << 3 % 3 << '\n';		// 0
	cout << 4 % 3 << '\n';		// 1
	cout << 4 % 2 << '\n';		// 0
	cout << 36 % 1 << '\n';		// 0
	*/
    int divisor = 10;
	vector<int>vec;
	vector<int>answer;
	vec.push_back(3);vec.push_back(2);vec.push_back(6);//vec.push_back(3);
    int exp = 0;
    for (int i = 0; i < vec.size(); i++)
    {
        if (vec[i] < divisor)
            exp++;
        else if (vec[i] % divisor == 0)
            answer.push_back(vec[i]);
    }

    sort(answer.begin(), answer.end());

	if (exp == answer.size())
	{
		answer.push_back(-1);
	}

	return 0;
}
/*
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
	vector<int> answer;
	int count = 0;
	for(int i = 0; i < arr.size(); i++)
	{
		if(arr[i] % divisor == 0)
			answer.push_back(arr[i]);
	}
	sort(answer.begin(), answer.end());

	if(answer.size() == 0)
		answer.push_back(-1);

	return answer;
}
*/
