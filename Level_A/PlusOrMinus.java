package Level_A;

import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b == c){
                System.out.println("+");
            }
            else {
                System.out.println("-");
            }
        }
    }
}
//11
//        1 2 3
//        3 2 1
//        2 9 -7
//        3 4 7
//        1 1 2

//        1 1 0
//        3 3 6
//        9 9 18
//        9 9 0
//        1 9 -8
//        1 9 10
