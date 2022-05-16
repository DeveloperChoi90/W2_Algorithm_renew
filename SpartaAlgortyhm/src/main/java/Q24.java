/*
정수 내림차순으로 배치하기
        문제 설명
        함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

        제한 조건
        n은 1이상 8000000000 이하인 자연수입니다.*/

import java.util.Arrays;

class Q24Solution {
    public long solution(long n) {
        long answer = 0;

        String temp = Long.toString(n);
        long[] a = new long[temp.length()];

        for(int i=0; i<temp.length(); i++){
            a[i] = temp.charAt(i) - '0';
        }
        long b;

        //bubble sort
        for(int i=a.length-1 ; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j] < a[j+1])
                {
                    b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }
            }
        }
        for(int i=0; i<a.length; i++)
        {
            answer += a[i]*Math.pow(10,a.length-i-1);
        }
        return answer;
    }
}
