//Write a program to enter the numbers till the user wants and at the end,
// the program should display the largest and smallest numbers user entered.

package If_Else_Loop;

import java.util.Scanner;

public class Largest_Smallest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        char c;

        try
        {
            do {
                System.out.print("Enter the number ");
                num = sc.nextInt();

                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }

                System.out.print("If you do not want to continue press y, Else press 0");
                c = sc.next().charAt(0);

            }
            while (c != 'y');

        } catch (Exception e) {
            System.out.println("Invalid Input, Please try again!");
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }

}
