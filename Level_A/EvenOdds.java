package Level_A;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();

//        int[] arr = new int[n];
//        int count = 0;
//
//        for (int i = 1; i <= n; i++){
//            if (i %2 != 0){
//                arr[count] = i;
//                count++;
//            }
//        }
//
//        for (int i = 1; i <= n; i++){
//            if (i %2 == 0){
//                arr[count] = i;
//                count++;
//            }
//        }
//
//
//        for (int i = 0; i < count; i++){
//        }
//        System.out.println(arr[k - 1]);

                long n = sc.nextLong();
                long k = sc.nextLong();

                long oddCount = (n + 1) / 2;

                if (k <= oddCount) {
                    System.out.println(2 * k - 1);
                } else {
                    System.out.println(2 * (k - oddCount));
                }
    }
}
//10 ---- 3
//1,3,5,7,9,2,4,6,8,10