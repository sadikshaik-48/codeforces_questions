package Level_A;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int moves = x / 5;

        if (x % 5 != 0) {
            moves++;
        }

        System.out.println(moves);
    }
}