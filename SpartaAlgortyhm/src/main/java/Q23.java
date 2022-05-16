/*
문제 설명
        자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

        제한 조건
        n은 10,000,000,000이하인 자연수입니다.*/

import java.util.*;

class Q23Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String str = Long.toString(n);
        char[] temp = new char[str.length()];

        for(int i=0; i<str.length(); i++){
            temp[i] = str.charAt(str.length()-i-1);
        }
        System.out.println(Arrays.toString(temp));

        answer = new int[temp.length];
        int count=0;
        for(int a : temp){
            answer[count] = temp[count] - '0';
            count++;
        }



        return answer;
    }
}
