/*문제 설명
 String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

 제한 사항
 seoul은 길이 1 이상, 1000 이하인 배열입니다.
 seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
 Kim은 반드시 seoul 안에 포함되어 있습니다.

 입출력 예
 seoul	return
 [Jane, Kim]	김서방은 1에 있다*/
 import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;

        x = Arrays.binarySearch(seoul, "Kim");
        answer = "김서방은 " +x+"에 있다";
        System.out.println(answer);
        return answer;
    }
}


 public class FindMrKim{
    public static void main(String[] args){
        String[] seoul = {"Lee", "Kim"};
        Solution s1 = new Solution();

        s1.solution(seoul);
    }
    
}

