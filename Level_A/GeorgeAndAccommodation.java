package Level_A;

import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();

            if (p < q && (q - p) > 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
//3
//        1 10
//        0 10
//        10 10
