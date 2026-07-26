package Level_A;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++){

            int count = 0;

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a < b){
                count++;
            }
            if (a < c){
                count++;
            }
            if (a < d){
                count++;
            }
            System.out.println(count);
        }

    }
}
//4
//        2 3 4 1
//        10000 0 1 2
//        500 600 400 300
//        0 9999 10000 9998
