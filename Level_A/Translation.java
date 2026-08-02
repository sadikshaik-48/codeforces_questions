package Level_A;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";

        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();

        for (int i = s1.length() -1; i >= 0; i--){
            a = a + s1.charAt(i);
        }

        if (a.equals(s2)){
        System.out.println("YES");
        }
        else {
        System.out.println("NO");
        }
    }
}
//41A
