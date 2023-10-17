/*
 * Name: Nabin Kumar Shaw
 * Reg No: 2241019424
 * PS LINK:https://cses.fi/problemset/task/2165/
 */

import java.util.Scanner;

public class Q5_2165 {
    public static void towerofhanoi(int n,char a,char b,char c){
        if(n==0){
            return;
        }
        towerofhanoi(n-1,a,c,b);
        System.out.println(a+" "+b);
        towerofhanoi(n-1,c,b,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int steps = (1 << N) - 1;
        System.out.println(steps);
        towerofhanoi(N, '1', '3', '2');
    }
}
