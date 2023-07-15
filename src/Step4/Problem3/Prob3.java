package Step4.Problem3;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        /*
        마찬가지로 배열의 크기를 1_000_000으로 한 점이 걸림.
         */
        Scanner sc = new Scanner(System.in);
        int [] arr_n = new int[1000000];
        int n = sc.nextInt();
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            arr_n[i] = sc.nextInt();
            if(i == 0){
                min = arr_n[i];
                max = arr_n[i];
            }else {
                if (arr_n[i]<min) min = arr_n[i];
                else if (arr_n[i]>max)  max=arr_n[i];
            }
        }
        System.out.printf("%d %d",min,max);
    }
}
