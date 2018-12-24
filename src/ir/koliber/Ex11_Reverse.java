package ir.koliber;

import java.util.Random;
import java.util.Scanner;

public class Ex11_Reverse {

    static int[] reverse(int[] a){
        int[] b = new int[a.length];

        for(int x = 0 ; x < a.length ; x++){
            b[x] = a[a.length - 1 - x];
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[] a = new int[length];

        for(int x = 0 ; x < length ; x++){
            a[x] = sc.nextInt();
        }

        int[] b = reverse(a);

        for(int y = 0 ; y < length ; y++){
            System.out.println(b[y]);
        }
    }

}
