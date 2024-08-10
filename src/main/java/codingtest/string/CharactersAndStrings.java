package codingtest.string;

import java.util.Scanner;

/**
 * 백준 27866
 * 문자와 문자열
 */
public class CharactersAndStrings {

    public static void main(String[] args) {

        /*
         * 문제
         * 단어 S와 정수 i가 주어졌을 때,
         * S의 i번째 글자를 출력하는 프로그램을 작성하시오.
         */
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        int n = sc.nextInt() - 1;

        System.out.println(t.charAt(n));

        sc.close();
    }
}
