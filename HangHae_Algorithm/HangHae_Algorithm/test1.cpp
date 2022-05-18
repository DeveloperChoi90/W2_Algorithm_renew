//
#include<iostream>
using namespace std;
int arr1[] = { 9, 9, 9, 9, 7, 9, 8 };
int arr2[] = { 23, 23, 30, 28, 30, 23, 23 };

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int answer = 0;

	for (int i = 0; i < sizeof(arr1)/sizeof(*arr1); i++)
	{
		if (arr2[i] > 29)
			arr2[i] = 21;
		answer += arr2[i] - arr1[i];
	}

	cout << answer;
	return 0;
}