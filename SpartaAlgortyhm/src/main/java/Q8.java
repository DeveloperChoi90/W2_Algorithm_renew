import java.util.Scanner;

class Q8Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for(int i=0; i<arr.length; i++)
        {
            answer += arr[i];
        }
        return answer/arr.length;
    }
}

public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] a = new int[count];

        for(int i=0; i<count; i++)
        {
            a[i] = sc.nextInt();
        }

        Q8Solution q8Solution = new Q8Solution();
        System.out.println(q8Solution.solution(a));
    }
}
