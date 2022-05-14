import java.util.Scanner;
class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        //길이가 홀수
        if(length%2 !=0)
        {
            answer = s.substring(length/2,length/2+1);
        }
        //길이가 짝수
        else
        {
            answer = s.substring(length/2-1,length/2+1);
        }

        return answer;
    }
}
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution s = new Solution();
        System.out.println(s.solution(str));
    }
}

