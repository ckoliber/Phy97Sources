package ir.koliber;

public class Main {

    public static boolean inPoly(int a, int b){
        if(a > b){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
	// write your code here
        for(int a = 0 ; a < 10 ; a++){

            for(int b = 0 ; b < 300 ; b++){
                if(inPoly(a,b) == true){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//    =
//    == != > < >= <=
//    ! && ||

}
