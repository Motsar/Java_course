import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Burger> menu = new ArrayList<Burger>();
        Burger cheeseB = new Burger("Juustu burger", "veiseliha" ,"valge sai",2.55 );
        Burger chickenB = new Burger("Kana burger", "kanaliha" ,"valge sai",2.45 );
        Burger porkB = new Burger("Rebitudliha burger", "sealiha" ,2.75 );
        cheeseB.setSupplements(0.25,"peekon","kurk","sibul","BBQ kaste");
        chickenB.setSupplements(0.26,"juust","salat","tomat","majonees");
        porkB.setSupplements(0.23,"ananass","tomat","kurk","sibul");
        menu.add(cheeseB);
        menu.add(chickenB);
        menu.add(porkB);
        Scanner input = new Scanner(System.in);
        System.out.println("Tere tulemast Martini Burgerimaailma meie menüü");
        int index= 1;
        for(Burger menuItem : menu){
            System.out.println(index+"."+menuItem.getBurgerInfo());
            index+=1;
        }
        System.out.print("\n \n \n Valige purgeri menüü number mida soovite osta:");
        Integer valik = Integer.parseInt(input.nextLine());
        if(valik>0 || valik<=menu.size()){
            Burger chosenB = menu.get(valik-1);
            System.out.print("Sisestage burgeri lisandi number või null tellimuse lõpetamiseks!");
            Integer lisandiValik = Integer.parseInt(input.nextLine());
            if(lisandiValik>0 && lisandiValik<chosenB.getSupplementsArr().size()){
                chosenB.addSupplement(lisandiValik);
                while(true){
                    System.out.print("Sisestage burgeri lisandi number või null tellimuse lõpetamiseks!");
                    lisandiValik = Integer.parseInt(input.nextLine());
                    if(lisandiValik<=0){
                        break;
                    }else if(chosenB.getSupplementsArr().size()==chosenB.getAddedSupplementsArr().size()){
                        break;
                    }else if(lisandiValik>=chosenB.getSupplementsArr().size()){
                        break;
                    }
                    chosenB.addSupplement(lisandiValik);
                }
                chosenB.addSupplement(lisandiValik);
                System.out.println(chosenB);
            }else{
                System.out.println(chosenB);
            }
        }

    }


}

