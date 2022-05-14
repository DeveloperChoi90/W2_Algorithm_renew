//Æò±Õ ±¸ÇÏ±â
#include<iostream>
using namespace std;

int arr[] = { 1, 2, 3, 4 };

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	float sum = 0, size = sizeof(arr) / sizeof(*arr);
	for (int i = 0; i < size; i++)
		sum += arr[i];

	cout << sum / size;
	return 0;
}
/*
#include <string>
#include <vector>

using namespace std;

double solution(vector<int> arr) {
	double answer = 0;
	int size = arr.size();
	for (int i = 0; i < size; i++)
		answer += arr[i];

	answer = answer / size;

	return answer;
}
*/