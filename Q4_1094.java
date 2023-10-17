/*
 * Name: Nabin Kumar Shaw
 * Reg No: 2241019424
 * PS LINK: https://cses.fi/problemset/task/1069
 */
import java.util.Scanner;
public class Q4_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] a = new int[(int) n];
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 1; i < n; i++) {
            if(a[i] < a[i-1]) {
                sum += Math.abs(a[i] - a[i-1]);
                a[i] = a[i-1];
            }
        }
        System.out.println(sum);
    }
}
