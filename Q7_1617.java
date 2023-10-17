/*
 * Name: Nabin Kumar Shaw
 * Reg No: 2241019424
 * PS LINK:https://cses.fi/problemset/task/1617 
 */

import java.util.Scanner;

public class Q7_1617 {
     public static long bitStrings(long num) {
        long ans = 1;
        for(int i = 0; i < num; i++) {
            ans = ans*2 % 1000000007;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        System.out.println(bitStrings(number));
    }
}
