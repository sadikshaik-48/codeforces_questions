package Level_A;

import java.util.Scanner;
// logic correct but this need to be in strings
public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int[] arr = new int[6];

            for (int j = 0; j < 6; j++){
                arr[j] = sc.nextInt();
            }
            if (arr[0] + arr[1] + arr[2] == arr[3] + arr[4] + arr[5]){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
//5
//        213132
//        973894
//        045207
//        000000
//        055776

