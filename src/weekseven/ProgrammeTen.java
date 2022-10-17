package weekseven;

import java.util.Scanner;

public class ProgrammeTen {
    public static void main(String[] args) {
        char a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int No1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int No2 = sc.nextInt();

        System.out.println("Enter the operator you want (+,-,*,/,:");
        a = sc.next().charAt(0);

        if (a =='+'){
            System.out.println("Addition of "+ No1 + "+" + No2 + "=" +(No1 + No2));
        } else if (a =='-');{
            System.out.println("Subtraction of "+ No1 + "-" + No2 + "=" +(No1 - No2));
        }  if (a =='*');{
            System.out.println("Multiplication of "+ No1 + "*" + No2 + "=" +(No1 - No2));
        }  if (a =='/');{
            System.out.println("Division of "+ No1 + "/" + No2 + "=" +(No1 / No2));
        } {
            System.out.println("operator are not available");
        }

    }
}
