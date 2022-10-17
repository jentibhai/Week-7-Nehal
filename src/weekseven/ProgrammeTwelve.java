package weekseven;

import java.util.Scanner;

public class ProgrammeTwelve {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);

        if ((ch >='a' && ch <= 'z') || (ch >='A') && ch <= 'z'){
            System.out.println(ch + "is A Alphabet :");
        }else if (ch >='0' && ch <='9'){
            System.out.println(ch+ "is A Number :");
        }else {
            System.out.println(ch+ "is A Symbol :");
        }
    }
}
