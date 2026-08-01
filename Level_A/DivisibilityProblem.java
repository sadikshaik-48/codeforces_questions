package Level_A;

import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i = 0; i < n; i++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int count = 0;
//
//            for (int j = 0; j <= a; j++){
//                if (a % b == 0) {
//                    break;
//                }
//                else if(a % b != 0)
//                count++;
//                ++a;
//
//            }
//            System.out.println(count);
//        }

        while(n-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();

            if (a % b == 0){
                System.out.println(0);
            }
            else {
                System.out.println(b - (a % b));
            }
        }
    }
}
//5
//        10 4
//        13 9
//        100 13
//        123 456
//        92 46
