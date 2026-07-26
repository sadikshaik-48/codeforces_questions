package Level_A;

import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<= n-1; i++){
            arr[i] = sc.nextInt();
        }
        int hold = arr[a-1];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= hold && arr[i] > 0)
                count++;
        }
        System.out.println(count);
    }
}
