package Level_A;

import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 1 || n > 100){
            return;
        }
        int[] arr = new int[n];
        int count = 0;
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        if (arr[i] != 0 && arr[i] != 1) {
            return;
        }
    }
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                count = count;
            }
            else if (arr[i] == 1) {
                count++;
            }
            else
                break;
        }
        if (count == 0){
            System.out.println("EASY");
        }
        else
            System.out.println("HARD");
        }
}
