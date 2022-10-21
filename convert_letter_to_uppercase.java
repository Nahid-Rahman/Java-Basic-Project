/*Write a program to convert each 1st char to uppercase from a string
Input: rahim lives in sylhet
Output: Rahim Lives in Sylhet
 */

package String_Manipulation;

import java.util.Scanner;

public class convert_letter_to_uppercase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence : ");
        String mystr = sc.nextLine();
        String words [] = mystr.split(" ");

        System.out.print("Converted Sentence is: ");

        for( int i = 0; i<words.length; i++)
        {
            String firstLetter = String.valueOf(words[i].charAt(0)).toUpperCase();
            String restLetter = words[i].substring(1);
            System.out.print( firstLetter + restLetter + " ");
        }
    }
}
