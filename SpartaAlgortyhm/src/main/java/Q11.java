/*함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.*/

class Q11Solution
{
    public long[] solution(int x, int n)
    {
        long[] answer = new long[n];
        long temp = (long)x;
        for(int i=0; i<n; i++)
        {

            answer[i] = temp;
            temp = temp + x;
        }
        return answer;
    }
    //아래처럼 햇다가 통과를 못받았는데 제한조건을 보니 int범위를 넘는게 테스트코드에 잇었던거같다.
    /*
    public long[] solution(int x, int n) 
    {
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++)
        {
            answer[i] = x*(i+1);
        }
        return answer;
    }
    */
}