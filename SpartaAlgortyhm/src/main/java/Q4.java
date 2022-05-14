import java.util.Scanner;

class MAXMIN{
    int MAX(int a , int b){
        return a >= b ? a : b;
    }

    int MIN(int a , int b){
        return a >= b ? b : a;
    }
}

class Solution4 {
    public long solution(int a, int b) {
        long answer = 0;

        int max,min;
        MAXMIN maxmin = new MAXMIN();

        max = maxmin.MAX(a,b);
        min = maxmin.MIN(a,b);

        for(int i = min; i<=max; i++){
            answer += i;
        }
        return answer;
    }
}

public class Q4 {
    public static void main(String[] args){
        Solution4 solution4 = new Solution4();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        long result = solution4.solution(a,b);

        System.out.println(result);



    }
}
