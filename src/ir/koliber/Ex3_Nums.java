package ir.koliber;

import java.util.Scanner;

public class Ex3_Nums {

    static Scanner sc = new Scanner(System.in);

    static int a;
    static int b;

    public static void get(){
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public static boolean get_number(){
        int number = sc.nextInt();
        if(number >= a && number < b){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        get();

        while (get_number()){
        }
    }

}
