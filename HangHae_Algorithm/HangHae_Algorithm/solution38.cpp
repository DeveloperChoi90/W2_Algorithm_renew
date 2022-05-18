//숫자 문자열과 영단어
#include<iostream>
#include<string>
#include<vector>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

    string s = "one4seveneight";
    string s_answer;
    string answer;
    //switch문 함수를 만들어서 만약 숫자가 아닐 때 들어가게(해당되는 문자를 받을 때까지)
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] - '0' >= 0 && s[i] - '0' <= 9)
        {
            s_answer += s[i];
        }
        else
        {
            if (s[i] == 'z') {
                answer += '0';
                i += 3;
            }
            else if (s[i] == 'o') {
                answer += '1';
                i += 2;
            }
            else if (s[i] == 't') {
                if (s.substr(i, 3) == "two") {
                    answer += '2';
                    i += 2;
                }
                else {
                    answer += '3';
                    i += 4;
                }
            }
            else if (s[i] == 'f') {
                if (s.substr(i, 4) == "four") {
                    answer += '4';
                }
                else {
                    answer += '5';
                }
                i += 3;
            }
            else if (s[i] == 's') {
                if (s.substr(i, 3) == "six") {
                    answer += '6';
                    i += 2;
                }
                else {
                    answer += '7';
                    i += 4;
                }
            }
            else if (s[i] == 'e') {
                answer += '8';
                i += 4;
            }
            else if (s[i] == 'n') {
                answer += '9';
                i += 3;
            }
        }
    }

	return 0;
    
}

//regax 라이브러리 (정규 표현식)
/*
std::regex_match 를 이용해서 정규 표현식으로 전체 문자열 패턴 매칭하기.
std::regex_search 를 이용해서 정규 표현식으로 문자열 검색하기
std::regex_replace 를 이용해서 정규 표현식으로 문자열 치환하기
*/
/* https://luv-n-interest.tistory.com/1128
* regex_replace.(대상 문자열, regex(정규식), 치환 문자열)
s = regex_replace(s, regex("zero"), "0");
s = regex_replace(s, regex("one"), "1");
s = regex_replace(s, regex("two"), "2");
                    .
                    .
                    .
                    .


vector<string>arr = {"zero", "one" ....}
if문은 - '0' 똑같고
    number.push_back(tmp);
else문에서
if((arr[j][0] == s[i]) && (arr[j][i] == s[i+1])
    char ttmp = j + '0';    -> j는 for문에서 인덱스이자 arr에서 인덱스  + '0' 해서 문자열로 바꿔서 넣어준다.   if char로 안해주고 int로 해주면 49가 들어감
    number.push_back(tmp);
    i += arr[j].size() - 1; -> one이면 현재 인덱스 +2, nine이면 현재 인덱스 + 3 을 해주는 것
    break;
*/