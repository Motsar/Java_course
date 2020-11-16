import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    List<Purchase> purchaseItems;

    public ShoppingBasket(){
        this.purchaseItems = new ArrayList<Purchase>();

    }

    public void add(String product, int price){
        Purchase purchase =new Purchase( product, 1, price);
        purchaseItems.add(purchase);
    }
    public int price(){
        int wholePrice = 0;
        for(Purchase onePurchase: purchaseItems){
            wholePrice+=onePurchase.price();
        }
        return wholePrice;
    }
}
