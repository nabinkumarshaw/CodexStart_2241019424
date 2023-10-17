/*
 * Name: Nabin Kumar Shaw
 * Reg No: 2241019424
 * PS LINK: https://cses.fi/problemset/task/1068
 */
import java.util.Scanner;
public class Q1_1068 {
    public static void weired(long n) {
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + " ");
            }
            else {
                n = (n * 3) + 1;
                System.out.print(n + " ");
            }
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            long n = sc.nextInt();
            weired(n);
        }
    }

