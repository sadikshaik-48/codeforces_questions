package Level_A;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int UC = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.toUpperCase().charAt(i)) {
                UC++;
            }
        }
        int LC = s.length() - UC;

        if (UC > LC) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
//59A