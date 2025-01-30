package codingtest.stringTest;

import java.util.Scanner;

/**
 * 백준 10809
 * 알파벳 찾기
 */
public class FindThelAphabet {
    public static void main(String[] args) {
        //        문제
        //        알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
        //        포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
        //
        //        입력
        //        첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
        //
        //        출력
        //        각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
        //        만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int[] arr = new int[26];

        for(int i=0;i<arr.length;i++) {
            arr[i] = -1;
        }

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(arr[c-'a'] == -1) {
                arr[c-'a'] = i;
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
