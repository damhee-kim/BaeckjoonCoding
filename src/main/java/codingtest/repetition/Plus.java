package codingtest.repetition;

import java.io.*;

/***
 * 백준 11021
 * A+B - 7
 */
public class Plus {

    public static void main(String[] args) throws IOException {

//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            String str = br.readLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            bw.write("Case #"+(i+1)+": "+(a+b)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
