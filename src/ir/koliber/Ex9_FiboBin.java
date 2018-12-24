package ir.koliber;

import java.util.Random;
import java.util.Scanner;

public class Ex9_FiboBin {

    static int fib(int a, int b, int n){
        if(n > 0){
            return fib(b, a+b, n-1);
        }else{
            return b;
        }
    }

    static int bin(int i){
        return Integer.parseInt(Integer.toBinaryString(i));
    }

    static int fibobin(int i){
        int fib_i = fib(1, 1, i);
        int bin_fib_i = bin(fib_i);

        return fib_i + bin_fib_i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while(true){

            int fibobinI = fibobin(i);

            System.out.println(fibobinI);

            if(fibobinI == n){
                System.out.println("TRUE");
                break;
            }else if(fibobinI > n){
                System.out.println("FALSE");
                break;
            }

            i++;
        }

    }

}
