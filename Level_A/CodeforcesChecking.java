package Level_A;

import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "codeforces";

        for (int i = 0; i < n; i++){
            String b = sc.next();

            if (a.contains(b)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
//1791A