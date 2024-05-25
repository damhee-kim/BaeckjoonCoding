package codingtest.Repetition;

import java.util.Scanner;

/***
 * 백준 2438
 * 별찍기 - 1,2
 */
public class Star {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // 별찍기 1
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 별찍기 2
        for(int i=n; i>0; i--) {
            for(int j=1; j<=n; j++) {
                if(j>=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
