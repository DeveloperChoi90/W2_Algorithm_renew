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
//        List<Integer> test = new ArrayList<>(1000000);
//
//        long startTime = System.nanoTime();
//        for (int i = 0; i < test.size(); i++) {
//            test.set(i, 1);
//        }
//        long endTime = System.nanoTime();
//
//        System.out.println(String.format("for-loop: %dns", endTime - startTime));
//
//        startTime = System.nanoTime();
//        test = test.stream().map(i -> i--).collect(Collectors.toList());
//        endTime = System.nanoTime();
//
//        System.out.printf("Stream: %dns%n", endTime - startTime);
//
//        String da = "a b c d";
//        char h = 'A';
//        int j = 97;
//        String e = " ";
//        List<Character> t = new ArrayList<>();
//        for (int i = 0; i < da.length(); i++) {
//            t.add(da.charAt(i));
//        }
//        System.out.println(da.charAt(0) - 'A');
//        System.out.println((int)h);
//        System.out.println((char)j);
//        System.out.println(e.charAt(0));
//        System.out.println(Character.getType(t.get(3)));

/*        String[] strings = {"sun", "bed", "car"};
        Solution35_2 sol = new Solution35_2();
        System.out.println(Arrays.toString(sol.solution(strings, 1)));*/

        int[] nums = {1,2,7,6,4};
        Solution37 sol = new Solution37();
        System.out.println(sol.solution(nums));

    }
}

// TODO: 2022/05/17

class Solution39 {
    public String solution(String s, int n) {
        char[] ans = s.toCharArray();
        for (int i = 0; i < ans.length; i++) {
            if((int)ans[i] > 64 && (int)ans[i] < 91) {
                ans[i] = ((int)ans[i] + n > 90) ? (char)((int)ans[i] + n - 26) : (char)((int)ans[i] + n);
            }
            else if((int)ans[i] > 96 && (int)ans[i] < 123){
                ans[i] = ((int)ans[i] + n > 122) ? (char)((int)ans[i] + n - 26) : (char)((int)ans[i] + n);
            }
        }
        return String.valueOf(ans);
    }
}

class Solution37 {
    boolean[] prime = new boolean[2998]; // 소수 배열, false면 소수

    public int solution(int[] nums) {
        int cnt = 0;
        int check = 0;
        isPrime();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = (nums[i] + nums[j] + nums[k]);
                    check = 0;
                    for (int l = 2; l <= (int)Math.sqrt(sum); l++) { // (int)Math.sqrt(sum) , sum/2
                        if(sum % l == 0) {
                            check++;
                        }
                    }
                    if(check == 0) cnt++;

//                    if(!prime[sum]) cnt++;
                }
            }
        }
        return cnt;
    }

    public void isPrime(){ // 미리 배열을 만들어 소수 값을 갖지않는 방에 true를 넣어놓음
        prime[0] = prime[1] = true;
        for (int i = 2; i < (int)Math.sqrt(prime.length); i++) {
            if (!prime[i]){
                for (int j = i + i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}

/*문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.*/
class Solution36 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Integer[] tmp = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            tmp[i] = (int) s.charAt(i);
        }
        Arrays.sort(tmp, Collections.reverseOrder());
        for (Integer ch : tmp) {
            answer.append((char)(ch.intValue()));
        }
        return answer.toString();
    }
}

/*문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.*/
class Solution35_2 {
    public String[] solution(String[] strings, int n) {
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 1; j < strings.length; j++) {
                if(strings[i].charAt(n) > strings[j].charAt(n)) {

                }
                else if(strings[i].charAt(n) < strings[i+1].charAt(n)) {
                    Arrays.sort(strings, i, j, Collections.reverseOrder());
                }
                else {
                    if(strings[i].compareTo(strings[j]) > 0) {
                        Arrays.sort(strings, i, j, Collections.reverseOrder());
                    }
                    else {
                        Arrays.sort(strings, i, j);
                    }
                }
            }
        }
        return strings;
    }
}

class Solution35 {
    public String[] solution(String[] strings, int n) {
        String tmp = "";
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 1; j < strings.length; j++) {
                if(strings[i].charAt(n) > strings[j].charAt(n)){
                    tmp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = tmp;
                }
                else if (strings[i].charAt(n) == strings[j].charAt(n)){
                    if(strings[i].compareTo(strings[j]) < 0) {
                        tmp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = tmp;
                    }else {
                        tmp = strings[j];
                        strings[j] = strings[i];
                        strings[i] = tmp;
                    }
                }
            }
        }
        return strings;
    }
}


/* 1번 = 1, 2, 3, 4, 5 반복
*  2번 = 2, 1, 2, 3, 2, 4, 2, 5 반복
*  3번 = 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 반복*/
class Solution34 {
    public int[] solution(int[] answers) {
        int[] cnt = {0,0,0}; // 정답횟수 카운트
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            cnt[0] = (answers[i] == st1[i % st1.length]) ? cnt[0] + 1 : cnt[0];
            cnt[1] = (answers[i] == st2[i % st2.length]) ? cnt[1] + 1 : cnt[1];
            cnt[2] = (answers[i] == st3[i % st3.length]) ? cnt[2] + 1 : cnt[2];
        }
        int max = Arrays.stream(cnt).max().getAsInt(); // Math.max(cnt[0], Math.max(cnt[1], cnt[2]))
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if(max == cnt[i]) answer.add(i + 1);
        }
        return answer.stream().mapToInt(i->i).toArray();
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