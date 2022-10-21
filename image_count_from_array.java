/*Find out how many images are in the given array:
["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
Output: 3
 */

package String_Manipulation;

public class image_count_from_array
{
    public static void main(String[] args)
    {
        String[] arr = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].contains("jpg") || arr[i].contains("png"))
            {
                count++;
            }
        }
        System.out.println("There are "+count+" images on the given array");
    }
}
