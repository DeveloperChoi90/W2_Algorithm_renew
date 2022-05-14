/*0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.*/
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numbers = new int[count];
        for(int i=0; i<count; i++)
        {
            numbers[i] = sc.nextInt();
        }

        int x = 1+2+3+4+5+6+7+8+9;
        for(int i=0; i<numbers.length; i++)
        {
            x = x - numbers[i];
        }
        int answer = x;
        System.out.println(answer);
    }
}
