//신규 아이디 추천
#include<iostream>
#include<string>
#include<vector>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string new_id;
	cin >> new_id;	//...!@BaT#*..y.abcdefghijklm		..Asd!.

	//1단계 -> 대문자들을 소문자로 치환
	for (int i = 0; i < new_id.length(); i++)
	{
		if (new_id[i] >= 65 && new_id[i] <= 90)		// 65 -> 'A' 로 바꾸기 가능
			new_id[i] = tolower(new_id[i]);
	}

	//2단계 -> 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
	for (int i = 0; i < new_id.length(); i++)
	{
		if ((new_id[i] >= 97 && new_id[i] <= 122) || (new_id[i] >= 48 && new_id[i] <= 57) || new_id[i] == '-' || new_id[i] == '_' || new_id[i] == '.')
		{}
		else
		{
			new_id.erase(i, 1);
			i--;
		}
	}

	//3단계 -> 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
	for (int i = 0; i < new_id.length(); i++)
	{
		if (new_id[i] == '.' && new_id[i + 1] == '.')
		{
			new_id.erase(i, 1);
			i--;
		}
	}

	//4단계 -> 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
	if (new_id.front() == '.')
		new_id.erase(0, 1);
	if(new_id.back() == '.')
		new_id.erase(new_id.size()-1, 1);

	//5단계 -> 빈 문자열이라면, new_id에 "a"를 대입합니다.
	if(new_id == "")
		new_id = "a";

	//6단계 -> 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
			 //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
	if(new_id.length() >= 16)
		new_id.erase(15, new_id.length() - 15);
	if (new_id.back() == '.')
		new_id.erase(new_id.size() - 1, 1);

	//7단계 -> 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	if (new_id.length() <= 2)
	{
		while (new_id.length() != 3)
		{
			new_id.push_back(new_id.back());
		}
	}

	cout << new_id;

	return 0;
}