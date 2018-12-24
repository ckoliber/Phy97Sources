package ir.koliber;

import java.util.Random;
import java.util.Scanner;

public class Ex7_DotPlot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        String name2 = sc.next();

        for(int a = 0 ; a < name1.length() ; a++){
            for(int b = 0 ; b < name2.length() ; b++){
                if(name1.charAt(a) == name2.charAt(b)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
