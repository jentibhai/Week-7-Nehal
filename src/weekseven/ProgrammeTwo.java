package weekseven;

import java.util.Scanner;

public class ProgrammeTwo {
    public static void main(String[] args) {
        int year,reminder;
        System.out.println("Enter year");
       Scanner h=new Scanner(System.in);
       year=h.nextInt();
       reminder=year%4;
       if(reminder==00){
           System.out.println("It is a leap year");

       }else{
           System.out.println("it is a not a leap year");
       }


    }


}
