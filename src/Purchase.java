import java.util.HashMap;
import java.util.Map;

public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.amount*this.unitPrice;
    }

    public void increaseAmount(){
        this.amount+=1;
    }

    public String getProduct(){
        return this.product;
    }

    public int getAmount(){
        return this.amount;
    }

    public String toString(){
        return product+ ": " +amount;
    }
}
