package Level_A;

import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;

        if(a == b && a == c && a == d){

        }
        if (a == b || a == c || a == d){
        count++;
        }
        else if (b == c || b == d){
            count++;
        }
        else if (c == d){
            count++;
        }

        System.out.println(count);
    }
}
