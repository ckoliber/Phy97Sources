package ir.koliber;

import java.util.Random;
import java.util.Scanner;

public class Ex8_Random {

    static char get_random_character(){
        int rand = (int) (Math.random() * 52);

        if(rand <= 25){
            return (char) (rand+65);
        }else{
            return (char) (rand+71);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String random = "";

        int length = sc.nextInt();


        for(int a = 0 ; a < length ; a++){
            char randomm_char = get_random_character();

            random += randomm_char;
        }

        System.out.println(random);

    }

}
