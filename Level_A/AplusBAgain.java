package Level_A;

import java.util.Scanner;

public class AplusBAgain {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            int count = 0;
            for (int j = 0; j < 2; j++) {
                count += a % 10;
                a = a / 10;
            }
            System.out.println(count);
        }
    }
}
//8
//        77
//        21
//        40
//        34
//        19
//        84
//        10
//        99
