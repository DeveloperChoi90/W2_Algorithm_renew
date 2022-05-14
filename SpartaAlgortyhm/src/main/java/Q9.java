import java.util.Scanner;
class Q9Solution {
    public String solution(String phone_number) {
        String answer = "";

        String delete = phone_number.substring(0,phone_number.length()-4);
        phone_number = phone_number.substring(phone_number.length()-4 , phone_number.length());

        delete = delete.replaceAll("[0-9]","*");

        answer = delete.concat(phone_number);

        return answer;
    }
}

public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String phone_number = "";

        phone_number = sc.nextLine();
        Q9Solution q9Solution = new Q9Solution();

        System.out.println(q9Solution.solution(phone_number));

    }
}
