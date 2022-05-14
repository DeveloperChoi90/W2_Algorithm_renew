/*
문제 설명
        2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

        입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

        제한 조건
        2016년은 윤년입니다.
        2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
*/

class Q13Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        //풀이방법1 : 1월1일을 요일 배열에서 0번 인덱스로 설정
        //그 후 입력받은 몇월 몇일이 1월1일과 몇일 차이나는지 계산
        //이를 %7해서 요일 출력

        //a월 까지의 요일수를 보관하기위한 변수
        int monthSum = 0;

        //a-1월까지의 총 요일수를 저장
        for(int i=1; i<a; i++)
        {
            //8월 이전에는 홀수월이 31일까지
            if(i<8)
            {
                if(i%2 != 0)
                {
                    monthSum += 31;
                }
                else
                {
                    if(i == 2) monthSum += 29;
                    else monthSum += 30;
                }
            }
            //8월부터는 짝수월이 31일까지
            else
            {
                if(i%2 != 0)
                {
                    monthSum += 30;
                }
                else
                {
                    monthSum += 31;
                }
            }
        }

        //풀고나서 깨달았는데 생각해보니 모든 일수의 합도 배열로 설정하면 코드수를 많이 줄일 수 있을거같다.
        answer = day[(monthSum+b-1)%7];




        return answer;
    }
}