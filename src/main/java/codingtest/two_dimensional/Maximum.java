package codingtest.two_dimensional;

import java.util.Scanner;

/**
 * 백준 2566
 * 최댓값
 */
public class Maximum {

    public static void main(String[] args) {

//        문제
//        <그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
//
//        예를 들어, 다음과 같이 81개의 수가 주어지면 이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.

        Scanner sc = new Scanner(System.in);
        int[][] ary = new int[9][9];
        int max = -1;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ary[i][j] = sc.nextInt();
                if (max < ary[i][j]) {
                    max = ary[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.print(row + " " + col);
        sc.close();

    }
}
