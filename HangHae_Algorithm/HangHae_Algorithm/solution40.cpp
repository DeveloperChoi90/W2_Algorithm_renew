//�ű� ���̵� ��õ
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

	//1�ܰ� -> �빮�ڵ��� �ҹ��ڷ� ġȯ
	for (int i = 0; i < new_id.length(); i++)
	{
		if (new_id[i] >= 65 && new_id[i] <= 90)		// 65 -> 'A' �� �ٲٱ� ����
			new_id[i] = tolower(new_id[i]);
	}

	//2�ܰ� -> ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
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

	//3�ܰ� -> ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
	for (int i = 0; i < new_id.length(); i++)
	{
		if (new_id[i] == '.' && new_id[i + 1] == '.')
		{
			new_id.erase(i, 1);
			i--;
		}
	}

	//4�ܰ� -> ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
	if (new_id.front() == '.')
		new_id.erase(0, 1);
	if(new_id.back() == '.')
		new_id.erase(new_id.size()-1, 1);

	//5�ܰ� -> �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
	if(new_id == "")
		new_id = "a";

	//6�ܰ� -> ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
			 //���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
	if(new_id.length() >= 16)
		new_id.erase(15, new_id.length() - 15);
	if (new_id.back() == '.')
		new_id.erase(new_id.size() - 1, 1);

	//7�ܰ� -> ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
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