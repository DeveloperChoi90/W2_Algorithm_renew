//���� ���ڿ��� ���ܾ�
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
    //switch�� �Լ��� ���� ���� ���ڰ� �ƴ� �� ����(�ش�Ǵ� ���ڸ� ���� ������)
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

//regax ���̺귯�� (���� ǥ����)
/*
std::regex_match �� �̿��ؼ� ���� ǥ�������� ��ü ���ڿ� ���� ��Ī�ϱ�.
std::regex_search �� �̿��ؼ� ���� ǥ�������� ���ڿ� �˻��ϱ�
std::regex_replace �� �̿��ؼ� ���� ǥ�������� ���ڿ� ġȯ�ϱ�
*/
/* https://luv-n-interest.tistory.com/1128
* regex_replace.(��� ���ڿ�, regex(���Խ�), ġȯ ���ڿ�)
s = regex_replace(s, regex("zero"), "0");
s = regex_replace(s, regex("one"), "1");
s = regex_replace(s, regex("two"), "2");
                    .
                    .
                    .
                    .


vector<string>arr = {"zero", "one" ....}
if���� - '0' �Ȱ���
    number.push_back(tmp);
else������
if((arr[j][0] == s[i]) && (arr[j][i] == s[i+1])
    char ttmp = j + '0';    -> j�� for������ �ε������� arr���� �ε���  + '0' �ؼ� ���ڿ��� �ٲ㼭 �־��ش�.   if char�� �����ְ� int�� ���ָ� 49�� ��
    number.push_back(tmp);
    i += arr[j].size() - 1; -> one�̸� ���� �ε��� +2, nine�̸� ���� �ε��� + 3 �� ���ִ� ��
    break;
*/