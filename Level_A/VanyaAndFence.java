package Level_A;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 1000){
            return;
        }
        int[] arr = new int[n];
        int h = sc.nextInt();
        if (h < 1 || h > 1000){
            return;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            for(int i = 0; i < n; i++){


            if (arr[i] <= h){
                count++;
            } else if (arr[i] > h) {
                count = count+ 2;
            }
        }
        System.out.println(count);
    }
}
