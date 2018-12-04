package ir.koliber;

import java.util.Scanner;

public class Ex4_Fib {

    static int fib(int a, int b, int n){
        if(n > 0){
            return fib(b, a+b, n-1);
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fib = fib(1, 1, n - 2);

        System.out.println(fib);
    }

}
