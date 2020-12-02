package Hamburger;

import java.util.ArrayList;

public class Supplement{
    private ArrayList<String> Supplement;
    private double supplementPrice;
    private ArrayList<String> addedSupplement;

    public Supplement(){
        Supplement = new ArrayList<>();
        addedSupplement = new ArrayList<>();

    }

    public void setSupplements(double hind,String element1, String element2, String element3,String element4){
        this.supplementPrice=hind;
        this.Supplement.add(element1);
        this.Supplement.add(element2);
        this.Supplement.add(element3);
        this.Supplement.add(element4);
    }

    public void addSupplement(int selectedSupplement){
        if(selectedSupplement!=0 && selectedSupplement<=this.Supplement.size()){
            this.addedSupplement.add(this.Supplement.get(selectedSupplement-1));
        }
    }

    public void setSupplementPrice(double supplementPrice) {
        this.supplementPrice = supplementPrice;
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

    public double getSupplementPrice() {
        return this.supplementPrice;
    }


    public double getSupplementTotal() {
        return addedSupplement.size()*supplementPrice;
    }
}
