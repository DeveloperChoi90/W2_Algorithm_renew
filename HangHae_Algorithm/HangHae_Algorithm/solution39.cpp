//���� ��ȣ
#include<iostream>
#include<string>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string s;
	int n;
	cin >> s >> n;
	string answer = "";
	for (int i = 0; i < s.length(); i++)
	{
		if (s[i] != ' ')			//cout << (s[i] + n);
		{
			if (s[i] >= 'A' && s[i] <= 'Z')
				answer += (s[i] - 'A' + n) % 26 + 'A';	//���ĺ� ���� �� Z �������� �ٽ� A�� �� �� �ְ� ����
			else if (s[i] >= 'a' && s[i] <= 'z')
				answer += (s[i] - 'a' + n) % 26 + 'a';
		}
		else
			answer += ' ';

	}
	//�ƽ�Ű�ڵ� ����
	/*
	cout << ('A' - 'A' + n) << '\n';			//1
	cout << ('A' - 'A') << '\n';				//0
	cout << ('A' + n) << '\n';					//66
	cout << ('A' - 'A' + n) % 26 + 'A' << '\n';	//66
	cout << ('A' - 'A' + n) % 26 << '\n';		//1
	cout << (s[0] - 'A' + n) + 'A' << '\n';		//66
	cout << answer << '\n';

	int itmp = 1 + '0';
	char ctmp = 1 + '0';
	char ctmp2 = 1 + '8';
	cout << itmp << '\n';		//49
	cout << ctmp << '\n';		//1
	cout << ctmp2 << '\n';		//2
	cout << 1 + '0' << '\n';	//49

	string str, str1, str2, str3, str4, str5, str6, str7, str8;
	string a = "ABZ";
	str += ('A' - 'A' + n) % 26 + 'A';
	str1 += ('B' - 'A' + n) % 26 + 'A';
	str2 += ('B' - 'A' + n) + 'A';	// - > Z�� �ȳѾ�� �ȴ�.
	str3 += ('A'+ n) % 26 + 'A';
	str4 += ('A' - 'A' + n) % 26 + 'B';
	cout << str << '\n';	//B
	cout << str1 << '\n';	//C
	cout << str2 << '\n';	//C
	cout << str3 << '\n';	//O
	cout << str4 << '\n';	//C
	*/ 


	//���α׷��ӽ� �ڵ�
	/*
	#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
    string answer = "";
    for (int i = 0; i < s.length(); i++)
	{
		if (s[i] != ' ')			//cout << (s[i] + n);
		{
			if (s[i] >= 'A' && s[i] <= 'Z')
				answer += (s[i] - 'A' + n) % 26 + 'A';	//���ĺ� ���� �� Z �������� �ٽ� A�� �� �� �ְ� ����
			else if (s[i] >= 'a' && s[i] <= 'z')
				answer += (s[i] - 'a' + n) % 26 + 'a';
		}
		else
			answer += ' ';

	}
    return answer;
}
	*/
}