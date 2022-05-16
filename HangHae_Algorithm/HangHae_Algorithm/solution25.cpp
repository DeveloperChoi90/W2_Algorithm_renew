//정수 제곱근 판별
#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long n;
	cin >> n;

	long long l = sqrt(n); //5면 5

	if (l * l == n)
	{
		int a = (l + 1);
		cout << a * a;
	}
	else
		cout << -1;

	return 0;
}
/*프로그래머스에서는 math 헤더 추가
#include <string>
#include <vector>
#include<math.h>
using namespace std;

long long solution(long long n) {
	long long answer = 0;
	answer = sqrt(n); //5면 5

	if (answer * answer == n)
	{
		long long a = (answer + 1);
		return a * a;
	}
	else
		return -1;

}
*/