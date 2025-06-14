package codingtest.Mathematics1;

import java.io.IOException;
import java.util.Scanner;

/**
 * 백준 2745
 * 진법 변환
 */
public class BaseTransformation {

    public static void main(String[] args) throws IOException {
//        문제
//        B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
//
//        10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
//
//        A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
//
//        입력
//        첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
//
//        B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        long result = 0;

        for(int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int num;
            if(Character.isDigit(c)) {
                num = c - '0';
            } else {
                num = c - 'A' + 10;
            }
            result = result * B + num;
        }
        System.out.println(result);
    }
}
