/*Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
Output: TXN123456
 */

package String_Manipulation;

public class Trx_Id
{
    public static void main(String[] args)
    {
        String myStr = "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>\n";
        String str = myStr.substring(myStr.indexOf("TXN") , myStr.indexOf("TXN")+9);
        System.out.println("Transaction ID is :" +str);
    }
}
