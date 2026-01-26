public class ShopDetails{
public static void main(String[] args){

byte itemCategory=3;
short stockCount=150;
int itemId=432353;
long barcodeNumber=77979824739l;

float discount=5.2f;
double itemPrice=180.99;

char itemRating='B';

boolean available= true;

System.out.println("Item Category Code: " + itemCategory);
System.out.println("Stock Count: " + stockCount);
System.out.println("Item ID: " + itemId);
System.out.println("Barcode Number: " + barcodeNumber);
System.out.println("Discount: " + discount + "%");
System.out.println("Item Price: ₹" + itemPrice);
System.out.println("Item Rating: " + itemRating);
System.out.println("Is Item Available: " + available);
}
}