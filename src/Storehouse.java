import java.util.HashMap;
import java.util.Map;

public class Storehouse {
    Map<String, Integer> storedItemPrice;


    public  Storehouse(){
        this.storedItemPrice = new HashMap<String, Integer>() {};
    }

    public void addProduct(String product, int price, int stock){
        this.storedItemPrice.put(product,price);
    }

    public int price(String product){
        if(storedItemPrice.containsKey(product)){
            return storedItemPrice.get(product);
        }
        return -99;
    }
}
