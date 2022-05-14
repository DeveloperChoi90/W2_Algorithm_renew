import java.util.Scanner;

class Q5Solution{
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Q5Solution q5Solution = new Q5Solution();
        String s = sc.nextLine();

        System.out.println(q5Solution.solution(s));

    }
}
