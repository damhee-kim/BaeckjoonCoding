package codingtest.repetition;

import java.io.*;
import java.util.StringTokenizer;

/***
 * 백준 15552
 * 빠른 A+B
 */
public class Fast {

    public static void main(String[] args) throws IOException {

//        입력
//        첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
//        다음 T 줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.parseInt(br.readLine());
        for(int i = 0; i < s; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a + b) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
