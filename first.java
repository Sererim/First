import java.util.Random;
import java.util.Scanner;

/*
 * One dimensional array 
 * find min and max 
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randint = new Random();
        String foo = null;
        int value = 1000;
        int num = 0;
        boolean flow_control = true;
        while(flow_control){
            System.out.println("Enter the size of an array");
            num = scan.nextInt();
            int[] matrix = new int[num];
            for(int i = 0; i < num; i++)
            {
                matrix[i] = randint.nextInt(value);
            }
            Arrays.sort(matrix);
            System.out.printf("Min element is %d\nMax element is %d\n", matrix[0], matrix[num-1]);
            System.out.print("Do you want to terminate the program y/Y ?\n");
            foo = scan.next();
            if(foo.equals("y") || foo.equals("Y")){flow_control &= false;}
        }
        scan.close();
    }
}
