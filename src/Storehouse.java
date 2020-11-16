import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> storedItemPrice;
    private Map<String, Integer> storedItemStock;



    public  Storehouse(){
        this.storedItemPrice = new HashMap<String, Integer>() {};
        this.storedItemStock = new HashMap<String, Integer>() {};

    }

    public void addProduct(String product, int price, int stock){
        this.storedItemPrice.put(product,price);
        this.storedItemStock.put(product,stock);
    }

    public int price(String product){
        if(storedItemPrice.containsKey(product)){
            return storedItemPrice.get(product);
        }
        return -99;
    }

    public int stock(String product){
        if(storedItemStock.containsKey(product)){
            return storedItemStock.get(product);
        }
        return 0;
    }

    public boolean take(String product){
        if(storedItemStock.containsKey(product)){
            if(storedItemStock.get(product)>0){
                int newStock = storedItemStock.get(product)-1;
                this.storedItemStock.put(product,newStock);
                return true;
            }
            return false;
        }
        return false;
    }

}
