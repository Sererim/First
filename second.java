import java.util.Scanner;

/*
 * Check if entered year is a leap year.
 */

public class second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = 0;
        boolean flow_control = true;
        String foo = null;
        while(flow_control)
        {
            System.out.println("Enter year to determine if it is a leap year.");
            year = scan.nextInt();
            if(year <= 0){
                System.out.println("Year can't be negative or zero!");
            }
            else{
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                {
                    System.out.printf("Entered year %d is a leap year.\n", year);
                }
                else{
                    System.out.printf("Entered year %d is not a leap year.\n", year);
                }
            }
            System.out.print("Do you want to terminate the program y/Y ?\n");
            foo = scan.next();
            if(foo.equals("y") || foo.equals("Y")){flow_control &= false;}
        }
        scan.close();
    }
}
