package weekseven;

public class ProgrammeTwenty {
    public static void main(String[] args) {
        int [] num={4,5,6};
        int toFind=3;
        boolean found = false;

        for (int n: num){
            if (n==toFind){
                found = true;
                break;
            }
        }if(found)
            System.out.println(toFind+"is Found.");
        else
            System.out.println(toFind+"is not Found");
    }

}
