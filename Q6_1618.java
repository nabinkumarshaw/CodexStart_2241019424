/*
 * Name: Nabin Kumar Shaw
 * Reg No: 2241019424
 * PS LINK: https://cses.fi/problemset/task/1618
 */

 import java.util.Scanner;

public class Q6_1618{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long counts = 0;
        while(num != 0) {
            counts += (num/5);
            num /= 5;
        }
        System.out.println(counts);
    }
}