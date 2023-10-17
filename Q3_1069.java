/*
 * Name: Nabin Kumar Shaw
 * Reg No: 2241019424
 * PS LINK: https://cses.fi/problemset/task/1069
 */

 import java.util.Scanner;

public class Q3_1069{
    public static int countRepeat(String s){
        int currlength=1;
        int maxlength=0;
        for(int i=1;i<s.length();i++){
           if(s.charAt(i)==s.charAt(i-1)){
               currlength++;
           }
           else{
               maxlength=Math.max(currlength,maxlength);
               currlength=1;
           }
        }
        maxlength=Math.max(currlength,maxlength);
        return maxlength;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int res=countRepeat(s);
    System.out.println(res);
    }
}
