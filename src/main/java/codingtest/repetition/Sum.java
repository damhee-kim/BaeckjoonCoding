package codingtest.repetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * 백준 8393
 * 합
 */
public class Sum {

    public static void main(String[] args) throws IOException {

//        문제
//        n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();
        int sum = 0;

        for(int i=0; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
