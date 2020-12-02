package Hamburger;

import java.text.DecimalFormat;


public class Burger extends Supplement{
    private String name;
    private String meatType;
    private String breadType;
    private double price;
    public Supplement supplements;


    public Burger(String nimi, String lihaTüüp, String saiaTüüp, double hind){
        this.supplements = new Supplement();
        this.name=nimi;
        this.meatType=lihaTüüp;
        this.breadType=saiaTüüp;
        this.price=hind;
    }

    public Burger(String nimi, String lihaTüüp, double hind){
        this.supplements = new Supplement();
        this.name=nimi;
        this.meatType=lihaTüüp;
        this.breadType="teraleib";
        this.price=hind;
    }



    public String getBurgerInfo() {
        return this.name + " sisaldab: " + this.meatType + ", " + this.breadType + ". Baas hind on: -" + this.price + ".\n Lisandite valik on:\n" + getSupplements() + "\n ühe lisandi hind on: -" + getSupplementPrice();
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        if(getAddedSupplementsArr().size()>0){
            return this.name + " with " + this.breadType + ", " + this.meatType + ", " + getAddedSupplements() +". Price:-"+df.format(getTotal());
        }else{
            return this.name + " with " + this.breadType + ", " + this.meatType + ". Price:-"+ df.format(getTotal());
        }
    }


    public double getPrice() {
        return this.price;
    }


    public double getTotal() {
        return price+getSupplementTotal();
    }
}