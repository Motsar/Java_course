import java.text.DecimalFormat;
import java.util.ArrayList;

public class Burger {
    private String name;
    private String meatType;
    private String breadType;
    private double price;
    private ArrayList<String> Supplement = new ArrayList<>();
    private double supplementPrice;
    private ArrayList<String> addedSupplement = new ArrayList<>();

    public Burger(String nimi, String lihaTüüp, String saiaTüüp, double hind){
        this.name=nimi;
        this.meatType=lihaTüüp;
        this.breadType=saiaTüüp;
        this.price=hind;
    }

    public Burger(String nimi, String lihaTüüp, double hind){
        this.name=nimi;
        this.meatType=lihaTüüp;
        this.breadType="teraleib";
        this.price=hind;
    }

    public void addSupplement(int selectedSupplement){
        if(selectedSupplement!=0){
            this.addedSupplement.add(this.Supplement.get(selectedSupplement-1));
            this.price+=this.supplementPrice;
        }
    }

    public void setSupplements(double hind,String element1, String element2, String element3,String element4){
        this.supplementPrice=hind;
        this.Supplement.add(element1);
        this.Supplement.add(element2);
        this.Supplement.add(element3);
        this.Supplement.add(element4);
    }

    public StringBuilder getSupplements() {
        StringBuilder supplementString = new StringBuilder();
        int i = 1;
        for(String oneSupplement:this.Supplement){
            if(oneSupplement==this.Supplement.get(this.Supplement.size() - 1)){
                supplementString.append(i+".");
                supplementString.append(oneSupplement);
            }else{
                supplementString.append(i+".");
                supplementString.append(oneSupplement);
                supplementString.append("\n");
            }
            i++;
        }
        return supplementString;
    }

    public ArrayList getSupplementsArr(){
        return this.Supplement;
    }

    public ArrayList getAddedSupplementsArr(){
        return this.addedSupplement;
    }

    public StringBuilder getAddedSupplements(){
        StringBuilder addedSupplementString = new StringBuilder();
        for(String oneSupplement:this.addedSupplement){
            addedSupplementString.append(oneSupplement);
            if(oneSupplement!=this.addedSupplement.get(this.addedSupplement.size() - 1)){
                addedSupplementString.append(", ");
            }
        }
        return addedSupplementString;
    }

    public String getBurgerInfo() {
        return this.name + " sisaldab: " + this.meatType + ", " + this.breadType + ". Baas hind on: -" + this.price + ".\n Lisandite valik on:\n"+getSupplements() + "\n ühe lisandi hind on: -" +this.supplementPrice;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        if(this.addedSupplement.size()>0){
            return this.name + " with " + this.breadType + ", " + this.meatType + ", " + getAddedSupplements() +". Price:-"+df.format(this.price);
        }else{
            return this.name + " with " + this.breadType + ", " + this.meatType + ". Price:-"+ df.format(this.price);
        }
    }

}
