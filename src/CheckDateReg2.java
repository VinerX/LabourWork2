import java.util.Scanner;

public class CheckDateReg2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String EnteredDate;
        String pattern = "(((0[1-9]|[12][0-9]|3[01])/((0[13578])|(1[02])))|((0[1-9]|[12][0-9]|30)/((0[469])|(11)))|((0[1-9]|1[0-9]|2[0-8])/(02)))/(([2-9][0-9][0-9][0-9]|19[0-9][0-9]))";

        while (true){
            EnteredDate = in.nextLine();
            if (EnteredDate.matches(pattern)) {
                System.out.println("Entered string - date");
                break;
            }

            else {
                System.out.println("Error: incorrect input. Try again");
            }
        }




    }
}
