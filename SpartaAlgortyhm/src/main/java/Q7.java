import java.util.Scanner;

class Q7Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int sign;
        for(int i=0; i<absolutes.length; i++)
        {
            sign = (signs[i]) ? 1 : -1;
            answer += absolutes[i] * sign;
        }
        return answer;
    }
}

public class Q7 {
    public static void main(String[] args){
        int[] absolutes = new int[]{4,5,6};
        boolean[] signs = new boolean[]{true,false,true};

        Q7Solution q7Solution = new Q7Solution();

        int result = q7Solution.solution(absolutes,signs);

        System.out.println(result);
    }
}
