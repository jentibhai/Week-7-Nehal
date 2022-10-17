package weekseven;

import java.util.Scanner;

public class ProgrammeSeven {
    static int salesID, SalesAmount, basicSalary;

    static double commission ;

     static String sellersname;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sales Id :");
        salesID = sc.nextInt();
        System.out.println("Enter saler's Name :");
        sellersname = sc.next();
        System.out.println("Enter sales amount :");
        SalesAmount = sc.nextInt();
        System.out.println("Enter Basic salary :");
        basicSalary = sc.nextInt();
        if (SalesAmount >= 50000){
            commission = (SalesAmount * 35)/100;
            System.out.println("saler's commission is : +commission");
        }else if (SalesAmount >= 30000){
            commission = (SalesAmount * 20)/100;
            System.out.println("saler's commission is : +commission");
        }else if (SalesAmount >= 20000){
            commission = (SalesAmount * 10)/100;
            System.out.println("saler's commission is : +commission");
        }else if (SalesAmount >= 10000){
            commission = (SalesAmount * 5)/100;
            System.out.println("saler's commission is : +commission");
        } else if (SalesAmount >=5000){
            commission = (SalesAmount * 2)/100;
            System.out.println("saler's commission is : +commission");



        }


    }
}
