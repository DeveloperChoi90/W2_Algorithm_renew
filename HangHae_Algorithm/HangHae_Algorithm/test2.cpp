#include<iostream>
#include<vector>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
    int a, b;           //a : 달 b : 일
    cin >> a >> b;
	
    int month[12] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int day[13] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    int sum = 0;

    sum = day[a] - b;   //먼저 남은 값을 더해준다

    int Imonth = 0, Idate = 0;
    int cnt = 0;

    for (int i = a+1; i < 10000; i++)
    {
        if (i == 13)        //12월이 넘어가면 다시 1월로
            a = 0; i = 1;

        if (sum > 99)
        {
            Imonth = month[i - 2];      //일, 월 수를 가지고 나온다.
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
    cout << Imonth << "월" << Idate - (cnt + 1) << "일";

	return 0;
}