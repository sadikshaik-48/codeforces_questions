package Level_A;

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next().toUpperCase();
        word = word.replaceAll("WUB", " ");
        word = word.replaceAll("\\s+", " ").trim();
        System.out.println(word);
    }
}

//208A