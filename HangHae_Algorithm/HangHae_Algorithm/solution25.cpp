//���� ������ �Ǻ�
#include<iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long n;
	cin >> n;

	long long l = sqrt(n); //5�� 5

	if (l * l == n)
	{
		int a = (l + 1);
		cout << a * a;
	}
	else
		cout << -1;

	return 0;
}
/*���α׷��ӽ������� math ��� �߰�
#include <string>
#include <vector>
#include<math.h>
using namespace std;

long long solution(long long n) {
	long long answer = 0;
	answer = sqrt(n); //5�� 5

	if (answer * answer == n)
	{
		long long a = (answer + 1);
		return a * a;
	}
	else
		return -1;

}
*/