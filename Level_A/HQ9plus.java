package Level_A;

import java.util.Scanner;

public class HQ9plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arg = sc.nextLine();
        if (arg.contains("H") || arg.contains("Q") || arg.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

