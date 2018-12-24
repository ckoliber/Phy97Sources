package ir.koliber;

import java.util.Random;
import java.util.Scanner;

public class Ex10_EvenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int length = sc.nextInt();

        int a[] = new int[length];

        for(int x = 0 ; x < length ; x++){
            a[x] = sc.nextInt();
        }

        int sum = 0;
        for(int y = 0 ; y < length ; y++){
            if(y % 2 == 0){
                sum = sum + a[y];
            }
        }

        System.out.println(sum);
    }

}
