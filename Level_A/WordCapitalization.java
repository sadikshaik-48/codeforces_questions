package Level_A;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String a = sc.next();
        String ans = a.substring(0, 1).toUpperCase() + a.substring(1);
        System.out.println(ans);
    }
}
//281A