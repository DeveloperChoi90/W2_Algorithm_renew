#include<iostream>
#include<vector>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
    int a, b;           //a : �� b : ��
    cin >> a >> b;
	
    int month[12] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int day[13] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    int sum = 0;

    sum = day[a] - b;   //���� ���� ���� �����ش�

    int Imonth = 0, Idate = 0;
    int cnt = 0;

    for (int i = a+1; i < 10000; i++)
    {
        if (i == 13)        //12���� �Ѿ�� �ٽ� 1����
            a = 0; i = 1;

        if (sum > 99)
        {
            Imonth = month[i - 2];      //��, �� ���� ������ ���´�.
            Idate = day[i - 1];
            while (sum != 99)
            {
                sum--;
                cnt++;
            }
            break;
        }    
        sum += day[i];
    }
    cout << Imonth << "��" << Idate - (cnt + 1) << "��";

	return 0;
}