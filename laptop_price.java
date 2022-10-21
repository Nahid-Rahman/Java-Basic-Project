/*Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?*/

package String_Manipulation;

public class laptop_price
{
    public static void main(String[] args) {
        String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
        str = str.replaceAll("[^\\d]"," ");
        str = str.trim();
        str = str.replaceAll(" +"," ");

        int laptopPrice = Integer.parseInt( str.split(" ")[1]);
        int discountAmount = Integer.parseInt(str.split(" ")[2]);

        double discountPrice = ( laptopPrice * discountAmount ) / 100;
        double purchasePrice = laptopPrice - discountPrice;

        System.out.println("This Purchase price of laptop is: "+purchasePrice+" tk");
    }
}
