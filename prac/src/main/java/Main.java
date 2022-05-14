import javax.swing.*;
import java.util.*;
import java.util.Arrays;

// (100~91점 : A등급 , 90점~81점 : B등급 , 80점~71점 : C등급 , 그 외의 점수 : F등급)

public class Main {

    public static void main(String[] args) {
    //problem11
/*        int x = 2;
        int n = 5;
        Solution11 sol = new Solution11();
        System.out.println(sol.solution(x,n));*/

        // problem12
/*        int price = 3;
        int money = 20;
        int cnt = 4;
        Solution12 sol = new Solution12();
        System.out.println(sol.solution(price,money,cnt));*/

/*        // problem18
        String[] seoul = {"Jane", "Kim"};
        Solution18 sol = new Solution18();
        System.out.println(sol.solution(seoul));*/


//        // problem21
//        String s = "hello hello";
//        Solution21 sol = new Solution21();
//        System.out.println(sol.solution(s));
////        System.out.println(s.substring(3,4).toLowerCase());

        // problem14
//        int[] arr = {2, 36, 1, 3};
//        int div = 5;
//        Solution14 sol = new Solution14();
//        System.out.println(sol.solution(arr,div));

        // problem 16
//        String s = "Pyy";
//        Solution16 sol = new Solution16();
//        System.out.println(sol.solution(s));

/*        // problem17
        String s = "1234";
        Solution17 sol = new Solution17();
        System.out.println(sol.solution(s));*/

        // problem20
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        Solution20 sol = new Solution20();
        System.out.println(sol.solution(participant,completion));

    }
}

// TODO: 2022/05/14
class Solution21 {
    public String solution(String s) {
        StringBuilder ans = new StringBuilder();
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
           tmp = (i%2 == 0) ? s.substring(i,i+1).toUpperCase() : s.substring(i,i+1).toLowerCase();
           ans.append(tmp);
        }
        String answer = ans.toString();
        return answer;
    }
}


class Solution20 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> dict_participants = new HashMap<>();
        for (String p : participant) {
            int cnt = dict_participants.getOrDefault(p, 0); // <- dict_participants.containsKey(p) ? dict_participants.get(p) : 0;
            dict_participants.put(p, cnt + 1);
        }
        for (String c : completion) {
            int cnt = dict_participants.getOrDefault(c, 0); // <- dict_participants.containsKey(c) ? dict_participants.get(c) : 0;
            dict_participants.put(c, cnt - 1);
        }

        for (String key : dict_participants.keySet()) {
            Integer val = dict_participants.get(key);
            if(val != 0) {
                answer = key;
            }
        }
        return answer;
    }
}


class Solution19 {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += (i%2 == 0) ?  "수": "박";
        }
        return answer;
    }
}

class Solution18 {
    public String solution(String[] seoul) {
        String answer = "";
        int idx = 0;
        for (String name : seoul) {
            if (name.equals("Kim")) {  // name == "Kim" 과 차이 ?
                answer = "김서방은 " + idx + "에 있다";
                return answer;
            }
            idx++;
        }
        answer = "김서방은 없다";
        return answer;
    }
}

/*문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.*/
class Solution17 {
    public boolean solution(String s) {
        boolean answer = true;
//        System.out.println(s.length());
        if(s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if((int)s.charAt(i) - (int)'A' >= 0){
                    answer = false;
                }
            }
            return answer;
        }else return false;
    }
}


/* 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다. 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다. */

class Solution16 {
    boolean solution(String s) {
        int p_cnt = 0;
        int y_cnt = 0;
        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
            if((s.charAt(i) == 'p') || (s.charAt(i) == 'P')){
                p_cnt++;
            }
            if((s.charAt(i) == 'y') || (s.charAt(i) == 'Y')){
                y_cnt++;
            }
        }
//        System.out.println(p_cnt);
//        System.out.println(y_cnt);
        if(p_cnt == 0 && y_cnt ==0) return true;
        else {
            if(p_cnt == y_cnt) return true;
            else return false;
        }
    }
}

class Solution15 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}

// 다른사람 코드 : stream 관련해서 공부가 필요
class Solution14_2 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        return answer;
    }
}

class Solution14 {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int val : arr) {
            if(val % divisor == 0){
                tmp.add(val);
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i).intValue();
        }
        Arrays.sort(answer);

        if(answer.length == 0) {
            int[] ans = {-1};
            return ans;
        }

        return answer;
    }
}

class Solution13 {
    public String solution(int a, int b) {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int day_cnt = 0;
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        for (int i = 0; i < a; i++) {
            day_cnt += month[i];
        }
        return days[(day_cnt + b + 4) % 7];
    }
}
class Solution12 {
    public long solution(int price, int money, int count) {
        long charge = 0;
        for (int i = 1; i < count+1; i++) {
            charge += (long)price*i;
        }
        return (charge - money) > 0 ? charge - money : 0;
    }
}

class Solution11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long tmp = x;
        for (int i = 0; i < n; i++) {
            answer[i] = tmp;
            tmp += x;
        }
        return answer;
    }
}

class Solution10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}


// TODO: 2022/05/13
class Solution9 {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);
        return answer;
    }
}

class Solution8 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer / arr.length;
    }
}

class Solution7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int len = absolutes.length;
        for (int i = 0; i < len; i++) {
            if(signs[i]){
                answer += absolutes[i];
            }else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}


class Solution6 {
    public int solution(int[] numbers) {
        int total = 45;
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return total - answer;
    }
}

class Solution5 {
    public int solution(String s) {
        int answer = 0;
        return Integer.parseInt(s);
    }
}

class Solution4{
    public long solution(int a, int b) {
        long answer = 0;
        for (int i = 0; i < Math.abs(b-a)+1; i++) {
            if(a <= b){
                answer = answer + a + i;
            } else {
                answer = answer + b + i;
            }
        }
        return answer;
    }
}

class Solution3 {
    public String solution(String s) {
        String answer = "";
        int idx = s.length() / 2;

        answer = s.length() % 2 == 0 ? s.substring(idx-1, idx+1) : s.substring(idx, idx+1);

        return answer;
    }
}

class Solution2 {
    public String solution(int num) {
//        String answer = "";
//        if(num % 2 == 0){
//            answer = "Even";
//        }else {
//            answer = "Odd";
//        }
        return (num % 2 == 0) ? "Odd": "Even";
    }
}