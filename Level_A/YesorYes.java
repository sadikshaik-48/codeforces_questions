package Level_A;

import java.util.Scanner;

public class YesorYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String b = "YES";

        for (int i = 0; i < n; i++){
            String a = sc.next();
            if (a.equalsIgnoreCase(b)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
//1703
