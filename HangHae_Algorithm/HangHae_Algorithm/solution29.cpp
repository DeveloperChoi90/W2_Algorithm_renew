//3���� ������
//https://primayy.tistory.com/21
#include<iostream>
#include<string>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
    cout.tie(NULL);
    string s;
    int n, answer = 0;
    cin >> n;

    while (1)      //45 -> 15 -> 5 -> 1
    {
        s += to_string(n % 3);
        if (n < 3)
            break;
        n = n / 3;
    }

    int tmp = 1;
    for (int i = s.length() - 1; i >= 0; i--) 
    {
        answer += (s[i] - 48) * tmp; //�ٷ� ���ϸ� answer�� 48�� ����. ���ڿ��̶�
        tmp *= 3;
    }
    cout << answer;
	return 0;
}