package weekseven;

import java.util.Scanner;

public class ProgrameSixteen {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Input a number:");
        int n = in.nextInt();

        if (n>0)
        {
            System.out.println("Number is positive");
        }
        else if(n<0){
            System.out.println("Number is Negative" );

        }else {
            System.out.println("Number is zero");
        }
    }
}
