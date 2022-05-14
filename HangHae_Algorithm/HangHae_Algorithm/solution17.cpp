//문자열 다루기 기본
#include<iostream>
#include<string>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
    string s;
    bool answer = true;
    cin >> s;
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] - '0' >= 0 && s[i] - '0' <= 9)
            answer = true;
        else
        {
            answer = false;
            break;
        }
    }
    cout << answer;
	return 0;
}

/*
#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;

    if(s.length() != 4 && s.length() != 6)
        return false;

    for(int i = 0; i < s.length(); i++)
    {
        if(s[i] - '0' >= 0 && s[i] - '0' <= 9)
            answer = true;
        else
        {
            answer = false;
            break;
        }

    }
    return answer;
}
*/

