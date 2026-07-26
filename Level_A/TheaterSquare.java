package Level_A;

import java.util.Scanner;

public class TheaterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int count_a = 0;
//        int count_b = 0;
//
//        for (int i =1; i <= a; i++){
//            count_a = c * i;
//            if ((count_a > a) || count_a/2 == a){
//                count_a = count_a / c;
//                break;
//            }
//        }
//        for (int i =1; i <= b; i++){
//            count_b = c * i;
//            if ((count_b > b) || count_b/2 == b){
//                count_b = count_b / c;
//                break;
//            }
//        }
//        System.out.println(count_a * count_b);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long count_a = ((a + c) - 1) / c;
        long count_b = ((b + c) - 1) / c;

        System.out.println(count_a * count_b);
    }
}
