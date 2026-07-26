package Level_A;
import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int count = 0;

        while (x > 0) {
            long num = x % 10;
            if (num == 4 || num == 7) {
                count++;
            }
            x /= 10;
        }
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}