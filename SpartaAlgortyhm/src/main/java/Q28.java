/*
하샤드 수
        문제 설명
        양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

        제한 조건
        x는 1 이상, 10000 이하인 정수입니다*/

class Q28Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;

        String str = Integer.toString(x);

        //계산하길 원하는 자릿수 % 10
        for(int i=str.length()-1; i>0; i--)
        {
            sum += (x/(Math.pow(10,i)))%(10);
        }
        sum += x%10;

        return answer = (x%sum == 0) ? true : false;
    }
}