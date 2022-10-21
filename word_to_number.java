/*Write a program that will give following output:
Input: chattogram
Output: C8M
*/

package String_Manipulation;

import java.util.Scanner;

public class word_to_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your String : ");
        String myStr = sc.nextLine();
        char ch[] = myStr.toCharArray();

        System.out.print(String.valueOf(myStr.charAt(0)).toUpperCase());
        System.out.print(ch.length - 2);
        System.out.print(String.valueOf(myStr.charAt(myStr.length() - 1)).toUpperCase());

    }
}