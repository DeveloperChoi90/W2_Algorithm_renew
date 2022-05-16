/*
두 개 뽑아서 더하기
        문제 설명
        정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

        제한사항
        numbers의 길이는 2 이상 100 이하입니다.
        numbers의 모든 수는 0 이상 100 이하입니다.*/

import java.util.*;

class Q32Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }
        //리스트의 중복제거를 위해 중복을 허용하지않는 Set으로 변경후
        Set<Integer> set = new HashSet<Integer>(list);

        //다시 리스트로 바꿔준다.
        List<Integer> result = new ArrayList<Integer>(set);

        System.out.println(result);
        answer = new int[result.size()];
        int count=0;
        for(int a : result){
            answer[count] = result.get(count);
            count++;
        }
        Arrays.sort(answer);
        return answer;
    }
}
