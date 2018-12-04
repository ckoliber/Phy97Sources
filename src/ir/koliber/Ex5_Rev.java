package ir.koliber;

import java.util.Scanner;

public class Ex5_Rev {

    static String reverse(String s){
        String result = "";

        for(int a = s.length() - 1 ; a >= 0 ; a--){
            result = result + s.charAt(a);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String rev = reverse(s);

        System.out.println(rev);

    }

}
