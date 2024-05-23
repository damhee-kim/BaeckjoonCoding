package codingtest.inoutput;

import java.util.Scanner;

/**
 * 2024.05.20
 *
 * 백준 10430
 * 나머지
 */
public class TheRestTest {

//    문제
//     (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//     (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//
//    세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
//
//    입력
//    첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println((A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
