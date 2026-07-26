package Level_A;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= w; i++){
            count = count + (i * k);
        }
        if (count < n){
            count = 0;
            System.out.println(count);
        }
        else {
            System.out.println(count - n);
        }
    }
}
