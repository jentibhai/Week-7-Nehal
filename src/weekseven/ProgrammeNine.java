package weekseven;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import jdk.nashorn.internal.parser.Scanner;

public class ProgrammeNine {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        String a = letter.toString();

        switch (a.toUpperCase()){
            case "A":
                System.out.println("city is Agra");
                break;
            case "B":
                System.out.println("city is Bharuch");
                break;
            case "C":
                System.out.println("city is Calcutta");
                break;
            case "D":
                System.out.println("city is Doha");
                break;
            case "E":
                System.out.println("city is Edinburgh");
                break;
            case "F":
                System.out.println("city is Frankfurt");
                break;
            default:
                System.out.println("Error: Invalid entry");


        }


    }
}
