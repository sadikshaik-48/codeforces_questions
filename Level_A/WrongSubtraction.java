package Level_A;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        for(int i = 1; i<= a; i++) {
            if (n % 10 == 0) {
                n = n / 10;
            } else if (n % 10 != 0)
                n--;
        }
        System.out.println(n);

    }
}

