package weekseven;

import java.util.Objects;
import java.util.Scanner;

public class ProgrammeEight {
    public static void main(String[] args) {
        Scanner city = new Scanner(System.in);
        System.out.println("Writefirst letter of city from (A to F only)");
        String a = city.nextLine();
        if (Objects.equals(a.toUpperCase(), "A")) ;
        {
            System.out.println("city is Agra");
        } if (Objects.equals(a.toUpperCase(), "B")) ;
        {
            System.out.println("City is Bharuch");
        } if (Objects.equals(a.toUpperCase(), "C")) ;
        {
            System.out.println("City is Culcutta");
        } if (Objects.equals(a.toUpperCase(), "D")) ;
        {
            System.out.println("City is Doha");
        } if (Objects.equals(a.toUpperCase(), "D")) ;
        {
            System.out.println("City is Edunburgh");
        } if (Objects.equals(a.toUpperCase(), "E")) ;
        {
            System.out.println("City is Frankfruit");
        } {
            System.out.println("Error:Invalod Entry");
        }

    }
}