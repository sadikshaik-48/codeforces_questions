package Level_A;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int count = a.compareToIgnoreCase(b); // Compares Unicode Values...

        if (count > 0){
            System.out.println(1);
        }
        else if (count < 0) {
            System.out.println(-1);
        }
        else if (count == 0) {
            System.out.println(0);
        }


    }
}