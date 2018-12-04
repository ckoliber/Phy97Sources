package ir.koliber;

import java.util.Scanner;

public class Ex2_Fac {

    public static int factorial(int n){
        int result = 1;
        for(int a = 1 ; a <= n ; a++){
            result = result * a;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fac = factorial(n);

        System.out.println(fac);
    }

}
