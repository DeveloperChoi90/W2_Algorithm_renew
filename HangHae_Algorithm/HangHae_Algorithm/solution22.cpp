//�ڸ��� ���ϱ�
#include<iostream>
#include <string>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
    int n;
    cin >> n;

    string s = "";
    s = to_string(n);
    int answer = 0;
    for (int i = 0; i < s.length(); i++)
        answer += s[i] - 48;    //������ �����

    cout << answer;
	return 0;
}
/*
#include <iostream>
#include<string>
using namespace std;
int solution(int n)
{
    string s = "";
    s = to_string(n);
    int answer = 0;

    for(int i = 0; i < s.length(); i++)
        answer += s[i] - 48;

    return answer;
}
*/