package codingtest.oneDimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 10818
 * 최소, 최대
 */
public class MinimumAndMaximum {

    public static void main(String[] args) throws IOException {

//        문제
//        N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//        출력
//        첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

        // BufferReader 를 사용하여 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

       int index =0;
       int[] arr = new int[N];
       while (st.hasMoreTokens()) {
           arr[index] = Integer.parseInt(st.nextToken());
           index++;
       }

       Arrays.sort(arr);
       System.out.println(arr[0] + " " + arr[N - 1]);
    }
}
