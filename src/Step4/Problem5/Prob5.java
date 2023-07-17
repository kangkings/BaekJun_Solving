package Step4.Problem5;

import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] basket = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = (a-1); j <= (b-1); j++) {
                basket[j] = c;
            }
        }
        //출력
        for (int i = 0; i < n; i++) {
            if (basket[i] == 0){
                System.out.printf("%d ", 0);
            }else{
                System.out.printf("%d ", basket[i]);
            }
        }
    }
}
