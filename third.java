import java.util.Scanner;
import java.util.Arrays;
/*
 * Input:
 * val = 3
 * nums = [3, 2, 2, 3]
 * Output:
 * nums = [2, 2, 3, 3]
 */

public class third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int temp = 0;
        String foo = null;
        boolean flow_control = true;

        while(flow_control)
        {
            System.out.println("Enter the size of an array.");
            num = scan.nextInt();
            int[] nums = new int[num];

            for(int i = 0; i < num; i++)
            {
                System.out.printf("Enter %dth element of the array\n", i);
                nums[i] = scan.nextInt();
            }

            System.out.println("Enter a number to shuffle the array.\n");
            num = scan.nextInt();

            for(int i = 0; i < nums.length; i++)
            {
                if(i == 0) System.out.printf("[ ");
                System.out.printf("%d, ", nums[i]);
                if(i == nums.length - 1) System.out.printf("]\n");
            }

            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == num)
                {
                    temp = nums[i];
                    for(int j = i; j < nums.length - 1; j++)
                    {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = temp;
                }
                if(nums[0] == num){
                    temp = nums[0];
                    for(int j = 0; j < nums.length - 1; j++)
                    {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = temp;
                }
            }

            for(int i = 0; i < nums.length; i++)
            {
                if(i == 0) System.out.printf("[ ");
                System.out.printf("%d, ", nums[i]);
                if(i == nums.length - 1) System.out.printf("]\n");
            }

            System.out.print("Do you want to terminate the program y/Y ?\n");
            foo = scan.next();
            if(foo.equals("y") || foo.equals("Y")){flow_control &= false;}
        }
        scan.close();
    }
}
