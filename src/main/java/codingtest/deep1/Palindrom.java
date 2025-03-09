package codingtest.deep1;

import java.util.Scanner;

/**
 * 백준 10988
 * 팰린드롬인지 확인하기
 */
public class Palindrom {
    public static void main(String[] args) {
//        문제
//        알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
//
//        팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
//
//        level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
//
//        입력
//        첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
//
//        출력
//        첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();
        int len = str.length();
        int ans = 1;

        for(int i=0;i<len/2;i++) {
            if(str.charAt(i)!=str.charAt(len-1-i)) {
                ans = 0;
            }
        }
        System.out.println(ans);

    }
}
