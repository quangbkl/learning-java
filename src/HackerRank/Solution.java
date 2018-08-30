package HackerRank;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            if (x < 10) {
                System.out.println(s1 + "\t\t00" + x);
            } else if (x < 100) {
                System.out.println(s1 + "\t\t0" + x);
            } else {
                System.out.println(s1 + "\t\t" + x);
            }
        }
        System.out.println("================================");
    }
}