package Level_A;

import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = Math.min(a,b);
        int same =Math.abs(a-b) / 2;
        System.out.println(diff + " " + same);
    }
}
