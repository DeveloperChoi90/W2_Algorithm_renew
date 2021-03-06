/*이상한 문자 만들기
        문제 설명
        문자열 s는 한 개 이상의 단어로 구성되어 있습니다.각 단어는 하나 이상의 공백문자로 구분되어 있습니다.각 단어의 짝수번째 알파벳은 대문자로,홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수,solution을 완성하세요.

        제한 사항
        문자열 전체의 짝/홀수 인덱스가 아니라,단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
        첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.*/

class Q21Solution {
    public String solution(String s) {

        String answer = "";
        int blankCheck=0;
        for(int i=0; i<s.length(); i++)
        {
            //i번째가 공백이 아니라면 
            if(s.charAt(i) != ' ')
            {
                //짝수번째는 대문자로
                if(blankCheck%2 == 0)
                {
                    //원래 대문자였으면 그대로 출력
                    if('A' <= s.charAt(i) && s.charAt(i) <='Z')
                    {
                        answer += s.charAt(i);
                    }
                    //대문자가 나와야하니까 - 0x20
                    else
                    {
                        answer += (char)(s.charAt(i)-0x20);
                    }
                }
                //홀수번째 는 소문자로
                else
                {
                    //소문자로 바꿔줘야하니 대문자가 들어오면 + 0x20
                    if('A' <= s.charAt(i) && s.charAt(i) <='Z')
                    {
                        answer += (char)(s.charAt(i)+0x20);
                    }
                    else
                    {
                        answer += s.charAt(i);
                    }
                }
                blankCheck++;
            }
            else
            {
                answer += ' ';
                blankCheck = 0;
            }
        }
        return answer;
    }
}