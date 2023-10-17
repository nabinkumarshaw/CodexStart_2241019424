/*
 * Name: Nabin Kumar Shaw
 * Reg No: 2241019424
 * PS LINK:https://cses.fi/problemset/task/1072/
 */

public class Q8_1072 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        for(long i = 1; i <= num; i++) {
            long a = ((i*i)*(i*i-1))/2;
            long b = 4*(i-1)*(i-2);
            System.out.println(a-b);
        }
    }
}
