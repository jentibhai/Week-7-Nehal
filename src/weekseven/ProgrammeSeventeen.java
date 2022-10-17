package weekseven;

import java.util.Arrays;

public class ProgrammeSeventeen {
    public static void main(String[] args) {
        int [] m1 ={
                1111,1112,1113,1114,1115};
        String [] m2 = {"coin","Table","paper"};
        System.out.println("numeric array :"+ Arrays.toString(m1));
        Arrays.sort(m1);
        System.out.println("sorted numeric array :"+ Arrays.toString(m1));

        System.out.println("string array :"+ Arrays.toString(m2));
        Arrays.sort(m2);
        System.out.println("sorted string array :"+ Arrays.toString(m2));



    }
}
