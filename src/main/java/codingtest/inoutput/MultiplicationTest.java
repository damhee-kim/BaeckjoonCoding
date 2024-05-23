package codingtest.inoutput;

import java.util.Scanner;

/**
 * 2024.05.20
 * 
 * 백준 2588
 * 곱셈
 */
public class MultiplicationTest {

//    문제
//            (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//
//
//
//            (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//
//    입력
//    첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 * (num2 % 10));
        System.out.println(num1 * ((num2 % 100) / 10));
        System.out.println(num1 * (num2 / 100));
        System.out.println(num1 * num2);
    }
}
