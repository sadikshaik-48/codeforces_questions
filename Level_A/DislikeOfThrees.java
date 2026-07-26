package Level_A;

import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            int k = sc.nextInt();

            int count = 0;
            int num = 1;

            while (true) {
                if (num % 3 != 0 && num % 10 != 3) {
                    count++;
                }

                if (count == k) {
                    System.out.println(num);
                    break;
                }

                num++;
            }
        }
    }
}