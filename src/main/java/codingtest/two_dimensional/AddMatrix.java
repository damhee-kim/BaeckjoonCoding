package codingtest.two_dimensional;

import java.util.Scanner;

/**
 * 백준 2738
 * 행렬 덧셈
 */
public class AddMatrix {
    public static void main(String[] args) {
//        문제
//        N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
//
//        출력
//        첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) { // 두번쨰 행렬
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) { // 두 행렬의 1행, 2행, 3행.. 순으로
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]+" "); // 각 자리 더해서 출력
                if(j == m-1) // 각 행의 마지막 열에서 줄바꿈
                    System.out.println();
            }
        }
    }
}
