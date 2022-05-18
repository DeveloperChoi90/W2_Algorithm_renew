//소수 만들기
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

vector<int>vec{ 1, 2, 3, 4 };
int tmp = 0;
int answer = 0;
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	for (int i = 0; i < vec.size() - 2; i++)
	{
		for (int j = i + 1; j < vec.size() - 1; j++)
		{
			for (int k = j + 1; k < vec.size(); k++)
			{
				tmp = vec[i] + vec[j] + vec[k];

				int cnt = 0;
				for (int p = 1; p <= sqrt(tmp); p++) 
				{
					if (tmp % p == 0)
						cnt++;
				}
				if (cnt == 1)
					answer++;
			}
		}
	}

	cout << answer;
	return 0;
}