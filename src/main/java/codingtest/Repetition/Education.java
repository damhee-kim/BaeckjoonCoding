package codingtest.Repetition;

import java.util.Scanner;

/***
 * 백준 25314
 * 코딩은 체육과목 입니다
 */
public class Education {

    public static void main(String[] args) {

//        입력
//        첫 번째 줄에는 문제의 정수 N이 주어진다.

//        출력
//        혜아가 N 바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int repeat = N/4;

        for(int i=0; i<repeat; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
