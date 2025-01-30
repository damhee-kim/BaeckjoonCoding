package codingtest.depth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 1316
 * 그룹 단어 체커
 */
public class GroupWordChecker {
    public static void main(String[] args) throws IOException {
//        문제
//        그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
//        예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//        단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다.
//        단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//
//        출력
//        첫째 줄에 그룹 단어의 개수를 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //단어의 개수 N을 입력받음
        int count = N; // 기본적으로 N개의 단어가 그룹 단어라고 가정

        for (int i = 0; i < N; i++) {
            String str = br.readLine(); // 사용자가 입력한 단어를 입력 받음

            int prev = 0; // 이전 문자를 저장할 변수 (아직 문자값이 없으므로 0으로 초기화)

            int[] alphabet = new int[26]; // 알파벳 사용 여부를 체크할 배열 (a~z: 26개)

            for (int j = 0; j < str.length(); j++) {
                int now = str.charAt(j); //문자열에서 j번째 문자를 now로 초기화
                if (prev != now) {  // 이전 문자(prev)와 현재 문자(now)가 다를 경우만 검사
                    if (alphabet[now - 97] == 0) {
                        alphabet[now - 97]++;
                        prev = now;
                    } else { // 이전에 등장한 적이 있는 문자라면 그룹 단어가 아님
                        count--;
                        break;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
