import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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

/*        // problem20
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        Solution20 sol = new Solution20();
        System.out.println(sol.solution(participant,completion));*/

/*        // problem24
        long n = 121212;
        Solution24 sol = new Solution24();
        System.out.println(sol.solution(n));*/

/*        // problem27
        int n = 1;  // 6, 16, 626331
        Solution27 sol = new Solution27();
        System.out.println(sol.solution(n));
//        System.out.println(Integer.MAX_VALUE + 1);*/

/*        // problem30
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Solution30 sol = new Solution30();
        System.out.println(sol.solution(sizes));*/

/*        // problem29
        Solution29 sol = new Solution29();
        System.out.println(sol.solution(45));*/

        // problem31
        Solution31 sol = new Solution31();
        int[] arr = {1,1};
        System.out.println(sol.solution(arr));
    }
}

// TODO: 2022/05/16
class Solution33 {
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> right_nums = new ArrayList<>();
        Map<Integer, Integer> win = new HashMap<>();
        // dictionary 로또 등수
        for(int i = 0; i < win_nums.length + 1; i++){
            if(i == 0 || i == 1) win.put(i, 6);
            else win.put(i, 7 - i);
        }
        //내로또에 알아볼수 없는 숫자 카운트
        int cnt = 0;
        for(int num : lottos){
            if(num == 0) cnt++;
        }

        // 내숫자와 로또번호 비교
        for(int i = 0; i < win_nums.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]) right_nums.add(lottos[i]);
            }
        }

        int[] ans = {0, 0};
        if(right_nums.size() == 0 && Arrays.stream(lottos).max().getAsInt() == 0){   // 다 모르는 숫자일 경우
            ans[0] = win.get(6);
            ans[1] = win.get(0);
        }
        else if(right_nums.size() == 0){        // 다 틀린경우
            ans[0] = win.get(0);
            ans[1] = win.get(0);
        }
        else {
            ans[0] = win.get(cnt + right_nums.size()); // 최대: 알아볼수 없는 숫자 갯수 + 맞은 숫자 갯수
            ans[1] = win.get(right_nums.size());    // 최소 : 맞은 숫자 갯수
        }

        return ans;
    }
}

class Solution32 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}


class Solution31 {
    public int[] solution(int []arr) {
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(i < arr.length - 1){
                if(arr[i] != arr[i-1]) {
                    ans.add(arr[i]);
                }
            }else {
                if(arr[i] != ans.get(ans.size()-1)) {
                    ans.add(arr[i]);
                }
            }
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}


/**/
class Solution30 {
    public int solution(int[][] sizes) {
        List<Integer> w = new ArrayList<>();
        List<Integer> h = new ArrayList<>();

        for (int[] size : sizes) {
            if(size[0] > size[1]){
                w.add(size[1]);
                h.add(size[0]);
            }
            else {
                w.add(size[0]);
                h.add(size[1]);
            }
        }
        int max_w = Collections.max(w);
        int max_h = Collections.max(h);

        return max_w * max_h;
    }
}

class Solution29 {
    public int solution(int n) {
        StringBuilder three_notation = new StringBuilder();
        int tmp = n;
        while(true){
            if(tmp >= 3){
                three_notation.append(Integer.toString(tmp % 3));
                tmp /= 3;
            }else {
                three_notation.append(Integer.toString(tmp));
                break;
            }
        }
//        StringBuilder reverse_three_notation = new StringBuilder();
//        for (int i = 0; i < three_notation.length(); i++) {
//            reverse_three_notation.append(three_notation.charAt(three_notation.length() - i - 1));
//        }

//        int answer = 0;
//        for (int i = 0; i < three_notation.length(); i++) {
//            answer += Integer.parseInt(three_notation.substring(i,i+1)) * (int)(Math.pow(3,three_notation.length() - i - 1));
//        }
        return Integer.parseInt(three_notation.toString(),3);
    }
}


class Solution28 {
    public boolean solution(int x) {
        String s = Integer.toString(x);
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            tmp += Character.getNumericValue(s.charAt(i));
        }
        if(x % tmp == 0) return true;
        return false;
    }
}


/*1-1. 입력된 수가 짝수라면 2로 나눕니다.
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.*/
class Solution27 {
    static int cnt = 0;
    public int solution(long num) { //num을 long type으로 변경한 이유 : 재귀함수를 반복하면서 stack overflow 현상이 발생하는 것을 방지하기 위해
        long tmp = 0;
        if(num != 1){
            if(num%2 == 0){
                tmp = num / 2;
            }else {
                tmp = 3 * num + 1;
            }
            cnt+=1;
            if(tmp == 1) {
                if(cnt > 500){
                    return -1;
                }else {
                    return cnt;
                }
            } else {
                if (cnt > 500) {
                    return -1;
                } else {
                    return solution(tmp);
                }
            }
        }else return 0;
    }
}



class Solution26 {
    public int[] solution(int[] arr) {
        List<Integer> tmp = new ArrayList<>();
        for (int val : arr) {
            tmp.add(val);
        }
        tmp.remove(Collections.min(tmp));
        if(tmp.size() == 0) return new int[] { -1 };
        int[] answer = tmp.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}


class Solution25 {
    public long solution(long n) {
        long answer = 0;
        double tmp = Math.sqrt(n);
        if(tmp - Math.floor(tmp)  != 0) return -1;
        tmp = Math.pow(tmp + 1, 2);
        answer = Double.valueOf(tmp).longValue();
        return answer;
    }
}


//함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
class Solution24 {
    public long solution(long n) {
        String num = Long.toString(n);
        List<Integer> list_num = new ArrayList<>();

        for (int i = 0; i < num.length(); i++) {
            int tmp = 0;
            tmp = num.charAt(i) - '0';
            list_num.add(tmp);
        }

        int a = 0;
        Integer b = 0;

        String.valueOf(a);
        int c = (int) b;


        list_num.sort(Comparator.reverseOrder());
        int[] ans = new int[list_num.size()];
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            tmp.append(Integer.toString(ans[i]));
        }
        long answer = Long.parseLong(tmp.toString());
        return answer;
    }
}

class Solution23 {
    public int[] solution(long n) {
        String s = Long.toString(n);
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            answer[i] = Character.getNumericValue(s.charAt(s.length() - i -1));
        }
        return answer;
    }
}


class Solution22 {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            answer += Character.getNumericValue(s.charAt(i));
        }
        return answer;
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