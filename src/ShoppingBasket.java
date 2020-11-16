import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    public Map<String, Purchase> purchaseItems;

    public ShoppingBasket(){
        purchaseItems = new HashMap<>();

    }

    public void add(String product, int price){

                if(purchaseItems.containsKey(product)) {
                    purchaseItems.get(product).increaseAmount();
                }else{
                    purchaseItems.put(product, new Purchase(product, 1,price));
                }

            }


    public int price(){
        int wholePrice = 0;
        for(Purchase onePurchase: purchaseItems.values()){
            wholePrice+=onePurchase.price();
        }
        return wholePrice;
    }

    public void print() {
        for(Purchase onePurchase: purchaseItems.values()){
            System.out.println(onePurchase.getProduct()+ ": " + onePurchase.getAmount());
        }
    }
}
