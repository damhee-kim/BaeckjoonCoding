package codingtest.deep1;

import java.util.Scanner;

/**
 * 백준 1157
 * 단어공부
 */
public class StudyingWords {

    public static void main(String[] args) {
//        문제
//        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//        입력
//        첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//        출력
//        첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

        Scanner sc = new Scanner(System.in);
        
        // 1. 단어 입력받고 대문자로 변환
        String str = sc.next().toUpperCase();

        // 2. 알파벳 개수를 지정할 배열(A~Z 26개)
        int[] count = new int[26];

        // 3. 문자열의 각 문자를 확인하며 등장 횟수 증가
        for(int i=0; i<str.length(); i++) {
            int num = str.charAt(i) - 'A'; // A~Z를 0~25의 인덱스로 변환
            count[num]++; // 해당 알파벳의 개수 증가
        }

        // 4. 최빈값 찾기
        int max = -1; // 최댓값을 찾기 위한 변수 (배열의 초기 값이 0이므로 -1)
        char ch = '?'; // 최빈값 문자를 저장할 변수 (초기값은 '?'로 설정)

        for(int i=0; i<count.length; i++) {
            if(count[i] > max) { // 더 큰 개수를 발견하면 갱신
                max = count[i];
                ch = (char)(i+'A'); // 숫자 인덱스를 문자로 변환
            } else if(count[i] == max) { // 최빈값이 중복되는 경우
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
