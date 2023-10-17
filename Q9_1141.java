/*
 * Name: Nabin Kumar Shaw
 * Reg No: 2241019424
 * PS LINK:https://cses.fi/problemset/task/1072/
 */

import java.util.*;
public class Q9_1141{
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] s = new int[n];

            for (int i = 0; i < n; i++) {
                s[i] = scanner.nextInt();
            }

            int max = 0;
            int curr = 0;
            HashSet<Integer> songSet = new HashSet<>();
            int first = 0, last = 0;

            while (last < n) {
                if (!songSet.contains(s[last])) {
                    songSet.add(s[last]);
                    curr = songSet.size();
                    max = Math.max(max, curr);
                    last++;
                } else {
                    songSet.remove(s[first]);
                    first++;
                }
            }
            System.out.println(max);
        }
}